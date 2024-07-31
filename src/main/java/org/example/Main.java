package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(1);
            list.add(2);


            Set<Integer> set = new HashSet<>(list);

            if (set.isEmpty()) {
                throw new IllegalArgumentException("The set is empty!");
            }


            int sum = 0;
            for (Integer i : set) {
                sum += i;
            }
            System.out.println("---Sum---");
            System.out.println(sum);

            int avg = 0;
            int sum2 = 0;
            for (Integer i : set) {
                avg++;
                sum2 += i;
            }

            if (avg == 0) {
                throw new ArithmeticException("cannot divide by zero!");
            }

            System.out.println("---Avg---");
            System.out.println(sum2 / avg);

            System.out.println("---Set---");
            System.out.println(set);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Caught indexoutofbounds" + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Caught illegalArguments" + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("caught arithemeticexception" + e.getMessage());
        }finally{
            System.out.println("\nthanks for running me!");
        }



    }
}