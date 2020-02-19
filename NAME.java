
package name;

import java.util.Scanner;

public class name {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();
        lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();
        firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
         System.out.println("Your full name is: " + firstname +  lastname);
         
        
    }
    
}
