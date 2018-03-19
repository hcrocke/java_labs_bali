package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.*;

public class Exercise_02 {

    public static void main(String[] args) {

        int i;
        String path = "/Users/hannahcrocker/Documents/CodingNomads/Labs/java_labs_bali/part_09/File1";
        String pathOut = "/Users/hannahcrocker/Documents/CodingNomads/Labs/java_labs_bali/part_09/File2";
        BufferedInputStream input = null;
        BufferedOutputStream output = null;

        try {
             input = new BufferedInputStream(new FileInputStream(path));
             output = new BufferedOutputStream(new FileOutputStream(pathOut));

            do {
                i = input.read();
                if(i != -1) {
                    output.write(i);
                }
            } while(i != -1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println("Error closing file.");
        }
    }
}
