import java.util.*;

public class VotingAge {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the Age of the person : ");
        age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("User is old enough to vote in a National Election.");
        }
        else {
            System.out.println("User cannot vote in a National Election!");
        }
    }
}
