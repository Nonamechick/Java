import java.util.Scanner;


class ForProblems {
    public static void main(String[] args) {



        // For 1
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input");
        // int k = scanner.nextInt();
        // int num = scanner.nextInt();
        

        // for (int i =0; i<num; i++) {
        //     System.out.println(k);
        // }

        // For 4 example
        // Scanner sc = new Scanner(System.in);
        // float cost = sc.nextFloat();

        // for (int i=1;i<10;i++) {
        //     System.out.println(cost);
        // }

        // For 10 Example
        // Scanner sc = new Scanner(System.in);
        // int N  = sc.nextInt();
        // float sum = 0;
        // for (int n=0;n<N;n++) {
        //     sum+=1/n;
        // }
        // System.out.println("sum   "+sum);

        //For 2 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input ");
        // int  A = sc.nextInt();
        // int B = sc.nextInt();

        // if (A >= B) {
        //     System.out.println("Error");
        // } else {
        //     int count = 0;

        //     System.out.println("Integers " + A + " to " + B + ":");
        //     for (int i = A; i <= B; i++) {
        //         System.out.print(i + " ");
        //         count++;
        //     }

        //     System.out.println("\nTotal " + count);
        // }

        // sc.close();

        //For 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input ");
        // int  A = sc.nextInt();
        // int B = sc.nextInt();

        // if (A >= B) {
        //     System.out.println("Error");
        // } else {
        //     int count = 0;

        //     System.out.println("Integers " + A + " to " + B + ":");
        //     for (int i = A; i <= B; i++) {
        //         System.out.print(i + " ");
        //         count--;
        //     }

        //     System.out.println("\nTotal " + count);
        // }

        //sc.close();
        // For 5
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input ");
        // double  price = sc.nextDouble();

        // for (double weight = 0.1; weight <= 1.0; weight += 0.1) {
        //     double cost = price * weight;
        //     System.out.printf("%.1f kg: %.2f%n", weight, cost);
        // }

        // sc.close();

        // For 6
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input ");
        // double  price = sc.nextDouble();

        // for (double weight = 1.0; weight <= 2.1; weight += 0.1) {
        //     double cost = price * weight;
        //     System.out.printf("%.1f kg: %.2f%n", weight, cost);
        // }

        // sc.close();

        // For 7
        // Scanner sc = new Scanner(System.in);
        // int A  = sc.nextInt();
        // int B = sc.nextInt();
        // float sum = 0;
        // for (int n=A;n<B;n++) {
        //     sum+=n;
        // }
        // System.out.println("sum   "+sum);

        // For 8
        // Scanner sc = new Scanner(System.in);
        // int A  = sc.nextInt();
        // int B = sc.nextInt();
        // float sum = 1;
        // for (int n=A;n<B;n++) {
        //     sum*=n;
        // }
        // System.out.println("sum   "+sum);

        // For 9
        // Scanner sc = new Scanner(System.in);
        // int A  = sc.nextInt();
        // int B = sc.nextInt();
        // float sum = 0;
        // for (int n=A;n<B;n++) {
        //     sum+=(n*n);
        // }
        // System.out.println("sum   "+sum);

        // For 11
        // Scanner sc = new Scanner(System.in);
        // int N  = sc.nextInt();
        // float sum = 0;
        // for (int i=0;i<N;i++) {
        //     sum+=Math.pow(N+i,2);
        // }
        // System.out.println("sum   "+sum);

        // For 12
        // Scanner sc = new Scanner(System.in);
        // int N  = sc.nextInt();
        // float sum = 0;
        // for (int i=0;i<N;i++) {
        //     sum+=(i+N/10);
        // }
        // System.out.println("sum   "+sum);

        // For 13
        // Scanner sc = new Scanner(System.in);
        // int N  = sc.nextInt();
        // float sum = 0;
        // for (int i=1;i<N;i++) {
        //     sum += (1.0 * i) * Math.pow(-1, i + 1);
        // }
        // System.out.println("sum   "+sum);

        // For 14
        // Scanner sc = new Scanner(System.in);
        // int N  = sc.nextInt();
        // float sum = 0;
        // for (int i=1;i<N;i++) {
        //     int oddn = 2 * i - 1;
        //     sum += oddn;
        // }
        // System.out.println("sum   "+sum);

        // For 15
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input ");
        // double A = scanner.nextDouble();
        // int N = scanner.nextInt();
        // double result = 1.0;

        //     for (int i = 1; i <= N; i++) {
        //         result *= A; 
        //         System.out.printf("\nRes ", A, result);
        //     }

        //     System.out.printf("A^%d  A = %.2f : %.2f%n", N, A, result);

        // scanner.close();


        // For 16
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input ");
        // double A = sc.nextDouble();
        // int N = sc.nextInt();

        // for(int k = 1;k<N;k++) {
        //     System.out.println(Math.pow(A,k));
        // }

        // For 17
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input ");
        // double A = sc.nextDouble();
        // int N = sc.nextInt();
        // double sum = 0;

        // for(int k = 1;k<N;k++) {
        //     double res = Math.pow(A,k);
        //     sum+=res*1;
        //     System.out.println(sum);
        // }

        // For 18
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input ");
        // double A = sc.nextDouble();
        // int N = sc.nextInt();
        // double sum = 0.0;

        // for(int i = 0;i<N;i++) {
        //     sum += Math.pow(-1, i) * Math.pow(A, i);
        //     System.out.printf("After  %d: %.2f, sum is: %.2f%n", i, Math.pow(-1, i) * Math.pow(A, i), sum);
        // }
        // sc.close();

        // For 19
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input ");
        // int N = sc.nextInt();
        // double factorial =1.0;

        // for(int i=1;i<N;i++) {
        //     factorial*=i;

        // }
        // System.out.println(factorial);

        // For 20
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input ");
        // int N = sc.nextInt();
        // double factorial =1.0;
        // double sum = 0.0;

        // for (int i = 1; i <= N; i++) {
        //     factorial *= i;   
        //     sum += factorial; 
        // }

        // System.out.println("Sum of factorials: " + sum);

        // For 21
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input ");
        // int N = sc.nextInt();
        // double factorial =1.0;
        // double sum = 0.0;

        // for (int i = 1; i <= N; i++) {
        //     factorial *= i;   
        //     sum += 1.0/factorial; 
        // }

        // System.out.println("Sum of factorials: " + sum);

        // For 22
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input ");
        // int N = sc.nextInt();
        // double factorial =1.0;
        // double sum = 0.0;
        //double powerOfX = 1.0;

        // for (int i = 1; i <= N; i++) {
        //     powerOfX *= X;       
        //     factorial *= i;      
        //     sum += powerOfX / factorial;
        // }

        // System.out.println("Sum of factorials: " + sum);

        // For 23
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input Milord");
        // float x = sc.nextFloat();
        // int n = sc.nextInt();
        // float sum=0;
        // for (int i =0;i<=n;i++) {
        //     int fac=1;
        //     for (int j=2;j<=i;j++) {
        //         fac*=j;
        //     }
        //     sum+=Math.pow(-1,i) * Math.pow(x,2*i+1)/fac;
        // }
        // System.out.println("Sum sin(x) "+sum);

        // For 24
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input  ");
        // double X = sc.nextDouble();
        // int N = sc.nextInt();

        // double sum = 1.0;
        // double term = 1.0;

        // for (int i = 1; i <= N; i++) {
        //     term *= -X * X / (2 * i * (2 * i - 1));
        //     sum += term;
        // }

        // System.out.println("value of cos(X): " + sum);

        // For 25
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // double X = sc.nextDouble();
        // int N = sc.nextInt();

        // double sum = 0.0;
        // double term = X;

        // for (int i = 1; i <= N; i++) {
        //     sum += term / i * ((i % 2 == 0) ? -1 : 1);
        //     term *= X;
        // }

        // System.out.println("value of ln(1 + X): " + sum);

        // For 26
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // double X = sc.nextDouble();
        // int N = sc.nextInt();

        // double sum = 0.0;
        // double term = X;

        // for (int i = 1; i <= N; i++) {
        //     sum += term / (2 * i - 1) * ((i % 2 == 0) ? -1 : 1);
        //     term *= X * X;
        // }

        // System.out.println(" value of atan(X): " + sum);

        // For 27
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // double X = sc.nextDouble();
        // int N = sc.nextInt();

        // double sum = X;
        // double term = X;
        // double num = 1.0;
        // double denom = 1.0;

        // for (int i = 1; i <= N; i++) {
        //     num *= (2 * i - 1);
        //     denom *= (2 * i) * (2 * i + 1);
        //     term *= X * X;
        //     sum += (num / denom) * term;
        // }

        // System.out.println("value of asin(X): " + sum);

        // For 28
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // double X = sc.nextDouble();
        // int N = sc.nextInt();

        // double sum = 1.0;
        // double term = 1.0;
        // double num = 1.0;
        // double denom = 1.0;

        // for (int i = 1; i <= N; i++) {
        //     num *= (2 * i - 3);
        //     denom *= 2 * i;
        //     term *= X;
        //     sum += (i % 2 == 0 ? -1 : 1) * (num / denom) * term;
        // }

        // System.out.println("value of sqrt(1 + X): " + sum);

        // For 29
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // double A = sc.nextDouble();
        // double B = sc.nextDouble();
        // int N = sc.nextInt();

        // double H = (B - A) / N;
        // System.out.println("Length " + H);

        // for (int i = 0; i <= N; i++) {
        //     double point = A + i * H;
        //     System.out.printf("Point %d: %.6f%n", i, point);
        // }

        // For 30
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // double A = sc.nextDouble();
        // double B = sc.nextDouble();
        // int N = sc.nextInt();

        // double H = (B - A) / N;
        // System.out.println("Length " + H);


        // for (int i = 0; i <= N; i++) {
        //     double X = A + i * H;
        //     double F = 1 - Math.sin(X);
        //     System.out.printf("F(%.6f) = %.6f%n", X, F);
        // }

        // For 31
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = sc.nextInt();

        // double A = 2.0;
        // for (int i = 1; i <= N; i++) {
        //     A = 2 + 1 / A;
        //     System.out.printf("Answer",  A);
        //     System.out.printf("Answer ", i);
        // }

        // For 32
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = sc.nextInt();

        // double A = 2.0;
        // for (int i = 1; i <= N; i++) {
        //     A = (A + 1) / i;
        //     System.out.printf("Answer",  A);
        //     System.out.printf("Answer ", i);
        // }

        // For 33
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input ");
        // int N = sc.nextInt();

        // int a = 1, b = 1;
        

        // for (int i = 3; i <= N; i++) {
        //     int next = a + b;
        //     System.out.print(", F" + i + " = " + next);
        //     a = b;
        //     b = next;
        // }
        // System.out.println();

        // For 34
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = sc.nextInt();

        // double A1 = 1.0;
        // double A2 = 2.0;
        // System.out.printf("A1 = %.6f, A2 = %.6f", A1, A2);

        // double prev2 = A1, prev1 = A2;
        // for (int i = 3; i <= N; i++) {
        //     double A = (prev2 + 2 * prev1) / 3;
        //     System.out.printf(", A%d = %.6f", i, A);
        //     prev2 = prev1;
        //     prev1 = A;
        // }
        // System.out.println();

        // For 35
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = sc.nextInt();

        // int A1 = 1;
        // int A2 = 2;
        // int A3 = 3;

        // int prev3 = A1, prev2 = A2, prev1 = A3;
        // for (int i = 4; i <= N; i++) {
        //     int A = prev1 + prev2 - 2 * prev3;
        //     System.out.print(", A" + i + " = " + A);
        //     prev3 = prev2;
        //     prev2 = prev1;
        //     prev1 = A;
        // }
        // System.out.println();
        // sc.close();

        // For 36
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = sc.nextInt();
        // int K = sc.nextInt();
        // double sum = 0.0;

        // for(int i =1;i<N;i++) {
        //     double pow = 1.0;
        //     for (int o=1;o<K;o++) {
        //         pow*=i;
        //     }
        //     sum+=pow;
        // }
        // System.out.println(sum);
        // sc.close();

        // For 37
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = sc.nextInt();
        // double sum = 0.0;

        // for(int i =1;i<N;i++) {
        //     double pow = 1.0;
        //     for (int o=1;o<N;o++) {
        //         pow*=i;
        //     }
        //     sum+=pow;
        // }
        // System.out.println(sum);
        // sc.close();

        // For 38
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // int N = sc.nextInt();
        // double sum = 0.0;

        // for(int i =1;i<N;i++) {
        //     double pow = 1.0;
        //     for (int o=1;o<= (N - i + 1);o++) {
        //         pow*=i;
        //     }
        //     sum+=pow;
        // }
        // System.out.println(sum);
        // sc.close();

        // For 39
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input : ");
        // int A = sc.nextInt();
        // int B = sc.nextInt();

        // for (int i = A; i <= B; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();  
        // }
        // sc.close();

        // For 40
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        for (int i = A; i <= B; i++) {
            for (int j = 0; j < (i - A + 1); j++) {
                System.out.print(i + " ");
            }
            System.out.println();  
        }
        
        scanner.close();
    }
}