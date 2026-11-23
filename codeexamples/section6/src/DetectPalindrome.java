public class DetectPalindrome {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        str1.append("tattarrattat");
        boolean isPalindrome = str1.toString().toUpperCase().equals(str1.reverse().toString().toUpperCase());
        System.out.println("Is palindrome: " + isPalindrome);
    }
}
