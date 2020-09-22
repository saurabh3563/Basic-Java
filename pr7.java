import java.util.Scanner;

public class pr7{

    public static void main(String[] args) 
{

        double dollars;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter dollars:");

        dollars = in.nextLong();

        double rupees = dollars * 72.25;

        System.out.println(rupees + " Rupees");

    }
}