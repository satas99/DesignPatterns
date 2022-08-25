package animalsfactory;

import animals.Bird;
import animals.Cat;
import animals.Parrot;
import animals.Siamese;

public class PetAnimalFactory implements AnimalFactory {
    @Override
    public Bird getBird() {
        return new Parrot();
    }

    @Override
    public Cat getCat() {
        return new Siamese();
    }
}
