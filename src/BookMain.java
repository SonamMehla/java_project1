public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("the  witch");
        Book b3 = new Book("Snow Ghost" , "Sonam");

        b1.display();
        b2.display();
        b3.display();
    }
}
