package ninetinth_ternary;

import java.sql.SQLOutput;

public class NameAgeSalary {
    public static void main(String args[]) {
        System.out.println("***Accept Name Age salary and print");
        String name=args[0];
        String Age=args[1];
        String Salary=args[2];
        int agee= Integer.parseInt(Age);
        System.out.println("Name " +name +""+" Age " +agee +""+ " Salary " +Salary);
        //System.out.println("Name" +name +""+"Age" +agee +""+ "Salary" +Salary);because space os not inside quote


    }
}
