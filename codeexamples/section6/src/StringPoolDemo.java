public class StringPoolDemo {
    public static void main(String[] args) {

        String hello = "hello";
        String hi = "hello";
        String hey = "hey";

        System.out.println(hello == hi);// true because they are pointed to same memory location
        System.out.println(hello.hashCode());//same hashcode as hi because value of hello and hi is same
        System.out.println(hi.hashCode());
        System.out.println(hey.hashCode());

        String obj = new String("hello");
        String obj1 = new String("hello");
        String obj2 = new String("hey");
        System.out.println(obj == obj1); //false because they are not pointed to same memory location
        System.out.println(obj.hashCode());//same hashcode as obj1 because value of obj and obj1 is same
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
