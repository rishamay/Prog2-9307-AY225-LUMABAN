import java.io.*;
import java.util.*;

public class CustomerSegmentation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        File file;

        while (true) {
            System.out.print("Enter dataset file path: ");
            String path = input.nextLine();

            file = new File(path);

            if (file.exists() && file.isFile() && path.endsWith(".csv")) {
                break;
            } else {
                System.out.println("Invalid file path. Please try again.");
            }
        }

        List<DataRecord> platinum = new ArrayList<>();
        List<DataRecord> gold = new ArrayList<>();
        List<DataRecord> silver = new ArrayList<>();
        List<DataRecord> bronze = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String title = data[1];
                double sales = 0;

                try {
                    sales = Double.parseDouble(data[7]);
                } catch (Exception e) {
                    continue;
                }

                DataRecord record = new DataRecord(title, sales);

                if (sales > 100000) {
                    platinum.add(record);
                } 
                else if (sales >= 50000) {
                    gold.add(record);
                } 
                else if (sales >= 10000) {
                    silver.add(record);
                } 
                else {
                    bronze.add(record);
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
System.out.println("\n===== CUSTOMER SEGMENTATION =====");

System.out.println("Platinum Customers: " + platinum.size());
System.out.println("Gold Customers: " + gold.size());
System.out.println("Silver Customers: " + silver.size());
System.out.println("Bronze Customers: " + bronze.size());
    }
}