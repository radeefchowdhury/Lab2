import java.util.Scanner;
import java.lang.Math;

public class bmi {
/* This program calculates your bmi using your pounds transformed into kg and your height in foot converted into meters*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter your weight in pounds");
       double weightpounds = sc.nextDouble();
       
       System.out.println("Enter your height in feets");
       double heightfeets = sc.nextDouble();
       
        final double kilograms = weightpounds / 2.2046;
        final double meters = heightfeets / 3.2808;
        double bmi = kilograms/(Math.pow(meters,2));
        System.out.println("Your BMI is " + bmi);
    }
    
}
