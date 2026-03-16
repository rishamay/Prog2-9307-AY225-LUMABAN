// MP15 - Export first 50 rows of CSV to new file

import java.io.*;
import java.util.*;

public class MP15_ExportRows {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter CSV file path: ");
            String inputPath = scanner.nextLine();

            System.out.print("Enter output CSV file name: ");
            String outputPath = scanner.nextLine();

            try {
                BufferedReader br = new BufferedReader(new FileReader(inputPath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath));

                String line;
                int count = 0;

                while ((line = br.readLine()) != null && count < 50) {
                    bw.write(line);
                    bw.newLine();
                    count++;
                }

                br.close();
                bw.close();

                System.out.println("\nFirst 50 rows exported successfully.");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Program Finished.");
        } finally {
            scanner.close();
        }
    }
}