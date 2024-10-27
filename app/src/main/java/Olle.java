// Since Olle implements Robserver, he must define an update() method which is run whenever the observers are notified after a change
public class Olle implements Robserver {

    public Olle(Arvid arvid) {
        
        // Calling the Robservable method addRobserver, passing itself as an argument
        arvid.addRobserver(this);
    }

    @Override
    public void update() {
        System.out.println("OMG ARVID DID SOMETHING!!!!");
    }
    
}
