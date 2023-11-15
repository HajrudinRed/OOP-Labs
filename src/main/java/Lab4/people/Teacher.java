package people;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String Street, int salary) {
        super(name,Street);
        this.salary = salary;
    }
    public String toString(){
        return super.toString()+" "+this.salary+" euros/month";

    }
}
