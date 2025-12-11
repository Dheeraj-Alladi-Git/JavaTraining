public class ClassExample {
    static class Book{
        String title;
        String author;
        double price;

    }
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "Core Java";
        book1.author = "Dheeraj";
        book1.price = 20.5;

        System.out.println("Title : "+book1.title + " \nAuthor : " + book1.author + "\nPrice : $ " + book1.price+"\n");

        Book book2 = new Book();

        book2.title = "Spring Boot Guide";
        book2.author = "Lokesh";
        book2.price = 50.0;

        System.out.println("Title : "+book2.title + " \nAuthor : " + book2.author + "\nPrice : $ " + book2.price);

    }
}
