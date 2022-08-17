package ExecptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String args[]){
        int arr[] = new int[10];
        System.out.println("Enter the Elements : ");
        int i=0;
        while(true){
            try {
                Scanner sc = new Scanner(System.in);
                arr[i] = sc.nextInt();
                i++;
            }
            catch(InputMismatchException e){
                System.out.println("Please Enter Valid Elements");
                continue;
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Index OutOfBound Error.");
                break;
            }

        }
    }
}
