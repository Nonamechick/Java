public class Conditionals {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;
        int time = 20;
        int time1 = 22;
        String result;
        result = (time < 18) ? "Good day." : "Good evening.";
        int doorCode = 13335;
        int myNum = 10;
        int myAge = 25;
        int votingAge = 18;
        // int notmyNum = 5;



        // functions
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        if (x > y) {
            System.out.println("X is greater than y");
        }

        if (time < 18) {
            System.out.println("Not Good Day Java Day");
        } else {
            System.out.println("Good evening");
        }

        if (time1 < 10) {
            System.out.println("Guten Morgen");
        } else if (time1 < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good Evening");
        }
        // print 
        System.out.println(result);

        if (doorCode ==13335) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed");
        }

        if (myNum > 0) {
            System.out.println("The value is a positive number");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number");
        } else {
            System.out.println("The value is 0");
        }

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote nigga");
        } else {
            System.out.println("Not old enough to vote nigga");
        }

        if (myNum % 2 == 0) {
            System.out.println(myNum + " is even");
        } else {
            System.out.println(myNum + "is odd");
        }
     }
}
