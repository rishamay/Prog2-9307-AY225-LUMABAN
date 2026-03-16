// MP13 - Detect rows with missing values in a CSV file

import java.io.*;
import java.util.*;

public class MP13_MissingValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CSV file path (or press Enter for Sample_Data-Prog-2-csv.csv): ");
        String filePath = scanner.nextLine().trim();

        if (filePath.isEmpty()) {
            filePath = "Sample_Data-Prog-2-csv.csv";
            System.out.println("Using default file path: " + filePath);
        }

        File csvFile = new File(filePath);
        if (!csvFile.exists() || !csvFile.isFile()) {
            System.out.println("Error: File does not exist or is not a file: " + filePath);
            scanner.close();
            return;
        }

        int rowNumber = 0;
        boolean foundMissing = false;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            System.out.println("\nRows with missing values:");

            String line;
            while ((line = br.readLine()) != null) {
                rowNumber++;
                if (line.trim().isEmpty()) {
                    continue; // skip empty lines
                }

                String[] values = line.split(",", -1); // preserve empty fields
                boolean missing = false;

                for (String value : values) {
                    if (value.trim().isEmpty()) {
                        missing = true;
                        break;
                    }
                }

                if (missing) {
                    foundMissing = true;
                    System.out.println("Row " + rowNumber + ": " + line);
                }
            }

            if (!foundMissing) {
                System.out.println("No rows with missing values found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("\nProgram Finished.");
        scanner.close();
    }
}