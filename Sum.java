import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) 
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of "+num1+" and "+num2+" is: "+sum);

        
    }
}