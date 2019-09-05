public class Main {
    public static void main(String[] args) {
        System.out.println("Wassup");
        int valA = 22;
        int valB = 15;
        int valC = 3;
        int valD = 8;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;
        int result3 = valD * valC - valA;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

    short result4 = (short)longVal;
    short result5 = (short)(byteVal - longVal);
    double result6 = longVal - doubleVal;

        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
/*This is my original comment
//this is a comment inside of my comment
 */