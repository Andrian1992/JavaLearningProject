package md.zooclubservice;

public class Dog extends Animal {

    private boolean hasAGoodLife;

    public Dog(String nameOfTheDog, boolean hasAGoodLife) {
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;
    }

    public Dog(String nameOfTheDog) {
    super(nameOfTheDog);
    }

    @Override
    public void makeSound() {
        System.out.println("Hrrrr Hrrrr");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating PibiGri");
    }

    public String getName(){
       return this.name = name + " - This is from the child class";

    }
}
