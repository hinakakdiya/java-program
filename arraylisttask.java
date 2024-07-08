 // Create multiple ArrayLists[[],[],[],[]]
 import java.util.*;

public class arraylisttask {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
       
        //one space allocated 
        x.add(new ArrayList<Integer>());

        x.get(0).add(0,3); //new array.------>

        x.add(1,new ArrayList<Integer>(Arrays.asList(12,14,16))); //new array.------>

        x.get(1).add(0,366); //add element.

        x.get(1).add(4,576); //EX = 4 num index per 576 add karya.

        x.add(2,new ArrayList<Integer>(Arrays.asList(18,20,22))); //new array.------>

        x.get(2).add(3,300); //add element.

        x.add(3,new ArrayList<>(Arrays.asList(3,84))); //new array.------>

        x.add(4,new ArrayList<Integer>(Arrays.asList(45,65,85))); //new array.------>

        System.out.println(x);
    }
}

    

