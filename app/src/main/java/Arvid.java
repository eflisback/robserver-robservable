
// Robin extens Robservable, which contains all the observable-related logic
public class Arvid extends Robservable {
    
    // Robin does something, and calls setChanged() and notifyRobservers() from the parent class Robservable
    public void doSomething() {
        System.out.println("UUUUH! I do something");
        setChanged();
        notifyRobservers();
    }

}
