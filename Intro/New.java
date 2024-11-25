public class New {
    public static void main(String[] args) {
        // // Student data
        // String studentName = "John Doe";
        // int studentID = 15;
        // int studentAge = 23;
        // float studentFee = 75.25f;
        // char studentGrade = 'B';
        
        // // Print variables
        // System.out.println("Student name: " + studentName);
        // System.out.println("Student id: " + studentID);
        // System.out.println("Student age: " + studentAge);
        // System.out.println("Student fee: " + studentFee);
        // System.out.println("Student grade: " + studentGrade);
        // System.out.println(" ");


        // // Create integer variables
        // int length = 4;
        // int width = 6;
        // int area;

        // //Calculate the area of a sample
        // area = length * width;

        // // Print variables
        // System.out.println("Length is: " + length);
        // System.out.println("Width is: " + width);
        // System.out.println("Area of the rectangele is: " + area);
        // System.out.println(" ");

        // Widening casting
        int p = 101;
        double o = p;
        System.out.println(o); 
        System.out.println(" ");

        // Narrowing Casting
        double i  = (int) p;
        System.out.println(i);
        System.out.println(" "); 

        byte byteVar = 127;
        short shortVar = 3234; // short -> 2 bytes => 2^(8*8)
        long longVar = 23424273493874378L;
        double x = 1.5;
        short nowByte = (byte) byteVar;
        long nowShort = (short) shortVar;
        double nowlong = (long) longVar;
        char charVar = 'a';
        boolean bool = true;
        int nowchar = (char) charVar;
        int nowbool = bool ? 1 : 0;
        int nowdouble = (int)x;


        // print
        System.out.println(nowByte);
        System.out.println(nowShort);
        System.out.println(nowlong);
        System.out.println(nowdouble);
        System.out.println(nowchar);
        System.out.println(nowbool);

    }
}