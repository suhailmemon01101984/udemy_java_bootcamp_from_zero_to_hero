public class StringMutableDemo {
    public static void main(String[] args) {
        //Approach 1
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("World");
        stringBuilder.insert(0,"Hello ");
        stringBuilder.deleteCharAt(4);
        stringBuilder.insert(4,'o');
        stringBuilder.setLength(5);
        stringBuilder.reverse();
        String str = stringBuilder.toString();
    }
}
