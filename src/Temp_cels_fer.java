import java.util.Scanner;

public class Temp_cels_fer {

    public static void main (String []args){

        System.out.println("this code is for converting temp cels to fern");

        Scanner input = new Scanner(System.in);

        System.out.println("tame celsius ma input aapo");
        float tempC = input.nextInt();
        float tempF = (tempC * (9/5)) + 32;
        System.out.println(tempF);


    }
}
