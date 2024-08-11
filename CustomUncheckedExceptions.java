import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}
public class CustomUncheckedExceptions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        try{
            int number= sc.nextInt();
            validateNum(number);
            System.out.println("it is not a negative number");
        }
        catch (NegativeNumberException e){
            System.out.println("It cant be an negative number" +e.getMessage());
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }
    public static void validateNum(int number) throws NegativeNumberException{
        if(number<0){
            throw new NegativeNumberException("Enter the correct Integer");
        }
        else {
            System.out.println("It is non negative integer");
        }
    }
}
