import java.util.ArrayList;
import java.util.List;

public class FarmManagement {
    List<Animals> animals = new ArrayList<Animals>();

    void addAnimal(Animals a) {
        animals.add(a);
    }

    void printAnimalsCanWalk() {
        for (Animals a : animals) {
            if (a.walk()) {
                System.out.println(a.name);
            }
        }
    }

    void printAnimalsCanSwim() {
        for (Animals a : animals) {
            if (a.swim()) {
                System.out.println(a.name);
            }
        }
    }
    public static void main(String[] args) {
        FarmManagement farm = new FarmManagement();

        farm.addAnimal(new Pig("pig1"));
        farm.addAnimal(new Pig("pig2"));
        farm.addAnimal(new Duck("donaldDuck"));
        farm.addAnimal(new Fish("Nemo"));

        farm.printAnimalsCanWalk();
        System.out.println("--------------------");
        farm.printAnimalsCanSwim();
    }
}
