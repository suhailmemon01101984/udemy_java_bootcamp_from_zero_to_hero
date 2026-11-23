public class StringReplaceDemo {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String replacedString = originalString.replace('o','*');//replace takes literal text
        String replacedString1 = originalString.replace("World","Universe");
        String replacedString2 = originalString.replace("world","Universe");
        String originalString1 = "abababab";
        String replacedString3 = originalString1.replace("ab","X");
        String originalString2 = "Java is fun!";
        String replacedString4 = originalString2.replaceAll("a|e|i|o|u","*");//replaceall does the same as replace except it takes regex as input instead of literal text
        String originalString3 = "apple orange apple banana apple";
        String replacedString5 = originalString3.replaceFirst("apple","grape");
    }
}
