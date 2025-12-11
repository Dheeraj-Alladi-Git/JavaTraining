package objects;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter the name of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);
        book.display();
    }
}
