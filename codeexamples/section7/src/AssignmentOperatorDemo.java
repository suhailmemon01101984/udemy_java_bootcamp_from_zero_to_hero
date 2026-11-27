public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        num1 = num2 = num3 = num4 = num5 = 98; // assignment happens from right to left so first num5 gets assigned and then num4 is assigned to what's inside num5 and so on
        double dNum1 = 3.14;
        double dNum2 = 4.48;
        dNum1 = dNum2;
        dNum2 = 6.58; //changes to value in dnum2 doesn't change value of dnum1 because both these variables are holding values of primitive data type
        Person person1 = new Person("Suhail");
        Person person2 = new Person("Bob");
        person1 = person2;
        person2.name = "Zafar"; // changing person2.name causes person1.name to change to zafar as well because person1 and person2 are both object referenced datatypes because both these objects are pointed to same memory location where person2 object is stored
    }
}
