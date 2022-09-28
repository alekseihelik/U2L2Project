import java.util.Scanner;
public class U2L2Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many pieces of lumber do you need for the home you are building?");
        int lumber = s.nextInt();
        System.out.print("How many windows do you need?");
        int windows = s.nextInt();
        System.out.print("What is the tax rate in your area?");
        double taxRate = s.nextDouble();
        ConstructionPricer prices = new ConstructionPricer(11.50, 25.75, taxRate);
        System.out.println("Total Materials Cost: $" + prices.materialsCost(lumber, windows));
        System.out.println("Grand Total after Tax: $" + prices.totalWithTax(prices.materialsCost(lumber, windows)));
    }
}
