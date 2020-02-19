import java.util.Scanner;

public class Minutes {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in seconds");
        int seconds = sc.nextInt();
        int minutes = seconds/60;
        int rest = seconds % 60;
        System.out.println(minutes + ":" + rest);
    }
    
}
