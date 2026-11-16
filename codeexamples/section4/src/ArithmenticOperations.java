public class ArithmenticOperations {

    double piValue = 3.14;
    static final double PI_VALUE = 3.14;

    public static void main(String[] args) {
        ArithmenticOperations arithmenticOperations = new ArithmenticOperations();
        int result = arithmenticOperations.sum(20,5);
        int result1 = addition(20,5);
        System.out.println(result);
        System.out.println(result1);
//        System.out.println(PI_VALUE);
//        System.out.println(arithmenticOperations.piValue);
    }

    public int sum(int num1, int num2) {
//        System.out.println(piValue);
//        System.out.println(PI_VALUE);
        System.out.println(subtract(num1,num2));
        System.out.println(addition(num1,num2));
        int result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }



}
