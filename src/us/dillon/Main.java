package us.dillon;

import java.util.ArrayList;

public class Main {
    static FileOutput outFile = new FileOutPut("animals.txt");
    public static void main(String[] args) {

        ArrayList<Talkable> zoo = new ArrayList<>();
        zoo.add(new Dog(true, "Pete"));
        printOut(zoo.get(0));
        zoo.add(new Cat(9, "Anne Belly"));
        printOut(zoo.get(1));
        zoo.add(new Student(19, "Joe John Johnson"));
        printOut(zoo.get(2));
        for (Talkable thing: zoo) {
            printOut(thing);
        }
        outFile.fileOut();
    }

    public static void printOut(Talkable p)  {
        System.out.println(p + " says=" + p.talk());
        fileOutput.fileWrite(p + " says=" + p.talk());
        if (p instanceof Cat) {
            Cat c = (Cat)p;
            System.out.println(((Cat) p).getMousesKilled());
        }

    }
}
