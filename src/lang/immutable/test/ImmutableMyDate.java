package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }

    // 기존 값을 변경하지 않고 유지할때에는 관례상 set 이 아닌 with를 사용한다.
    // 파라미터로 받은 값이 없으면 필드에서 해당 변수를 찾으므로 this.을 붙여줄 필요가 없다.

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
