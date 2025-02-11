package ThirtyJan;
import java.util.Scanner;
public class CharCheck {
    public static void main(String[] args)
    {
        System.out.println("Enter input:");
        Scanner sc= new Scanner(System.in);
        char x= sc.next().charAt(0);
        //char y= sc.next().charAt(1);
        if((x>='a' && x<='z') || (x>='A' && x<='Z'))
        {
            System.out.println(x+ " is a Alphabet");
        }
        else
            System.out.println("Its is not a Alphabet");

    }
}
