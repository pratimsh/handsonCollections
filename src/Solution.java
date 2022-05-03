import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args)
    {

        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(15);

        // use add() method to add elements in the list
        boolean value = arrlist.add(15);
        System.out.println("Returned Value = " + value);
        arrlist.add(20);
        arrlist.add(25);
        arrlist.add(20);
        arrlist.add(25);
        arrlist.add(5);
        arrlist.add(2);
        boolean value2 = arrlist.remove(new Integer(2));
        System.out.println("Returned Value = " + value2);

        // prints all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
        Iterator itr = arrlist.iterator();

        // Holds true till there is single element
        // remaining in the object
        while (itr.hasNext()) {

            // Remove elements smaller than 10 using
            // Iterator.remove()
            int x = (Integer)itr.next();
            if (x < 10)
                itr.remove();
        }
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
    }
}