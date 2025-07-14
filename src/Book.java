public class Book {
    String title;
    String author;
    double price;

    Book() {
        this("Unknown title", "Unknown author", 0.0);
    }

    Book(String title) {
        this(title, "Unknown author", 0.0);
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Price Invalid. Show original price.");
        }
    }

    public void applyDiscount(double discount) {
        if (discount > 0 && discount < 100) {
            double discountedPrice = this.price - (this.price * discount * 0.01);
            if (discountedPrice >= 0) {
                this.price = discountedPrice;
                System.out.println("Discount: " + discount + "%");
                System.out.println("New price: " + this.price);
            } else {
                System.out.println("Invalid Price.");
            }
        } else {
            System.out.println("Invalid Discount.");
        }
    }
}