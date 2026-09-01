class Animal {
    public void eat() {
        System.out.println("Animal Eating");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog Eats");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

class BabyDog extends Dog {
    @Override
    public void eat() {
        System.out.println("Baby dog eating");
    }

    @Override
    public void bark() {
        System.out.println("Baby dog barking");
    }

    public void weep() {
        System.out.println("Baby dog weeping");
    }
}

public class test {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.eat();

        Animal a = new Dog();// Upcastig dog to animal
        a.eat();
        // a.bark(); //CTE bcoz Animal dosent have properties

        Dog d = (Dog) a;// Downcasting animal to dog
        d.eat();
        d.bark();

        Animal a1 = new BabyDog(); // Upcasting BabyDog to Animal
        a1.eat();
        // a1.bark(); //CTE bcoz Animal dosent have properties
        // a1.weep(); //CTE bcoz Animal dosent have properties

        BabyDog b2 = (BabyDog) a1;// Downcating Animal to BabyDog
        b2.eat();
        b2.bark();
        b2.weep();
    }
}
