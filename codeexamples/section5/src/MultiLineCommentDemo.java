public class MultiLineCommentDemo {

    /*
    maximum retry attempts set to 3
     */
    static final int MAX_RETRY_ATTEMPTS=3;

    public static void main(String[] args) {

        MultiLineCommentDemo obj = new MultiLineCommentDemo();
        double totalArea = obj.calculateRectangleArea(24.5, 34.6);
        System.out.println(totalArea);
    }

    /*
    this method calculates the area of the rectangle.
     */
    public double calculateRectangleArea(double length, double width){
        return length*width;
    }
}
