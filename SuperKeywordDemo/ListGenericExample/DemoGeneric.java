package ListGenericExample;

import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args) {
        List<String> l= new ArrayList<String>();
        l.add("Hello");
        l.add("Hello World");
        l.add("Hello World, I am new baring baby");

        for (String s: l) {
            System.out.println("String is :"+ s);

        }
    }
}
