public class EmptyCheckDemo {

    public static void main(String[] args) {

        String myString = "";
        boolean isEmpty = myString.isEmpty();
        boolean isLengthZero = myString.length()==0;
        boolean isEqualEmpty = "".equals(myString);
        String nullString = null;
        boolean isNullEmpty = "".equals(nullString); /*does not result in null pointer exception. checking this way better*/
        //boolean isEmptyNull = nullString.isEmpty(); /*causes null pointer exception*/
        //boolean isNullLengthZero = nullString.length()==0;/*causes null pointer exception*/

    }
}
