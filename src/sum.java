import java.util.Scanner;

public class sum {

    public static void main (String args []){

        System.out.println("------------------------------ This code is for sum of two number----------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("please input your number a ");
         int a = input.nextInt();

        System.out.println("please input your number b ");
         int b = input.nextInt();


       // int a = 5 ;
       // int b = 9 ;

        //this line is for sum operation
        int sum = a + b ;

        System.out.println( "Sum is equal to : " + sum);

        //this line is for product operation
        int product = a * b ;
        System.out.println("product is equal to :" + product );

        int divider = a/b;
        System.out.println("divider is equal to : "+ divider );

        int minus = a - b;
        System.out.println("minus  is equal to : "+ minus  );




    }

}
