package animalsfactory;

import animals.Bird;
import animals.Cat;
import animals.Crow;
import animals.Tiger;

public class WildAnimalFactory implements AnimalFactory {
    @Override
    public Bird getBird() {
        return new Crow();
    }
    @Override
    public Cat getCat() {
        return new Tiger();
    }

}
