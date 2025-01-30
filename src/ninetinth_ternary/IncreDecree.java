package ninetinth_ternary;
/*increement and decreement*/

public class IncreDecree {
    public static void main(String [] args){
        int a=10;
        int b=20;
        int x= ++a;
        int y= a;
        int z= a++;
        int l=--b;
        int m=b;
        int n=b--;
        //System.out.println(x,y,z);
        System.out.printf("++a is %d ,a is %d,a++ is %d\n",x,y,z);
        System.out.printf("++a is %d ,a is %d,a++ is %d\n",++a,a,a++);
        System.out.println();//adding new line
        System.out.printf("The new value of a is %d",a);
        System.out.printf("--b is %d ,b is %d,b-- is %d\n",--b,b,b--);
        System.out.printf("--b is %d ,b is %d,b-- is %d\n",l,m,n);
        System.out.printf("The new value of b is %d",b); //wil priny new value of b
        /*++a is 11 ,a is 11,a++ is 11
--b is 17 ,b is 17,b-- is 17
--b is 19 ,b is 19,b-- is 19

        How - int a = 10;
int b = 20;
int x = ++a; // Pre-increment: a becomes 11, x = 11
int y = a;   // y = 11 (a remains 11)
int z = a++; // Post-increment: z = 11, a becomes 12

int l = --b; // Pre-decrement: b becomes 19, l = 19
int m = b;   // m = 19 (b remains 19)
int n = b--; // Post-decrement: n = 19, b becomes 18
1
Let's analyze the code step by step.

Given declarations:
java
Copy
Edit
int a = 10;
int b = 20;
int x = ++a; // Pre-increment: a becomes 11, x = 11
int y = a;   // y = 11 (a remains 11)
int z = a++; // Post-increment: z = 11, a becomes 12

int l = --b; // Pre-decrement: b becomes 19, l = 19
int m = b;   // m = 19 (b remains 19)
int n = b--; // Post-decrement: n = 19, b becomes 18
First printf statement:
System.out.printf("++a is %d ,a is %d,a++ is %d\n", x, y, z);
Since x = 11, y = 11, and z = 11, this prints:
++a is 11 ,a is 11,a++ is 11
At this point, a = 12 (from previous increments).

++a → a becomes 13 and returns 13
a → now 13
a++ → returns 13, but a becomes 14
output ++a is 13 ,a is 13,a++ is 13
At this point, b = 18 (from previous decrements).

--b → b becomes 17 and returns 17
b → now 17
b-- → returns 17, but b becomes 16
output --b is 17 ,b is 17,b-- is 17
fourth printf statement
System.out.printf("--b is %d ,b is %d,b-- is %d", l, m, n);
Since l = 19, m = 19, n = 19,
         */

    }
}
