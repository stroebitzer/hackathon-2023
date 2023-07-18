public class Interfaces {

    public static void main(String... args) {

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        //TODO implement cow

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
