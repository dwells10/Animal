package us.dillon;

/**
 * @author Matt Green Edited by Dillon Wells
 *
 *  This is the Student Class. It extends Person and implements Talkable Interface
 */
public class Student extends Person implements Talkable {

    /**
     *  Integer for the age of the student
     */
    private int age;

    /**
     *
     * @param age The age of the student
     * @param name The name of the student
     */

    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     *
     * @return The age of the student
     */

    public int getAge() {
        return age;
    }

    /**
     *
     * @param age Set age of student
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return Return a string to talk
     */

    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
