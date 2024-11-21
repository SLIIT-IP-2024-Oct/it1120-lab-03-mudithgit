import java.util.Scanner;
public class IT24610813Lab3Q1B {
    public static void main(String[] args) {
           Scanner scanner=new Scanner(System.in);

       System.out.println("Enter your total amount of bill=");
       int tot_amount=scanner.nextInt();

       double last_amount=tot_amount*0.9;
       System.out.println("Last Amount =" +last_amount);


        }
    }