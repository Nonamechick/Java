import java.util.Scanner;

public class Library1 {
    public static void main(String[] args) {
        // Scanner myObj = new Scanner(System.in);
        // String myString = myObj.nextLine();
        // int myInt = myObj.nextInt();
        // Begin 1 and 2
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input a = ");
        // float a = input.nextFloat();
        // float p = 4 * a;
        // float R = input.nextFloat();
        // float pi = 3.14f;
        // float L = 2 * pi * R;
        

        //nextByte();
        //nextShort();
        //nextInt();
        //nextLong();
        //nextFloat();
        //nextDouble();
        //nextBoolean();
        //nextLine();

        // System.out.println("My string: " + myString);
        // System.out.println("My integer not yours: " + myInt);
        // System.out.println("Peremitter = " + p);
        // System.out.println("Input radius: ");
        // System.out.println("Length = " + L);


        // Begin 3
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your a and b pls ");
        // float a = input.nextFloat();
        // float b = input.nextFloat();
        // float p = 2 * (a+b);
        // float s = a * b;

        
        // System.out.println("Answer s: " + s );
        // System.out.println("Answer p: " + p);

        // Begin 4
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input w = ");
        // float pi = 3.14f;
        // float d = input.nextFloat();
        // float l = pi * d;

        // System.out.println("Answer l: " + l);

        // Begin 5
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your a  pls ");
        // float a = input.nextFloat();
        // float v = a*a*a;
        // float s = 6*a*a;

        // System.out.println("Answer V = " + v);
        // System.out.println("Answer s = " + s);

        // Begin 6
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your a b c pls ");
        // float a = input.nextFloat();
        // float b = input.nextFloat();
        // float c = input.nextFloat();
        // float v = a * b * c;
        // float s = 2*(a*b+b*c+a*c);

        // System.out.println("Answer v = " + v);
        // System.out.println("Answer s = " + s);

        // Begin 7
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your r  pls ");
        // float r = input.nextFloat();
        // float pi = 3.14f;
        // float l = 2 * pi * r;
        // float s = pi * r*r;

        // System.out.println("Answer l = " + l);
        // System.out.println("Answer s = " + s);

        // Begin 8
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your a and b  pls ");
        // float a = input.nextFloat();
        // float b = input.nextFloat();
        // float average = (a+b)/2;

        // System.out.println("Answer average = " + average);

        // Begin 9
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your a and b pls:");
        // float a = input.nextFloat();
        // float b = input.nextFloat();
        // float r = (a * b);

        // // Cast the result of Math.sqrt() to float
        // float root = (float) Math.sqrt(r);

        // System.out.println("Answer root = " + root);

        // Begin 10
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your a and b pls:");
        // float a = input.nextFloat();
        // float b = input.nextFloat();
        // float r = (a * b);
        // float s = (a+b);
        // float d = (a-b);
        // float bs = (float) Math.sqrt(b);

        
        // float as = (float) Math.sqrt(a);

        // System.out.println("Answers = ");
        // System.out.println(as);
        // System.out.println(bs);
        // System.out.println(r);
        // System.out.println(d);
        // System.out.println(s);


        // Begin 11
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your a and b pls:");
        // float a = input.nextFloat();
        // float b = input.nextFloat();
        // float r = (a * b);
        // float s = (a+b);
        // float d = (a-b);
        // float bs = (float) Math.abs(b);

        
        // float as = (float) Math.abs(a);

        // System.out.println("Answers = ");
        // System.out.println(as);
        // System.out.println(bs);
        // System.out.println(r);
        // System.out.println(d);
        // System.out.println(s);

        // Begin 12
        // Scanner input = new Scanner(System.in);
        // System.out.println("Input your a and b pls:");
        // float a = input.nextFloat();
        // float b = input.nextFloat();
        // float c = (a*a + b*b);
        // float p = (a+b+c);

        // float cs = (float) Math.sqrt(c);

        // System.out.println("Answers = ");
        // System.out.println(p);
        // System.out.println(c);

        // Begin 13
        // Scanner input = new Scanner(System.in);
        
        
        // System.out.println("Enter the radius R1 (larger): ");
        // float R1 = input.nextFloat();
        
        // System.out.println("Enter the radius R2 (smaller): ");
        // float R2 = input.nextFloat();
        
        
        // float pi = 3.14f;
        
        
        // float S1 = pi * (R1 * R1); 
        // float S2 = pi * (R2 * R2); 
        // float S3 = S1 - S2;        
        
        
        // System.out.println("Area of the larger circle S1: " + S1);
        // System.out.println("Area of the smaller circle S2: " + S2);
        // System.out.println("Area of the ring S3: " + S3);

        //begin 14
        // Scanner input = new Scanner(System.in);

        
        // System.out.println("Enter the length of the circumference (L): ");
        // float L = input.nextFloat();

        
        // float pi = 3.14f;

        
        // float R = L / (2 * pi);

       
        // float S = pi * (R * R);

        // System.out.println("Radius of the circle R: " + R);
        // System.out.println("Area of the circle S: " + S);


        //begin 15
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the area of the circle (S): ");
        float S = input.nextFloat();

        
        float pi = 3.14f;

        
        float D = (float) Math.sqrt((S * 4) / pi);

        
        float L = pi * D;

        
        System.out.println("Diameter of the circle D: " + D);
        System.out.println("Length of the circumference L: " + L);
        input.close();
    }
}