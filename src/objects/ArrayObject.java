package objects;

import java.util.Scanner;

public class ArrayObject {

    static class Book{
        double price;
        String title;

        //Default Constructor
        public Book(){
            price = 0.0;
            title = "unknown";
        }

        public Book(String inputTitle, double inputPrice){
            title = inputTitle;
            price = inputPrice;
        }

        public void display(){
            System.out.println("Book Title: " + title + ",  Price: $ " + price);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[5];

        for(int i = 0; i < books.length; i++){
            int bookNum = i+1;
            System.out.print(bookNum + ". Enter the book title :");
            String bookTitle = input.nextLine();
            System.out.print("   Enter the book price : $ ");
            double bookPrice = input.nextDouble();
            input.nextLine();
            books[i] = new Book(bookTitle, bookPrice);

        }

        for(Book bk : books){
            bk.display();
        }


    }
}
