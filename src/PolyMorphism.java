class Parent{
    void display(){
        System.out.println("Display Parent Details");
    }
}

class Child extends Parent{
    @Override
    void display(){
        System.out.println("Display Child Details");
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
        // Runtimme or Method Overriding
        Parent obj = new Parent();
        obj.display();
        obj = new Child();
        obj.display();
    }

}
