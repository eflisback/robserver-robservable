import java.util.LinkedList;
import java.util.List;

public class Robservable {

    // This list will contain all of the observers that 'listen' for changes
    List<Robserver> robservers = new LinkedList<>();
    
    // This variable will determine wether we should call update() on the observers or not
    private boolean changed = false;

    // Method for adding observers to our list
    public void addRobserver(Robserver robserver) {
        robservers.add(robserver);
    }

    // Method for deleting an observer from our list
    public void deleteRobserver(Robserver robserver) {
        robservers.remove(robserver);
    }

    // Called from Arvid, which inherits from Robservable
    protected void setChanged() {
        changed = true;
    }

    // This function loops through all observers and invokes the update() method
    public void notifyRobservers() {
        if (changed) {
            for (Robserver robserver : robservers) {
                robserver.update();
            }
        }
        changed = false;
    }
}
