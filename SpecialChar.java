public class SpecialChar {
    public static void main(String[] args) {
        String txt = "We are the so-called \"Vikings\" from the north.";
        String ntn = "It\'s not good";
        String bnt = "The character \\ is called backslash.";
        String mtn = "Hell\nWorld!";
        String vbt = "No\tway";
        String ont = "Hel\b World";

        // print 
        System.out.println(txt);
        System.out.println(ntn);
        System.out.println(bnt);
        System.out.println(mtn);
        System.out.println(vbt);
        System.out.println(ont);
    }
}
