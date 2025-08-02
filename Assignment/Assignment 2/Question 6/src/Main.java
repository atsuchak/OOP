import java.io.*;

class InvalidPriceException extends Exception {
    public InvalidPriceException(String string) {
        super(string);
    }
}

class TotalUnitSoldMinimumBoundException extends Exception {
    public TotalUnitSoldMinimumBoundException(String string) {
        super(string);
    }
}

class TotalUnitSoldMaximumBoundException extends Exception {
    public TotalUnitSoldMaximumBoundException(String string) {
        super(string);
    }
}

public class Main {
    public static void main(String[] args) {
        File annual = new File("src\\AnnualSell.txt");
        File profit = new File("src\\Profit.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(annual));
            BufferedWriter bw = new BufferedWriter(new FileWriter(profit));
            try {
                bw.write("Item\tProfit");
                bw.newLine();
                br.readLine();

                String line;
                String maxPforitItem = "";
                double totalProfit = 0;
                double maxProfit = Double.MIN_VALUE;

                while ((line = br.readLine()) != null) {
                    try {
                        String[] parts = line.split("\\s+");
                        String item = parts[0];
                        double unitCost = Double.parseDouble(parts[1]);
                        double unitPrice = Double.parseDouble(parts[2]);
                        double totalSold = Double.parseDouble(parts[3]);

                        if(unitPrice < 0) throw new InvalidPriceException("Invalid Price Exception");
                        if(totalSold < 0) throw new TotalUnitSoldMinimumBoundException("Minimum sold exception");
                        if(totalSold > 1000) throw new TotalUnitSoldMaximumBoundException("Maximum sold exception");

                        double itemProfit = (unitPrice - unitCost) * totalSold;
                        totalProfit += itemProfit;
                        if(itemProfit > maxProfit) {
                            maxProfit = itemProfit;
                            maxPforitItem = item;
                        }

                        bw.write(item+ "\t" +itemProfit);
                        bw.newLine();
                    }catch (InvalidPriceException | TotalUnitSoldMinimumBoundException | TotalUnitSoldMaximumBoundException | NumberFormatException e) {
                        System.out.println("Found Exception " +e);
                    }
                }
                bw.write("Total Profit: " +totalProfit);
                bw.newLine();
                bw.write("Max Profit item: " + maxPforitItem);
            }finally{
                br.close();
                bw.close();
                System.out.println("File closed successfully");
            }
        }catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
