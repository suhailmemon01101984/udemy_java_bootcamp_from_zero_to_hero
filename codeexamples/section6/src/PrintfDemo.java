public class PrintfDemo {
    public static void main(String[] args) {
        String result = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println(result);
        System.out.printf("Name: %s, Age: %d%n", "John", 25);//%n is to move cursor to new line after printing which println does by default
        System.out.printf("Price: %.2f%n",19.99);//.2 is to display 2 decimal places. %n explanation is above
        System.out.printf("Grade: %c%n",'A');
        System.out.printf("Is java fun?: %b%n",true);
    }
}
