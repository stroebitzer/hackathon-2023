public class Interfaces {

    public static void main(String... args) {

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Cow cow = new Cow();
        cow.makeSound();

    }

}

 interface Animal {

    public void makeSound();

}

 class Dog implements Animal {

    public void makeSound() {
        System.out.println("wuff");
    }
}

 class Cat implements Animal {

    public void makeSound() {
        System.out.println("meow");
    }
}

 class Cow implements Animal {

    public void makeSound() {
        System.out.println("Kuhhh");
    }
 }