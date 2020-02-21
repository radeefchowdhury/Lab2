package name;

import java.util.Scanner;

public class name {
    /*This changes the name of the person removing the comma and putting upper case on the first letters*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name in the format: Last,First");
        String fullname = sc.nextLine();
        int index = fullname.indexOf(',');
        String lastname = fullname.substring(0,index);
        String firstname = fullname.substring(index,2);
        lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();
        firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
         System.out.println("Your full name is: " + firstname +  lastname);    
    }   
}
