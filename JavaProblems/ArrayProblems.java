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
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] array = new double[N];
        int left = 0, right = N - 1;
        left = 0;
        right = N - 1;
        while (left < right) {
            System.out.print(array[left] + " ");
            System.out.print(array[left + 1] + " ");
            System.out.print(array[right] + " ");
            System.out.print(array[right - 1] + " ");
            left += 2;
            right -= 2;
        }
        if (left == right) { 
            System.out.print(array[left] + " ");
        }
        System.out.println();

        scanner.close();
    }
}        