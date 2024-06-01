public class TestExceptionHandling {
    public static void main(String[] args) {
        try {
            
            int divideByZero = 100 / 0;
            System.out.println("Result: " + divideByZero);
        } catch (ArithmeticException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            
            System.out.println("This is the finally block.");
        }
    }
}