package Solution;

import static java.lang.System.out;

public class Solution
{
    public static void main(String[] args)
    {
        // Array to store camera brands
        String[] Brands = 
        {
            "CANON",
            "SONY",
            "NIKON"
        };
        
        // Number of brands
        int nums = Brands.length;
        
        // 2D array to store camera prices for Mirrorless and DSLR for each brand
        int[][] CameraTypePrice =
        {
            {10500, 8500},  // Prices for CANON: Mirrorless = 10500, DSLR = 8500
            {9500, 7200},   // Prices for SONY: Mirrorless = 9500, DSLR = 7200
            {12000, 8000}   // Prices for NIKON: Mirrorless = 12000, DSLR = 8000
        };
        
        // Printing header for the technology report
        out.print
        ("""
        --------------------------------------------
        CAMERA TECHNOLOGY REPORT
        --------------------------------------------
        \t\tMIRRORLESS\tDSLR
        """);
        
        // Loop through each brand and print its prices for both camera types
        for (int x = 0; x < nums; x++)
        {
            out.println(
                Brands[x] + "\t\tR " + CameraTypePrice[x][0] + "\t\tR " + CameraTypePrice[x][1]
            );
        }
        
        // Printing header for the results
        out.print
        ("""
        --------------------------------------------
        CAMERA TECHNOLOGY RESULTS
        --------------------------------------------
        """);
        
        // Variables to track the camera with the maximum price difference
        int totalDifference = 0;
        int maxDifference = Integer.MIN_VALUE;
        String maxBrand = "";
        int maxBrandIndex = -1;
        
        // Loop through each brand and calculate the price difference
        for (int y = 0; y < nums; y++)
        {
            // Calculate the price difference between Mirrorless and DSLR for the current brand
            totalDifference = CameraTypePrice[y][0] - CameraTypePrice[y][1];
            
            // Print the price difference for each brand, highlighting if the difference is significant
            if (totalDifference >= 2500)
            {
                // If the difference is greater than or equal to 2500, add a "***" symbol for emphasis
                out.println(
                    Brands[y] + "\t\tR " + totalDifference + "\t***"
                );
            }
            else
            {
                // Otherwise, just print the difference
                out.println(
                    Brands[y] + "\t\tR " + totalDifference
                );
            }
            
            // Track the brand with the maximum price difference
            if (totalDifference > maxDifference)
            {
                maxDifference = totalDifference;
                maxBrand = Brands[y];
                maxBrandIndex = y;
            }
        }
        
        // Output the brand with the maximum price difference and its index
        out.println(
            "\nCAMERA WITH THE MOST COST DIFFERENCE: " + maxBrand + 
            "\n--------------------------------------------"
        );
    }
}
