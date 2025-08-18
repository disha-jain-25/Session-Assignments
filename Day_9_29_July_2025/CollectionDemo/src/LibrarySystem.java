import java.util.*;

class Book {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }


    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class Library {
    private final Map<String, List<Book>> genreBookMap;

    public Library() {
        genreBookMap = new HashMap<>();
    }

    public void addBook(String genre, Book book) {
        genreBookMap.computeIfAbsent(genre, k -> new ArrayList<>()).add(book);
    }

    public void listAllBooks() {
        if (genreBookMap.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (String genre : genreBookMap.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : genreBookMap.get(genre)) {
                System.out.println("  " + book);
            }
        }
    }

    public void listBooksByGenre(String genre) {
        List<Book> books = genreBookMap.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("No books found in genre: " + genre);
        } else {
            System.out.println("Books in genre: " + genre);
            for (Book book : books) {
                System.out.println("  " + book);
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. List All Books");
            System.out.println("3. List Books by Genre");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book book = new Book(title, author, isbn);
                    library.addBook(genre, book);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    library.listAllBooks();
                    break;

                case 3:
                    System.out.print("Enter genre to search: ");
                    String searchGenre = scanner.nextLine();
                    library.listBooksByGenre(searchGenre);
                    break;

                case 4:
                    System.out.println("Exiting Library System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
