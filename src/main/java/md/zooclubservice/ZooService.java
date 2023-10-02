package md.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal charlyDog = new Dog("Charly", true);
        System.out.println(charlyDog.getName());
        charlyDog.eat();
        charlyDog.makeSound();

        Dog rexDog = new Dog("Rex");
        System.out.println(rexDog.getName());

        Cat bonitaCat = new Cat("Bonita");
        bonitaCat.eat();
        bonitaCat.makeSound();
    }

}
