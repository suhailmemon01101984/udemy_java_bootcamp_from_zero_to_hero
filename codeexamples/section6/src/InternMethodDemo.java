public class InternMethodDemo {
    public static void main(String[] args) {

        String hello = "hello";
        String obj = new String("hello");
        System.out.println(hello == obj);

        String obj1 = new String("hello").intern();
        System.out.println(hello == obj1);


    }
}
