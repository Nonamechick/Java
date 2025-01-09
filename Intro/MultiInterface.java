interface FirstInterFace {
    public void myMethod();
}
interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterFace, SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }
    public void myOtherMethod() {
        System.out.println("Some random text...");
    }
}

class MultiInterface {
    public static void main(String[] args) {
        DemoClass myClass = new DemoClass();
        myClass.myMethod();
        myClass.myOtherMethod();
    }    
}
