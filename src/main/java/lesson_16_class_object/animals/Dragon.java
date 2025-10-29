package lesson_16_class_object.animals;

public class Dragon {

    // Додати поля класу: ім’я, вік, вага
    private String name;
    private int age;
    private static double weight;
    private Breed breed;


    // Створити конструктор без параметрів і додати sout
    public Dragon() {
        System.out.println("Створено невідомго дракона");
    }

    // Створити конструктор із параметрами
    public Dragon(String name, int age, double weight, Breed breed) {
        System.out.println("Викликано конструктор з параметрами");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void roar() {
        System.out.println(name + " випускає вогонь! 🔥");
    }

    public void voice() {
        System.out.println("Арррррррр!");
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
