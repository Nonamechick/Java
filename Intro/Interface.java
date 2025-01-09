interface Animal {
    public abstract void animalSound();
    public void sleep();
}

class Sheep implements Animal {
    public void animalSound() {
        System.out.println("The sheep says: beee beeeeee");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Interface {
    public static void main(String[] args) {
        Sheep mySheep = new Sheep();
        mySheep.animalSound();
        mySheep.sleep();
    }
}