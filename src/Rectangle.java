public class Rectangle {

    static class RectangleArea{

        int length;
        int width;

        public int area(int length, int width){

            return length*width;
        }
    }
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.length = 10;
        rectangle.width = 20;
        int area = rectangle.area(10,20);
        System.out.println(area);
    }
}
