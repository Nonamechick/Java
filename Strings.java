public class Strings {
    public static void main(String[] args) {
        String txt = "fhsdkhfsdkfhdskjfhdsfh";
        String firstName = "John ";
        String lastName = "Doe";
        String x = "19";
        int t = 4;
        String z = x + t; // string print only nigga



        // print
        System.out.println("The length: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("fhdskj"));
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(z);
    }
}
