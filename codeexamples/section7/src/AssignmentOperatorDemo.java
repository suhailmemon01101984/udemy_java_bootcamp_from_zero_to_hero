public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        num1 = num2 = num3 = num4 = num5 = 98; // assignment happens from right to left so first num5 gets assigned and then num4 is assigned to what's inside num5 and so on
        double dNum1 = 3.14;
        double dNum2 = 4.48;
        dNum1 = dNum2;
        dNum2 = 6.58;
    }
}
