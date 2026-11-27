public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        byte num1;
        byte num2 = 5;
        byte num3 = 3;
        //num1 = num2 + num3; //num2 + num3 = int data type which is why it can't be assigned to num1 because num1 is byte
        num1 = (byte) (num2 + num3); // this works because we are casting to byte first and then assigning value to num1
        double num4;
        double num5 = 3.14;
        byte num6 = 3;
        num4 = num5 + num6; //byte + double results in double. num4 is double so resulting sum becomes double and stored inside num4. if you make num4 int then this expression will fail because you are going to try to assign a double value to an int. so until you do an explicit cast to an int using (int) you will get a failure.
        int result1 = 9/2;
        float result2 = 27/2.0f;
    }
}
