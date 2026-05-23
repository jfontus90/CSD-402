/**
 * Name: Jasmine Fontus
 * Course: CSD-402
 * Module: 9
 * Assignment: File Handling Program
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        try {

            File file = new File("data.file");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file, true);

            Random random = new Random();

            for (int i = 0; i < 10; i++) {

                int number = random.nextInt(100);

                writer.write(number + " ");
            }

            writer.write("\n");

            writer.close();

            System.out.println("Random numbers written to file.\n");

            Scanner reader = new Scanner(file);

            System.out.println("File Contents:");

            while (reader.hasNextLine()) {

                String line = reader.nextLine();

                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("An error occurred.");

            e.printStackTrace();
        }
    }
}