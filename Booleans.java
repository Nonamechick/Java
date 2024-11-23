public class Booleans {
    public static void main(String[] args) {
        boolean isJavaFun = true; // actually not 
        boolean isFishTasty = false;
        int x = 10;
        int y = 9;
        int myAge = 19;
        int votingAge = 18;


        // print
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        System.out.println(x > y); // returns true, because 10 is higher than 9
        System.out.println(x == 10); // returns true, x == 10
        System.out.println(myAge >= votingAge); // true


        // if function
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote nigga");
        } else {
            System.out.println("Not old enough to vote nigga");
        }
    }
}
