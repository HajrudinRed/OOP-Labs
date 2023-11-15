package people;

public class Student extends Person {
    private int credits;

    public Student(String name, String Street) {
        super(name, Street);
        this.credits = 0;

    }

    public int credits() {
        return credits;
    }

    public int study() {
        credits++;
        int credits1 = credits;
        return credits1;
    }

    public String toString() {
        return super.toString() + "credits " + this.credits;
    }
}


