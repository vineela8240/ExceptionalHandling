import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class AgeValidator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        try{
           int age= sc.nextInt();
            validate(age);
        }
        catch (InvalidAgeException e){
            System.out.println("Eror: "+e.getMessage());
        }
        finally {
            sc.close();
        }
    }
    public static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age is not valid to vote!");
        }
        else{
            System.out.println("welcome to vote");
        }
    }
}