package hello

public final class Program {

    public Program() {}
    
    public String greet(final Person person) {
        return "Hello ${person.name()}!"
    }
}