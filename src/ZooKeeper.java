import java.util.ArrayList;
public class ZooKeeper {
    private String name;
    private int experience;
    private ArrayList<Animal> animals;

    public ZooKeeper(String name, int experience) {
        this.name = name;
        this.experience = experience;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayKeeperInfo() {
        System.out.println("ZooKeeper: " + name + " | Experience: " + experience + " years");
        System.out.println("Animals under care:");
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }
}