public class ExceptionHeirarchy {
    public static void main(String[] args) {
        try{
            int result=10/0;
            String str =null;
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("caught an arithematic expression" + e.getMessage()); // getMessage() is used to retrive the detail message string of an exception
        }
        catch (NullPointerException e){
            System.out.println("Caught an NullPointerExpression" +e.getMessage());
        }
        catch (Exception e){
            System.out.println("caught an Generic Exception" +e.getMessage());
        }
        finally {
            System.out.println("This block will be executed always");
        }
    }
}
