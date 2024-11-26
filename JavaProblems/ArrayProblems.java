import java.util.Scanner;


class ArrayProblems {
    public static void main(String[] args) {
        // Array 1
        // String[] names = {"Abdu","Kabu","Feru","Java","C"};
        // String[] strArray = new String[4];

        // System.out.println(names[3]);
        // names[0] = "Dabu";
        // System.out.println(names[0]);
        // System.out.println(names.length);

        // Array 2
        // int[] age = {45,43,432,42342,89};
        // int minAge = age[0];

        // for (int i=0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }

        // for (String elements : names) {
        //     System.out.println(elements); // forEach
        // }

        // for (int i=0; i < age.length; i++) {
        //     System.out.println(age[i]);
        // }

        // for (int elements1 : age) {
        //     if (elements1<minAge) {
        //         minAge=elements1;
        //     }
        //     System.out.println(minAge);
        // }

        // Multidimensional Array 
        // int [][] multiArray = {{1,3},{4,6},{3,4},{32,54}};
        // int [][] array = new int[2][4];

        // for (int[] row : multiArray) {
        //     for (int i :row) {
        //         System.out.println(i+"\t");
        //     }
        //     System.out.println();
        // }

        // Array 1
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int[] numbers = new int[N];

        // for (int i=0,odd=1;i<numbers.length; i++, odd+=2) {
        //     numbers[i] = odd;
        // }

        // for (int num: numbers) {
        //     System.out.println(num+"\t");
        // }
        // scanner.close();

        // Array 2
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int[] numbers = new int[N];

        // for (int i=0,even=2;i<numbers.length; i++, even+=2) {
        //     numbers[i] = even;
        // }

        // for (int num: numbers) {
        //     System.out.println(num+"\t");
        // }
        // scanner.close();

        // Array 3
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double A = scanner.nextDouble();
        // double D = scanner.nextDouble();

        
        // double[] sequence = new double[N];
        // for (int i = 0; i < N; i++) {
        //     sequence[i] = A + i * D;
        // }
        // for (double value : sequence) {
        //     System.out.print(value + " ");
        // }
        // scanner.close();

        // Array 4
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double A = scanner.nextDouble();
        // double R = scanner.nextDouble();

        // double[] sequence = new double[N];
        // for (int i = 0; i < N; i++) {
        //     sequence[i] = A * Math.pow(R, i);
        // }

        // for (double value : sequence) {
        //     System.out.print(value + " ");
        // }
        
        // Array 5
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int[] sequence = new int[N];
        // sequence[0] = 1;
        // sequence[1] = 1;

        // for (int i = 2; i < N; i++) {
        //     sequence[i] = sequence[i - 2] + sequence[i - 1];
        // }

        // for (int value : sequence) {
        //     System.out.print(value + " ");
        // }
        // scanner.close();

        // Array 6
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int A = scanner.nextInt();
        // int B = scanner.nextInt();
        // int[] sequence = new int[N];
        // sequence[0] = A;
        // sequence[1] = B;

        // for (int i = 2; i < N; i++) {
        //     sequence[i] = 0;
        //     for (int j = 0; j < i; j++) {
        //         sequence[i] += sequence[j];
        //     }
        // }

        // for (int value : sequence) {
        //     System.out.print(value + " ");
        // }
        // scanner.close();
        
        // Array 7
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // for (int i = 0; i < N; i++) {
        //     array[i] = scanner.nextDouble();
        // }

        // for (int i = N - 1; i >= 0; i--) {
        //     System.out.print(array[i] + " ");
        // }
        // System.out.println();
        // scanner.close();

        // Array 8
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // int K = 0; 
        // for (int i = 0; i < N; i++) {
        //     if (array[i] % 2 != 0) {
        //         System.out.print(array[i] + " ");
        //         K++;
        //     }
        // }
        // System.out.println("\nCount: " + K);

        // Array 9
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // K = 0; 
        // for (int i = N - 1; i >= 0; i--) {
        //     if (array[i] % 2 == 0) {
        //         System.out.print(array[i] + " ");
        //         K++;
        //     }
        // }
        // System.out.println("\nCount: " + K);

        // Array 10
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // for (int i = 0; i < N; i++) {
        //     if (array[i] % 2 == 0) {
        //         System.out.print(array[i] + " ");
        //     }
        // }
        
        // for (int i = N - 1; i >= 0; i--) {
        //     if (array[i] % 2 != 0) {
        //         System.out.print(array[i] + " ");
        //     }
        // }
        // System.out.println();

        // Array 11
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];
        // int K = scanner.nextInt();


