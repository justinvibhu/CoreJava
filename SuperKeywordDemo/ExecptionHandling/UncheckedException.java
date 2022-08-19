package ExecptionHandling;

import com.sun.source.doctree.SystemPropertyTree;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements:");
        try {
            for (int i = 0; i < a.length; i++)  {
                a[i]=sc.nextInt();

            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out of Bound ");
        }
        System.out.println("The Array Elements are :");
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
