public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        byte num1;
        byte num2 = 5;
        byte num3 = 3;
        //num1 = num2 + num3; //num2 + num3 = int data type which is why it can't be assigned to num1 because num1 is byte
        num1 = (byte) (num2 + num3); // this works because we are casting to byte first and then assigning value to num1
    }
}
