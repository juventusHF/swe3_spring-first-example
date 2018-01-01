package ch.juventus.example;

import java.util.Arrays;
import java.util.List;

public class PetStoreImpl implements PetStore {

    private static List<Pet> pets = Arrays.asList(
            new Pet("Tom"),
            new Pet("Jerry")
    );

    public List<Pet> loadAllPets() {
        return pets;
    }
}
