public class ArithmeticMain {
    public static void main(String[] args) {
        int result = ArithmenticOperations.addition(20,4);
        System.out.println(result);
        System.out.println(ArithmenticOperations.PI_VALUE);
        ArithmenticOperations arithmenticOperations = new ArithmenticOperations();
        int resultFromInstanceMethod = arithmenticOperations.sum(20,5);
        System.out.println(resultFromInstanceMethod);
        System.out.println(arithmenticOperations.piValue);

    }
}
