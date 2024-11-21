import java.util.Scanner;
public class IT24610813Lab3Q3{
    public static void main(String[] args) {
               Scanner scanner=new Scanner (System.in);

               System.out.println("Enter your Amount=");
       int amount=scanner.nextInt();

int total1=amount/5000;
System.out.println("5000="+total1);

int total2=(amount-(total1*5000))/1000;
System.out.println("1000="+total2);

int total3=(amount-((total1*5000)+(total2*1000)))/500;
System.out.println("500="+total3);

int total4=(amount-((total1*5000)+(total2*1000)+(total3*500)))/200;
System.out.println("200="+total4);

int total5=(amount-((total1*5000)+(total2*1000)+(total3*500)+(total4*200)))/100;
System.out.println("100="+total5);

int total6=(amount-((total1*5000)+(total2*1000)+(total3*500)+(total4*200)+(total5*100)))/50;
System.out.println("50="+total6);

int total7=(amount-((total1*5000)+(total2*1000)+(total3*500)+(total4*200)+(total5*100)+(total6*50)))/20;
System.out.println("20="+total7);

int total8=(amount-((total1*5000)+(total2*1000)+(total3*500)+(total4*200)+(total5*100)+(total6*50)+(total7*20)))/10;
System.out.println("10="+total8);

int total9=(amount-((total1*5000)+(total2*1000)+(total3*500)+(total4*200)+(total5*100)+(total6*50)+(total7*20)+(total8*10)))/5;
System.out.println("5="+total9);

int total10=(amount-((total1*5000)+(total2*1000)+(total3*500)+(total4*200)+(total5*100)+(total6*50)+(total7*20)+(total8*10)+(total9*5)))/2;
System.out.println("2="+total10);

int total11=(amount-((total1*5000)+(total2*1000)+(total3*500)+(total4*200)+(total5*100)+(total6*50)+(total7*20)+(total8*10)+(total9*5)+(total10*2)))/1;
System.out.println("1="+total11);

    }
}