import animals.Bird;
import animals.Cat;
import animalsfactory.AnimalFactory;
import animalsfactory.PetAnimalFactory;
import animalsfactory.WildAnimalFactory;

public class DemoFactory {
    public static void main(String[] args) {

        AnimalFactory pet = new PetAnimalFactory();
        Bird parrot = pet.getBird();
        Cat siamese = pet.getCat();
        System.out.println(siamese.getType());
        System.out.println(parrot.getType());

        AnimalFactory wild = new WildAnimalFactory();
        Bird crow = wild.getBird();
        Cat tiger = wild.getCat();
        System.out.println(crow.getType());
        System.out.println(tiger.getType());
    }
}
