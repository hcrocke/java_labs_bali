package part_09;

import java.io.*;

/**
 *  Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 *  7. Copy text file, convert all spaces into hyphens. Use the byte stream file classes.
 *     Use traditional approach to closing a file by explicitly calling close().
 *  8. Rewrite using character stream classes.
 *

    Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
class CopyFile {
    public static void main(String args[])
    {
        String in = "/Users/hannahcrocker/Documents/CodingNomads/Labs/java_labs_bali/part_09/File1";
        String out = "/Users/hannahcrocker/Documents/CodingNomads/Labs/java_labs_bali/part_09/File2";

        int i;
        FileReader fin = null;
        FileWriter fout = null;

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileReader(in);
            fout = new FileWriter(out);

            do {
                i = fin.read();
                if(i != -1) {
                    if (i == ' ') {
                        i = '~';
                    }
                    fout.write(i);
                }
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}