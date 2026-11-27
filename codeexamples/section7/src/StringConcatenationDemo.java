public class StringConcatenationDemo {
    public static void main(String[] args) {
        String output = 4 + 2 + " goals"; //left to right processing. 4+2 gets calculated first leading to "6 goals" as answer
        int num1 = 4;
        int num2 = 2;
        String str1 = " goals";
        String output1 = num1 + num2 + " goals"; //same answer. due to L to R processing
        String output2 = num1 + num2 + str1; //same answer. due to L to R processing
        String output3 = num1 + (num2 + str1); // different answer because expression in parantheses is evaluated first. answer: 42 goals
        String output4 = "" + num1 + num2 + str1; //42 goals because left most value is a string plus no parantheses so everything after that gets added as string
        String output5 = "" + (num1 + num2) + str1; //6 goals because num1+num2 happens first due to parantheses.
        boolean b = false;
        //String output6 = b + num1 + num2 + str1; //fails coz you cannot do arithmetic operation starting with a boolean
        String output6 = b + (num1 + num2 + str1); //succeeds because stuff inside parantheses gets eval'ed first. so answer is false6 goals
        String output7 = "" + b + num1 + num2 + str1; //works same as above coz now due to the "" which is left most this becomes a string concatenation operation
        String str2 = null;
        String str3 = 6 + str2; //6null
        String str4 = "goals" + str2; //goalsnull
    }
}
