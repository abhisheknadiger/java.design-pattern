public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        personBuilder.addName("Abhishek");
        personBuilder.addAge(20);

        Person person = personBuilder.build();
        System.out.println(person);
    }
}