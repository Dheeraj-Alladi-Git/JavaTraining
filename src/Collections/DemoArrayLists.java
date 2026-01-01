package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //Insertion
        list.add(45);
        list.add(3);
        list.add(12);
        list.add(43);
        list.add(23);
        list.add(32);

        //Enhanced for loop
        System.out.println("=========Enhanced For Loop=========");
        for(Integer k : list){
            System.out.println(k);
        }

        // for student,employee or any larger objects use iterator
        Iterator<Integer> iterator = list.iterator();
        System.out.println("=========Iterator=========");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Contains
        System.out.println(list.contains(45));
    }
}
