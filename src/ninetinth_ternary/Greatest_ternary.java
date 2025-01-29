package ninetinth_ternary;
//Finding greatest number from three number where input take taken Console

public class Greatest_ternary {
    public static void main(String[] args){
        //int a;
        //int b;
        //int c;
        String A=args[0];
        String B=args[1];
        String C=args[2];
        int a= Integer.parseInt(A);
        int b= Integer.parseInt(B);
        int c= Integer.parseInt(C);

      String Result= a>b?a>c?"A is largest" :"C is largest":b>c?"B is largest":a-b==b-c?"All three are equals":"C is the largest";
       // String Result= a>b?a>c?"A is largest" :"C is largest":b>c?"B is largest":a==b==c?"All three are equals":"C is the largest";
      //a==b==c wont work as a==b is true and you cannot compare true with C further that is true==c, JDK will give exception
        System.out.println(Result) ; //if want to print the largest ?
    }
}
