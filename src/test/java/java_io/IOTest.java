package java_io;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        String[] list = {"Yuliya","Artsiom", "Nastya"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String s : list){
                writer.write( s + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
