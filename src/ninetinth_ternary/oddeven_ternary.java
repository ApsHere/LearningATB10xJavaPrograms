package ninetinth_ternary;
/*calculate odd even num) using ternary*/

public class oddeven_ternary {
    public static void main(String [] args ){
     //int num=40; /*defined num=40 and also reading from CLI as 40 , not possible as cannot defined num twice
        String no=args[0];
        int num=Integer.parseInt(no);

    String Result= (num%2)==0?"Number is even":"Number is odd";
    System.out.println(Result);
    }
}
