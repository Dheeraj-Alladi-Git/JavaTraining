package Collections.DemoArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEmployee {
    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<>();

        employee.add("Dheeraj");
        employee.add("Rahul");
        employee.add("Sowmya");
        employee.add("Vamshi");

        System.out.println(employee);

        Collections.sort(employee, Collections.reverseOrder());
    }
}

/* Interview Question
1. why is ArrayList better than Arrays?\
-> It provides Dynamic allocation, in Arrayliost we can use methods created by collections
    using built in methods, in Array supports only pimitive types.

2. LinkedList vs Arraylist
 */
