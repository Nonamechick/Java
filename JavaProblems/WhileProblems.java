import java.util.Scanner;


class WhileProblems {
    public static void main(String[] args) {



        // While Example
        // for(int i = 0;i<10;i++) {
        //     System.out.println("cat");
        // }

        // int i=0;
        // while (i<10) {
        //     System.out.println("dog");
        //     i++;
        // }

        // While 1
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int A = scanner.nextInt();
        // int B = scanner.nextInt();

        // int i=0;
        // while (A>B) {
        //     A -= B;
        //     i++;
        //     break;
        // }
        // System.out.println(A);
        // scanner.close();

        // While 2
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int A = scanner.nextInt();
        // int B = scanner.nextInt();

        // int i=0;
        // while (A>B) {
        //     A -= B;
        //     i++;
        //     break;
        // }
        // System.out.println(A);
        // scanner.close();

        // While 3
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();
        // int K = scanner.nextInt();

        // int i =0;
        // while (N>K) {
        //     N-=K;
        //     i++;
        // }
        // System.out.println(N);
        // scanner.close();

        // While 4
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();


        // int i =0;
        // while (N>0) {
        //     boolean ans = N%3==0;
        //     i++;
        //     System.out.println(ans);
        //     break;
        // }
        // scanner.close();

        // While 5
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();


        // int K = 0; 
        // while (N > 1) {
        //     N /= 2; 
        //     K++;    
        // }
        // System.out.println(K);
        // scanner.close();

        // While 6
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // double result = 1; 
        // while (N > 1) {
        //     result *= N;  
        //     N -= 2;       
        // }
        // System.out.println(result);
        // scanner.close();

        // While 7
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int K = 1;
        // while (K * K <= N) {
        //     K++;
        // }
        // System.out.println(K);

        // While 8
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int K = 1;
        // while ((K + 1) * (K + 1) <= N) {
        //     K++;
        // }
        // System.out.println(K);

        // While 9
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int K = 1;
        // while (Math.pow(3, K) <= N) {
        //     K++;
        // }
        // System.out.println(K);

        // While 10
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int K = 1;
        // while (Math.pow(3, K + 1) < N) {
        //     K++;
        // }
        // System.out.println(K);

        // While 11
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int K = 1;
        // int sum = 0;
        // while (sum < N) {
        //     sum += K;
        //     K++;
        // }
        // System.out.println(K);
        // System.out.println(sum);
        

        // While 12
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int K = 1;
        // int sum = 0;
        // while (sum + K <= N) {
        //     sum += K;
        //     K++;
        // }
        // System.out.println(K);

        // while 13
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double A = scanner.nextDouble();

        // int K = 1;
        // double sum = 0;
        // while (sum <= A) {
        //     sum += 1.0 / K;
        //     K++;
        // }
        // System.out.println(K);
        // System.out.println(sum);

        // while 14
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double A = scanner.nextDouble();

        // int K = 1;
        // double sum = 0;
        // while (sum + 1.0 / (K + 1) < A) {
        //     sum += 1.0 / K;
        //     K++;
        // }
        // System.out.println(K);
        // System.out.println(sum);

        // While 15
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double P = scanner.nextDouble();

        // double principal = 1000;
        // double amount = principal;
        // int K = 0;
        // while (amount <= 1100) {
        //     amount += amount * P / 100;
        //     K++;
        // }
        // System.out.println(K);
        // System.out.println(K+"             "+amount);
        // scanner.close();

        // While 16
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // float P = scanner.nextFloat();
        // float S0 = 10;
        // float S =0;
        // int K =0;

        // while(S<200) {
        //     S+=S0;
        //     S0*=P;
        //     K++;
        // }
        // System.out.println(K);
        // System.out.println(S);
        // scanner.close();

        // While 17
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double N = scanner.nextDouble();

        // while (N > 0) {
        //     System.out.println(N % 10); 
        //     N /= 10; 
        // }
        // System.out.println(N);

        // While 18
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double N = scanner.nextDouble();

        // int sum = 0, count = 0;
        // while (N > 0) {
        //     sum += N % 10; 
        //     count++; 
        //     N /= 10; 
        // }
        // System.out.println("Sum " + sum + " count " + count);

        // While 19
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double N = scanner.nextDouble();

        // int rev = 0;
        // while (N > 0) {
        //     rev = rev * 10 + (N % 10); 
        //     N /= 10; 
        // }
        // System.out.println(rev);

        // While 20
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double N = scanner.nextDouble();

        // boolean hasTwo = false;
        // while (N > 0) {
        //     if (N % 10 == 2) {
        //         hasTwo = true;
        //         break;
        //     }
        //     N /= 10;
        // }
        // System.out.println(hasTwo);

        // While 21
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double N = scanner.nextDouble();

        // boolean hasOdd = false;
        // while (N > 0) {
        //     if ((N % 10) % 2 != 0) {
        //         hasOdd = true;
        //         break;
        //     }
        //     N /= 10;
        // }
        // System.out.println(hasOdd);

        // While 22
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double N = scanner.nextDouble();

        // boolean prime = N > 1;
        // int i = 2;
        // while (i * i <= N) {
        //     if (N % i == 0) {
        //         prime = false;
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println(prime);

        // while 23
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // double A = scanner.nextDouble();
        // double B = scanner.nextDouble();
        
        // while (B != 0) {
        //     int temp = B;
        //     B = A % B;
        //     A = temp;
        // }
        // System.out.println("Answer " + A);
        
        // While 24
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int a = 1, b = 1;
        // boolean fib = false;
        // while (b < N) {
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        // }
        // fib = (b == N);
        // System.out.println(fib);

        // While 25
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int a = 1, b = 1;
        // while (b <= N) {
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        // }
        // System.out.println("answer: " + b);

        // While 26
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int a = 1, b = 1;
        // while (b < N) {
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        // }
        // System.out.println("Answer: " + a + ", Next answer: " + (a + b));

        // While 27
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = scanner.nextInt();

        // int a = 1, b = 1, k = 2;
        // while (b < N) {
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        //     k++;
        // }
        // System.out.println("K: " + k);

        // While 28
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input: ");
        // double epsilon = scanner.nextDouble();
        // double ap = 2, ac = 2 + 1 / ap;
        // int i = 2;
        // while (Math.abs(ac - ap) >= epsilon) {
        //     double temp = ac;
        //     ac = 2 + 1 / ap;
        //     ap = temp;
        //     i++;
        // }
        // System.out.println("Answer: " + i+ ", Answer: " + ap + ", Answer: " + ac);

        // While 29
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input: ");
        // double epsilon = scanner.nextDouble();
        // double app = 1, ap = 2, ac = (app + 2 * ap) / 3;
        // int i = 3;
        // while (Math.abs(ac - ap) >= epsilon) {
        //     double temp = ap;
        //     ap = ac;
        //     ac = (app + 2 * ap) / 3;
        //     app = temp;
        //     i++;
        // }
        // System.out.println("Answer: " + i + ", Answer: " + ap + ", Answer: " + ac);

        // While 30
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int rows = 0, cols = 0;

        int tempA = A, tempB = B; 
        while (tempA >= C) {
            tempA -= C;
            rows++;
        }
        while (tempB >= C) {
            tempB -= C;
            cols++;
        }
        System.out.println("Answer: " + (rows * cols));

        scanner.close();
    }
}        