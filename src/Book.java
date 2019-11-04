public class Book extends Main{

    //variables
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //default constructor
    public Book() {
    }

    //overloaded constructor
    public Book(String bookTitle, String author, String description, double price, boolean isInStock) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    // getters
    public String getBookTitle(){
        return bookTitle;
    }
    public String getAuthor(){
        return author;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    //setters
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setInStock(boolean isInStock){
        this.isInStock = isInStock;
    }

    public String getDisplayedText(){
        return  (this.getBookTitle() + " was written by " + this.getAuthor() + ". You can get it @ $" + this.getPrice()
                + ". It is about " + this.getDescription()) ;

    }
}
