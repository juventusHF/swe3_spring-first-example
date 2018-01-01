package ch.juventus.example;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet{" + "name='" + name + '\'' + '}';
    }
}
