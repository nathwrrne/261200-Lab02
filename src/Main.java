//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Book 1","Natthawan",5.0);
        myBook.displayDetails();
        Book ourBook = new Book("Our Book");

        ourBook.displayDetails();
        ourBook.updatePrice(-100.0);
        ourBook.displayDetails();

        //starts the program here

        System.out.println("===============================================");

        Book unknownBook = new Book();
        unknownBook.displayDetails();


        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00); //original price is 350
        hp1Book.updatePrice(32000.00); //edit price to check if the function work
        hp1Book.displayDetails();
        hp1Book.applyDiscount(40);

    }
}

