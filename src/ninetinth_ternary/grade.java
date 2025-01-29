package ninetinth_ternary;

public class grade {

/*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59*/

    public static void main (String[] args) {
       System.out.println( "This is a program for deciding Grade as per marks:");
        int x=4;
        String marks= (x>0 && x<=59) ? "Grade F":
                (x>=60 && x<=69) ? "Grade D" :
                        (x>=70 && x<=79) ?"Grade C":
                                (x>=80 && x<=89) ? "Grade B" :
                                        (x>=90 && x<=100) ? "Grade A wow!":
                                                "Not possible"
                ;

        System.out.println( marks);

    }
}
