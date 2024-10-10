public class Book1 {

    String title,author,genre;
    int yearPublished;
    double price;

    public Book1(){
        this.title = "Secret";
        this.author = "Sonam";
        this.genre = "Horror";
        this.yearPublished = 2021;
        this.price = 195.9;

    }

    public Book1(String title) {
        this.title = title;
    }

    public Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book1(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public Book1(String title, String author, String genre, int yearPublished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
    }

    public Book1(String title, String author, String genre, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public void printDetails(){
        System.out.println("The name of the book is :" +this. title);
        System.out.println("The author of the book is :" + author);
        System.out.println("The genre of the book is :" + genre);
        System.out.println("The year of the book is published :" + yearPublished);
        System.out.println("The price of the book is :" + price);
    }
}
