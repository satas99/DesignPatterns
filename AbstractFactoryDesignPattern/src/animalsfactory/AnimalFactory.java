package animalsfactory;

import animals.Bird;
import animals.Cat;

public interface AnimalFactory {
    Bird getBird();
    Cat getCat();
}
