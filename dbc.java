import java.util.Scanner;
public class dbc 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal equivalent: " + decimal);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal equivalent: " + octal);
    }
}
