import java.util.Scanner;
public class IT24610813Lab3Q4{
    public static void main (String[] args){
        Scanner scanner=new Scanner (System.in);

        System.out.println("Enter your five digits number");
        int num=scanner.nextInt();
        int num1,num2,num3,num4,num5;

        num1=num/10000;
        int rest1=num%10000;
        System.out.print(num1+" ");

        num2=rest1/1000;
        int rest2=rest1%1000;
        System.out.print(num2+" ");

        num3=rest2/100;
        int rest3=rest2%100;
        System.out.print(num3+" ");

        num4=rest3/10;
        int rest4=rest3%10;
        System.out.print(num4+" ");
        
        System.out.print(rest4);
    }
}