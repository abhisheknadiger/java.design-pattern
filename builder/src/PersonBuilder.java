public class PersonBuilder {

    private final Person person;

    PersonBuilder(){
        person = new Person();
    }

    public void addName(String name){
        person.setName(name);
    }
    public void addAge(int age){
        person.setAge(age);
    }
    public Person build(){
        return person;
    }
}
