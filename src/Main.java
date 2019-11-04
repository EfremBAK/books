public class Main {

    public static void main(String [] args){

        Book myBook = new Book();
//        Book urbook = new Book
        myBook.setAuthor("Mark Twain");
        myBook.setBookTitle("Oliver Twist");
        myBook.setDescription("the life of an orphan kid");
        myBook.setInStock(true);
        myBook.setPrice(29.99);

      myBook.isInStock();

        System.out.println(myBook.getDisplayedText());
    }
}
