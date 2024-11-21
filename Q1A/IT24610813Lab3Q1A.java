
import java.util.Scanner;
public class IT24610813Lab3Q1A  {
    public static void main(String[] args) {
               Scanner scanner=new Scanner (System.in);
        System.out.println("Enter the number of kilograms");
        int num_kilo=scanner.nextInt();

        System.out.println("Enter 1KG price");
        int kg_price=scanner.nextInt();

        int total_price=(kg_price)*(num_kilo);
        System.out.println("Total Price="+total_price);
    }
}