        // for (int i = K - 1; i < N; i += K) {
        //     System.out.print(array[i] + " ");
        // }
        // System.out.println();

        // Array 12
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // for (int i = 1; i < N; i += 2) {
        //     System.out.print(array[i] + " ");
        // }
        // System.out.println();

        // Array 13
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // for (int i = N - 1; i >= 0; i -= 2) {
        //     System.out.print(array[i] + " ");
        // }
        // System.out.println();

        // Array 14
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // for (int i = 1; i < N; i += 2) {
        //     System.out.print(array[i] + " ");
        // }
        
        // for (int i = 0; i < N; i += 2) {
        //     System.out.print(array[i] + " ");
        // }
        // System.out.println();

        // Array 15
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // for (int i = 0; i < N; i += 2) {
        //     System.out.print(array[i] + " ");
        // }
        
        // for (int i = N - 1; i >= 1; i -= 2) {
        //     System.out.print(array[i] + " ");
        // }
        // System.out.println();

        // Array 16
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];

        // int left = 0, right = N - 1;
        // while (left <= right) {
        //     System.out.print(array[left] + " ");
        //     if (left != right) {
        //         System.out.print(array[right] + " ");
        //     }
        //     left++;
        //     right--;
        // }
        // System.out.println();

        // Array 17
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] array = new double[N];
        // int left = 0, right = N - 1;
        // left = 0;
        // right = N - 1;
        // while (left < right) {
        //     System.out.print(array[left] + " ");
        //     System.out.print(array[left + 1] + " ");
        //     System.out.print(array[right] + " ");
        //     System.out.print(array[right - 1] + " ");
        //     left += 2;
        //     right -= 2;
        // }
        // if (left == right) { 
        //     System.out.print(array[left] + " ");
        // }
        // System.out.println();

        // scanner.close();

        // Array 18
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int[] A = new int[10];

        // for(int i=0; i<10;i++) {
            // A[i] = scanner.nextInt();
        // }
        // int Ak =0;
        // for (int e: A) {
        //     if (e<A[9]) {
        //         Ak=e;
        //         break;
        //     }
        // }
        // System.out.println(Ak);

        // Array 19
        // Scanner scanner = new Scanner(System.in);
        // int[] A = new int[10];
        
        // for (int i = 0; i < 10; i++) {
        //     A[i] = scanner.nextInt();
        // }
        
        // int A1 = A[0];
        // int A10 = A[9];
        // int result = 0;
    
        // for (int i = 9; i >= 0; i--) {
        //     if (A1 < A[i] && A[i] < A10) {
        //         result = i + 1;
        //         break;
        //     }
        // }
        // System.out.println("Result: " + result);
        // scanner.close();

        // Array 20
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];
        
        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }
        
        // int K = scanner.nextInt();
        // int L = scanner.nextInt();
        
        // double sum = 0;
        // for (int i = K - 1; i < L; i++) {
        //     sum += A[i];
        // }
        
        // System.out.println("Result: " + sum);
        // scanner.close();

        // Array 21
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // int K = scanner.nextInt();
        // int L = scanner.nextInt();
        
        // double sum = 0;
        // for (int i = K - 1; i < L; i++) {
        //     sum += A[i];
        // }
        
        // double average = sum / (L - K + 1);
        // System.out.println("Result: " + average);
        // scanner.close();

        // Array 22
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }
        // int K = scanner.nextInt();
        // int L = scanner.nextInt();
        
        // double sum = 0;
        // for (int i = 0; i < A.length; i++) {
        //     if (i < K - 1 || i > L - 1) {
        //         sum += A[i];
        //     }
        // }
        
        // System.out.println("Result: " + sum);
        // scanner.close();

        // Array 23
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // int K = scanner.nextInt();
        // int L = scanner.nextInt();

        // double sum = 0;
        // int count = 0;

        // for (int i = 0; i < A.length; i++) {
        //     if (i < K - 1 || i > L - 1) { 
        //         sum += A[i];
        //         count++;
        //     }
        // }

        // double average = count > 0 ? sum / count : 0;
        // System.out.println("Result: " + average);
        // scanner.close();

        // Array 24
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int[] A = new int[N];
    
        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextInt();
        // }
    
        // int difference = A[1] - A[0];
        // boolean isArithmetic = true;
    
        // for (int i = 1; i < A.length; i++) {
        //     if (A[i] - A[i - 1] != difference) {
        //         isArithmetic = false;
        //         break;
        //     }
        // }
    
        // int result = isArithmetic ? difference : 0;
        // System.out.println("Result: " + result);
        // scanner.close();

        // Array 25
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int[] A = new int[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextInt();
        // }

        // double ratio = (double) A[1] / A[0];
        // boolean isGeometric = true;

        // for (int i = 1; i < A.length; i++) {
        //     if ((double) A[i] / A[i - 1] != ratio) {
        //         isGeometric = false;
        //         break;
        //     }
        // }

        // double result = isGeometric ? ratio : 0;
        // System.out.println("Result: " + result);
        // scanner.close();

        // Array 26
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int[] A = new int[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextInt();
        // }

        // int result = 0;

        // for (int i = 1; i < A.length; i++) {
        //     if ((A[i] % 2 == 0 && A[i - 1] % 2 == 0) || (A[i] % 2 != 0 && A[i - 1] % 2 != 0)) {
        //         result = i + 1; 
        //         break;
        //     }
        // }

        // System.out.println("Result: " + result);
        // scanner.close();

        // Array 27
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // int[] A = new int[N];


        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextInt();
        // }

        // int result = 0;

        // for (int i = 1; i < A.length; i++) {
        //     if ((A[i] > 0 && A[i - 1] > 0) || (A[i] < 0 && A[i - 1] < 0)) {
        //         result = i + 1; 
        //         break;
        //     }
        // }

        // System.out.println("Result: " + result);
        // scanner.close();

        // Array 28
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // double min = Double.MAX_VALUE;
        // for (int i = 1; i < N; i += 2) { 
        //     if (A[i] < min) {
        //         min = A[i];
        //     }
        // }

        // System.out.println("Array28 Result: " + min);
        // scanner.close();

        // Array 29
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // double max = Double.MIN_VALUE;
        // for (int i = 0; i < N; i += 2) { 
        //     if (A[i] > max) {
        //         max = A[i];
        //     }
        // }

        // System.out.println("Result: " + max);
        // scanner.close();

        // Array 30
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // int count = 0;
        // for (int i = 0; i < N - 1; i++) {
        //     if (A[i] > A[i + 1]) {
        //         System.out.print((i + 1) + " "); 
        //         count++;
        //     }
        // }
        // System.out.println("\nCount: " + count);
        // scanner.close();

        // Array 31
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // int count = 0;
        // for (int i = N - 1; i > 0; i--) {
        //     if (A[i] > A[i - 1]) {
        //         System.out.print((i + 1) + " "); 
        //         count++;
        //     }
        // }
        // System.out.println("\nCount: " + count);
        // scanner.close();

        // Array 32
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // int result = 0;
        // for (int i = 1; i < N - 1; i++) {
        //     if (A[i] < A[i - 1] && A[i] < A[i + 1]) {
        //         result = i + 1; 
        //         break;
        //     }
        // }

        // System.out.println("Result: " + result);
        // scanner.close();

        // Array 33
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // int result = 0;
        // for (int i = N - 2; i > 0; i--) {
        //     if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
        //         result = i + 1; 
        //         break;
        //     }
        // }

        // System.out.println("Result: " + result);
        // scanner.close();

        // Array 34
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // double[] A = new double[N];

        // for (int i = 0; i < N; i++) {
        //     A[i] = scanner.nextDouble();
        // }

        // double maxLocalMin = Double.MIN_VALUE;
        // for (int i = 1; i < N - 1; i++) {
        //     if (A[i] < A[i - 1] && A[i] < A[i + 1]) {
        //         maxLocalMin = Math.max(maxLocalMin, A[i]);
        //     }
        // }

        // System.out.println("Result: " + maxLocalMin);
        // scanner.close();

        // Array 35
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        int N = scanner.nextInt();
        double[] A = new double[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextDouble();
        }

        double minLocalMax = Double.MAX_VALUE;
        for (int i = 1; i < N - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                minLocalMax = Math.min(minLocalMax, A[i]);
            }
        }

        System.out.println("Result: " + minLocalMax);
        scanner.close();
    }
}        