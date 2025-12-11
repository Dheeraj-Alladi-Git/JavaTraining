import java.util.Scanner;

public class Grade {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double grade = sc.nextDouble();

            if(grade >= 90 && grade <= 100){
                System.out.println("The Grade is A");
            }
            else if(grade >= 80 && grade < 90){
                System.out.println("The Grade is B");
            }
            else if(grade >= 70 && grade < 80){
                System.out.println("The Grade is C");
            }
            else if(grade >= 60 && grade < 70){
                System.out.println("The Grade is D");
            }
            else if(grade < 60){
                System.out.println("The Grade is F");
            }

        }

}
