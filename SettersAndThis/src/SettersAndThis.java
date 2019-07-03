
class Frog {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class SettersAndThis {

    public static void main(String[] args) {

        Frog frog1 = new Frog();

        //frog1.name = "Bertie";    // don't need this, since we now have setters
        //frog1.age = 1;

        frog1.setName("Bertie");  // calling a method - setter method "setName()"
                            // does the same thing as directly accessing, but uses setter.
        frog1.setAge(1);

        System.out.println(frog1.getName() + " has an age of " + frog1.getAge());

    }
}
