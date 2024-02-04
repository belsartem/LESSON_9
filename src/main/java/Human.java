import java.util.List;

public class Human {
    private final int age;
    private final String name;
    private final boolean isClever;

    public Human(int age, String name, boolean isClever) {
        this.age = age;
        this.name = name;
        this.isClever = isClever;
    }

    public Human() {
        this(0, null, false);
    }

    public Human incrementAge(int newAge) {
        newAge = 0;
        return new Human(age + newAge, name, isClever);
    }

    public void printHobbies(List<String> hobbies) {
        System.out.println(hobbies);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isClever=" + isClever +
                '}';
    }
}