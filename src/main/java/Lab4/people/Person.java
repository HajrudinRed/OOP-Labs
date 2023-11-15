package people;

public class Person {
    private String name;
    private String Street;

    public Person(String name,String Street){
        this.name = name;
        this.Street=Street;
    }
    public String toString(){
        return this.name+"\n"+this.Street+"\n";

    }

}
