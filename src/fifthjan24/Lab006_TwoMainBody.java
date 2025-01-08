package fifthjan24;

public class Lab006_TwoMainBody {
    public static void main(String args[]){
        System.out.println("this is first main method");
    }
  /*  public static void main(String secargs[]){
        System.out.println("this is second main method"); //2 main class not possible irrespective of args
    }*/
  public static void main2(String secargs[]) {
      System.out.println("this is second main method");
  }  //THe sec one will never get executed
}
