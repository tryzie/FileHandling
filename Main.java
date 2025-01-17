package readFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //buffer reader
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]), 1024);
            while ((line = reader.readLine())!= null ){
                System.out.println(line);

            }
            reader.close();
        } catch (IOException  e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println();


        //scanner reader
        try {
            Scanner scanner = new Scanner(new FileInputStream(args[0]));

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}