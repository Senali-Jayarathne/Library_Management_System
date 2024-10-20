public class Library {
    public static void main(String[] args) {
        Book.book = new Book("5816", "Everithing happens for a reason", "Mr.Shev Patt");

        System.out.println(Book.isbn_Num);
        System.out.println(Book.total_Books);
        System.out.println(Book.title);
        System.out.println(Book.author);

    }

}
