import java.util.*;
public class Multiplication {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the Number : ");
        number = sc.nextInt();
        System.out.println("The Multiplication Table of the " + number + " is: ");
        for(int i = 1 ; i <= 10 ; i ++)
        {
            System.out.println(number*i);
        }
    }
}
