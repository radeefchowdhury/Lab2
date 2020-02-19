import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius in the past 3 days");
        double temp1 = sc.nextDouble();
        double temp2 = sc.nextDouble();
        double temp3 = sc.nextDouble();
        
        double average = (temp1+temp2+temp3)/3;
        System.out.println("The average temperature in the past 3 days was : " + average + " degree celsius");
    }
    
}
