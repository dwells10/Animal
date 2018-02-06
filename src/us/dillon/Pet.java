package us.dillon;

/**
 * @author Matt Green Edited by Dillon Wells
 */
public abstract class Pet {
    protected String name;
    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}