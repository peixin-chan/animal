public class Animal {

    private int age;

    private String weight;

    public void run(){
        System.out.println("run...");
    }

    public Animal(int age, String weight) {
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("eat...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
