//package ExecptionHandling;
//
//import javax.crypto.AEADBadTagException;
//import java.lang.reflect.Parameter;
//import java.util.InputMismatchException;
//import java.util.MissingFormatArgumentException;
//import java.util.Scanner;
//import java.util.concurrent.LinkedBlockingDeque;
//
//public class ExceptionDemo2 {
//    static int a[] =new int[10];
//    public static void main(String[] args) {
//
//
//        try {
//            reaArray();
//        }
//        catch (InputMismatchException e){
//            System.out.println("Please enter the Elements:");
//            try {
//                reaArray();
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("IndexOutOfBound Exception");
//
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("IndexOutOfBound Exception");
//        }
//    }
//
//    private static void reaArray() {
//        System.out.println("Enter the element in array");
//        int i=0;
//        while(true){
//            if(a[i]!=(int) a[i]){
//                throw new InputMismatchException();
//            }
//            if(i>a.length-1){
//                throw new ArrayIndexOutOfBoundsException();
//            }
//            Scanner sc =new Scanner(System.in);
//            a[i]=sc.nextInt();
//        }
//    }
//}
