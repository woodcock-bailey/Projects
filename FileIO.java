
/**
 * 
 * Author: Bailey Woodcock
 * Date last modified: May 10, 2026
 * 
 */

import java.io.*;
import java.text.DecimalFormat;

public class FileIO {

    public static void main(String[] args) {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        DecimalFormat moneyFormat = new DecimalFormat("$0.00");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            // Add headings to the output file
            bw.write("Employee,Pay Rate,Hours Worked,Weekly Pay");
            bw.newLine();

            String line;

            while ((line = br.readLine()) != null) {

                // Split up the CSV data
                String[] values = line.split(",");

                String employee = values[0];
                double payRate = Double.parseDouble(values[1]);
                double hoursWorked = Double.parseDouble(values[2]);

                double weeklyPay;

                // Calculate the regular pay and the overtime pay
                if (hoursWorked > 40) {
                    double overtimeHours = hoursWorked - 40;
                    weeklyPay = (40 * payRate) + (overtimeHours * payRate * 1.5);
                }
                else {
                    weeklyPay = hoursWorked * payRate;
                }

                // Format weekly pay
                String formattedPay = moneyFormat.format(weeklyPay);

                // Create output line
                String outputLine = employee + "," + payRate + "," +
                        hoursWorked + "," + formattedPay;

                // Write line to output file
                bw.write(outputLine);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Output file created successfully.");

        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Number conversion error: " + e.getMessage());
        }
    }
}

