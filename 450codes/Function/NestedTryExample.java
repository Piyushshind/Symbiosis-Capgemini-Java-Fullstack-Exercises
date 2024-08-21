public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]); 
            
            try {
                int result = numbers[2] / 0; 
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught in inner try block: " + e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught in outer try block: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception caught in outer try block: "  + e.getMessage());
        }
        
        System.out.println("Program continues...");
    }
}
