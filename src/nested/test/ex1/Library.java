package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int number) {
        books = new Book[number];
        bookCount = 0;
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].toString());
        }
    }

    public void addBook(String name, String author) {
        //검증 로직을 다 처리하고
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        //정상 로직을 처리
        books[bookCount++] = new Book(name, author);
    }

    private static class Book {
        private String title;
        private String author;

        private Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목: " + title +
                    ", 저자: " + author;
        }
    }
}
