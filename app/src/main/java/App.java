public class App {

    public static void main(String[] args) {
        
        // Creating a Robin instance that can be observed (see his definition)
        Arvid arvid = new Arvid();

        // Creating an Olle instance, passing a reference to our Robin instance as argument
        new Olle(arvid);

        // Invoking a method in our Robin instance
        arvid.doSomething();
    }
}
