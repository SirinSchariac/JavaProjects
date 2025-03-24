package Project1.pkg.basic;

import java.util.Scanner;;

public class PrimeCheck {
    public static void main(String[] args) {
        try(Scanner myScanner = new Scanner(System.in))
        {
            System.out.println("Input the number to check : ");
            int num = myScanner.nextInt();

            System.out.println(IsPrime(num));
        }
    }

    public static boolean IsPrime(int num)
    {

        if(num <= 1)
        {
            return false;
        }
        
        for(int i = 2; i < (int)Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
