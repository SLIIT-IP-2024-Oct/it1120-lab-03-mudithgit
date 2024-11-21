import java.util.Scanner;
public class IT24610813Lab3Q2 {
    public static void main(String[] args) {
           Scanner scanner=new Scanner(System.in);

        System.out.println("Input the monthly salary");
        double monthly_Salary = scanner.nextDouble();

        System.out.println("No of OT hours");
        double ot_hours=scanner.nextDouble();

        System.out.println("OT hourly rate");
        double ot_rate=scanner.nextDouble();

        double amount=(ot_hours*ot_rate)+monthly_Salary;


        System.out.println(amount);
        


        }
    }