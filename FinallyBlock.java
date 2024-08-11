import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter your Integer:");
            int num=sc.nextInt();
            int result=100/num;
            System.out.println("Result:" +result);
        }
        catch(ArithmeticException e){
            System.out.println("Caught an arithematic Exception" +e.getMessage());
        }
        catch (Exception e){
            System.out.println("Caught an Generic Exception" +e.getMessage());
        }
        finally {
            System.out.println("The division Operation is completed");
        }
    }
}
