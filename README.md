# CameraTechReport

A Java-based program that generates a **Camera Technology Report** comparing prices of **Mirrorless** and **DSLR** cameras across three major camera brands: **Canon**, **Sony**, and **Nikon**. The program also calculates the price differences between the two camera types for each brand and highlights brands with significant price variations.

## Features

- Displays a report of camera prices for **Mirrorless** and **DSLR** models from **Canon**, **Sony**, and **Nikon**.
- Calculates and prints the **price difference** between Mirrorless and DSLR cameras for each brand.
- Highlights the brands with a price difference of **R 2500 or more**.
- Identifies the brand with the **largest price difference** between the two camera types.

## Project Overview

### 1. Camera Technology Report
The report includes a detailed table of camera prices for each brand:

| Brand  | Mirrorless Price | DSLR Price |
|--------|------------------|------------|
| Canon  | R 10500          | R 8500     |
| Sony   | R 9500           | R 7200     |
| Nikon  | R 12000          | R 8000     |

### 2. Price Difference Calculation
For each brand, the program calculates the difference between the **Mirrorless** and **DSLR** prices:

- **Canon**: R 10500 - R 8500 = **R 2000**
- **Sony**: R 9500 - R 7200 = **R 2300**
- **Nikon**: R 12000 - R 8000 = **R 4000**

If the price difference is greater than or equal to R 2500, a **highlight** (`***`) is added next to the result.

### 3. Most Costly Brand
The program also tracks the brand with the largest price difference between Mirrorless and DSLR models.

## Requirements

- **Java 8** or later
- IDE like **IntelliJ IDEA** or **Eclipse** (or any text editor + terminal)
  
## Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/HChristopherNaoyuki/camera-tech-report.git
   ```

2. Navigate to the project directory:

   ```bash
   cd CameraTechReport
   ```

3. Compile the Java program:

   ```bash
   javac Solution.java
   ```

4. Run the program:

   ```bash
   java Solution
   ```

## Example Output

```
--------------------------------------------
CAMERA TECHNOLOGY REPORT
--------------------------------------------
		    MIRRORLESS	DSLR
CANON		R 10500		  R 8500
SONY		R 9500		  R 7200
NIKON		R 12000		  R 8000

--------------------------------------------
CAMERA TECHNOLOGY RESULTS
--------------------------------------------
CANON		R 2000
SONY		R 2300
NIKON		R 4000		***

CAMERA WITH THE MOST COST DIFFERENCE: NIKON
--------------------------------------------
```
