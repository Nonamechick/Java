abstract class  Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Sheep extends Animal {
    public void animalSound() {
        System.out.println("The sheep says: beee beeeeee");
    }
}

class Abstract {
    public static void main(String[] args) {
        Sheep mySheep = new Sheep();
        mySheep.animalSound();
        mySheep.sleep();
    }
}