public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 9;
        int num3 = 9;
        boolean isSame = num1 == num2;
        boolean a = true;
        boolean b = false;
        boolean isEqual = a == b;
        //boolean isSimilar = num1 == num2 == num3; //fails because java first does num1 == num2 which results in boolean output and you cant equat boolean output with num3 which is an int. that is not allowed.
        boolean isSimilar = (num1 == num2) && (num2 == num3); // this works
    }
}
