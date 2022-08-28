package FileIOBasics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.function.DoubleToIntFunction;

public class BuffferedStream {
    public static void main(String[] args) {
        try {
            String content="This is my first Line of Java";
            File file = new File("test.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw =new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw =new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("Done!");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
