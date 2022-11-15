import java.util.ArrayList;
//import  java.util.*;

public class problem1 {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(60);
        System.out.println(list);
        System.out.println(list.get(2));

        list.set(2,45);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        list.add(2,35);

//        (Q.1) Given an arrayList of integers, find the no which
//        are div by both 5 and
//        7 and return them.




    }
}
