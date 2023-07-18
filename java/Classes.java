public class Classes {

    public static void main(String... args) {
        Dog dog = new Dog(5);
        dog.bark();

        Cat cat = new Cat(4);
        cat.meow();

        Cow cow = new Cow(137);
        cow.Kuhhh();

    }

}

class Animal {

    Integer age = 0;

    Integer getAge() {
        return age;
    }

}

class Dog extends Animal {

    public Dog(Integer age) {
        this.age = age;
    }

    public void bark() {
        System.out.println("wuff");
    }

}

class Cat extends Animal {

    public Cat(Integer age) {
        this.age = age;
    }
\]

}

class Cow extends Animal {

    public Cow(Integer age) {
        this.age = age;
    }

    public void Kuhhh() {
        System.out.println("Kuhhh");
    }

}
