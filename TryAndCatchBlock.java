import java.util.Scanner;

public class TryAndCatchBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer:");
        try{
            int input=sc.nextInt();
            int result=100/input;
            System.out.println("100 divided by" +input+ "is" +result);
        }
        catch(ArithmeticException e){
            System.out.println("Error:Divisible by 0 is not allowed");
        }
        catch (Exception e){
            System.out.println("Error: Invalid input.Please enter a valid Integer.");
        }
        finally {
            sc.close();
        }
    }
}
