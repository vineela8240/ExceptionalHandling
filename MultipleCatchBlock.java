import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the first Integer:");
            int num1=sc.nextInt();
            System.out.println("Enter the second Integer:");
            int num2=sc.nextInt();
            int result=num1/num2;
            System.out.println(num1+ "divided by" +num2+ "is" +result);
        }
        catch (ArithmeticException e){
            System.out.println("Error:Division by zero is not allowed");
        }
        catch (Exception e){
            System.out.println("Error: InvalidInput. Please enter the valid integers");
        }
        finally{
            sc.close();
        }
    }

}
