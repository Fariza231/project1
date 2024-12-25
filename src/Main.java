public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion", "Simba", 7, "Carnivore", "12:00 PM");
        Animal elephant = new Animal("Elephant", "Dumbo", 10, "Herbivore", "10:00 AM");
        Animal panda = new Animal("Panda", "Po", 5, "Herbivore", "3:00 PM");

        ZooKeeper john = new ZooKeeper("John", 10);
        ZooKeeper sarah = new ZooKeeper("Sarah", 5);

        john.addAnimal(lion);
        john.addAnimal(elephant);
        sarah.addAnimal(panda);

        Zoo zoo = new Zoo("National Zoo");
        zoo.addZooKeeper(john);
        zoo.addZooKeeper(sarah);

        zoo.displayZooInfo();
    }
}