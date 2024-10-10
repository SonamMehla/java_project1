public class Book {
    private String title;
    private String author;
    public Book(){
    this("Unknown","Unknown");
     }
    public Book(String title){
        this(title,"Unknown");
    }
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }
    public void display(){
        System.out.println("Title: " + title + ", Author : " + author);
    }
}
