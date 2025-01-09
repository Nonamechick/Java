public class Method {
    static void myMethod(String name, int age) {
        System.out.println(name);
        if (age>=18) {
            System.out.println("Access granted "+name);
        } else {
            System.out.println("Access denied "+name);
        }
    }
    static int factorial(int number) {
        int fac =1;
        for (int n=2;n<=number;n++) {
            fac *=n;
        }   
        return fac;
    }
    static int Sum(int a, int b) {
        return a+b;
    }
    static double Sum(double x, double y) {  // method over loading
            return x+y;
    }
    static int Sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        myMethod("Kataline", 9);
        myMethod("Lana", 30);
        myMethod("Rhoudes", 30);
        myMethod("John Sins", 34);

        int tenfac = factorial(10);
        int fivefac = factorial(5);

        System.out.println(tenfac);
        System.out.println(fivefac);
        System.out.println(factorial(100));


        System.out.println(Sum(100, 4000));
        System.out.println(Sum(400.44, 54354.242));
        System.out.println(Sum(4, 5,4)); // method over loading
    }
}