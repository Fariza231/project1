public class Animal {
    private String species;
    private String name;
    private int age;
    private String diet;
    private String feedingSchedule; // расписание кормления

    public Animal(String species, String name, int age, String diet, String feedingSchedule) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.diet = diet;
        this.feedingSchedule = feedingSchedule;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiet() {
        return diet;
    }

    public String getFeedingSchedule() {
        return feedingSchedule;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setFeedingSchedule(String feedingSchedule) {
        this.feedingSchedule = feedingSchedule;
    }

    public void displayInfo() {
        System.out.println("Animal: " + species + " | Name: " + name + " | Age: " + age +
                " | Diet: " + diet + " | Feeding Schedule: " + feedingSchedule);
    }
}
