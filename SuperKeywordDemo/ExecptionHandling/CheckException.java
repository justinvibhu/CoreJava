package ExecptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckException {
    public static void main(String[] args) {
        SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
        Date dt;
        try{
            dt= format.parse("24/10/2000");
            System.out.println(dt);
        } catch (ParseException p) {
            p.printStackTrace();
        }
    }
}
