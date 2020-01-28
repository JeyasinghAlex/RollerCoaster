package Temp;

public class Visitor {
    private String name;
    private int age;
    private String gender;

    public Visitor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return " name = '" + name + ", age = " + age + ", gender = '" + gender;
    }
}
