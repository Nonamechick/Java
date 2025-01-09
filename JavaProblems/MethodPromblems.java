import java.util.Scanner;

public class MethodPromblems {

    static float Sign(float x) {
        if (x>0) {
            return -1;
        } else if (x<0) {
            return -1;
        } else {
            return 0;
        }
    }
    static double Root(double a,double b, double c) {
        double D = b * b - 4 * a * c;
        System.out.println(D);
        if (D > 0) return 2;
        else if (D == 0) return 1;
        else return 0;
    }
    static double CircleS(double R) {
        return 3.14 * R * R;
    }
    static double RingS(double R1, double R2) {
        return 3.14 * (R1 * R1 - R2 * R2);
    }
    static double TriangleP(double a, double h) {
        double b = Math.sqrt((a / 2) * (a / 2) + h * h);
        return a + 2 * b;
    }
    static int SumRange(int A, int B) {
        if (A > B) return 0;
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        return sum;
    }
    static double Calc(double A, double B, int Op) {
        switch (Op) {
            case 1: return A - B;
            case 2: return A * B;
            case 3: return A / B;
            default: return A + B;
        }
    }
    static int Quarter(double x, double y) {
        if (x > 0 && y > 0) return 1;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else return 4;
    }
    static boolean Even(int K) {
        return K % 2 == 0;
    }
    static boolean IsSquare(int K) {
        int sqrt = (int) Math.sqrt(K);
        return sqrt * sqrt == K;
    }
    static boolean IsPower5(int K) {
        while (K > 1 && K % 5 == 0) {
            K /= 5;
        }
        return K == 1;
    }
    static boolean IsPowerN(int K, int N) {
        while (K > 1 && K % N == 0) {
            K /= N;
        }
        return K == 1;
    }
    static boolean IsPrime(int N) {
        if (N <= 1) return false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) return false;
        }
        return true;
    }
    static int DigitCount(int K) {
        return String.valueOf(K).length();
    }
    static int DigitN(int K, int N) {
        String digits = new StringBuilder(String.valueOf(K)).reverse().toString();
        if (N <= digits.length()) {
            return Character.getNumericValue(digits.charAt(N - 1));
        }
        return -1;
    }
    static boolean IsPalindrome(int K) {
        String str = String.valueOf(K);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    static double DegToRad(double D) {
        return D * 3.14 / 180;
    }
    static double RadToDeg(double R) {
        return R * 180 / 3.14;
    }
    static double Fact(int N) {
        double fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
    static double Fact2(int N) {
        double fact2 = 1;
        for (int i = N; i > 0; i -= 2) {
            fact2 *= i;
        }
        return fact2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // float A = sc.nextFloat();
        // float B = sc.nextFloat();

        // double a = sc.nextDouble();
        // double b = sc.nextDouble();
        // double c = sc.nextDouble();

        // float sum = Sign(A) + Sign(B);
        // System.out.println(sum);

        // System.out.println(Root(a, b, c));

        // double r = sc.nextDouble();

        // System.out.println(CircleS(r));

        // double r1 = sc.nextDouble();
        // double r2 = sc.nextDouble();

        // System.out.println(RingS(r1,r2));

        // double a = sc.nextDouble();
        // double h = sc.nextDouble();

        // System.out.println(TriangleP(a,h));

        int A = sc.nextInt();
        // int B = sc.nextInt();

        // System.out.println(SumRange(A,B));
        // System.out.println(Calc(a,b,A));
        // System.out.println(Quarter(r1,r2));
        // System.out.println(Even(A));
        // System.out.println(IsSquare(A));
        // System.out.println(IsPower5(A));
        // System.out.println(IsPowerN(A,B));
        // System.out.println(IsPrime(A));
        // System.out.println(DigitCount(A));
        // System.out.println(DigitN(A,B));
        // System.out.println(IsPalindrome(A));
        // System.out.println(DegToRad(a));
        // System.out.println(RadToDeg(a));
        // System.out.println(Fact(A));
        System.out.println("Answer "+Fact(A));
        sc.close();
    }
}
