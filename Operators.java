public class Operators {
    public static void main(String[] args) {
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        int x = 5;
        ++x;
        int z = 90;
        z += 100;
        int y = 100;
        --y;
        int s = 123;
        s &= 3;  // and gate
        int p = 6;
        p |= 4; // or gate
        int i = 43;
        i ^= 4; // xor gate
        int c = 42;
        c >>= 2; //x  = 0000 0101   (binary for 5)
        // After shifting right by 3:
        // x  = 0000 0000   (result in binary)
        int t = 65;
        t <<= 4; //x  = 0000 0101   (binary for 5)
        // After shifting left by 3:
        // x  = 0010 1000   (binary result)
        


        
        // print
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum3-sum2);
        System.out.println(sum3 * sum3);
        System.out.println(sum3 / sum1);
        System.out.println(sum3 % sum2);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(s);
        System.out.println(p);
        System.out.println(i);
        System.out.println(c);
        System.out.println(t);
        System.out.println(x > 2 && x < 10); // returns true because 5 is greater than 3 AND  5 is less than 10
        System.out.println(x > 3 || x < 4 ); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)  
        
    }
}
