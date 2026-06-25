// 1.Build a fitness tracker: interfaces Trackable (logActivity()), Reportable
// (generateReport()), Notifiable (sendAlert()). Class FitnessDevice
// implements all three. Add a default method resetData() to Trackable.
// Demonstrate multiple interface implementation Java cannot do with
// classes.
public class ScenarioBasedFittness {
    public static void main(String[] args) {
        // Implement the fitness tracker scenario here
        FitnessDevice device = new FitnessDevice();
        device.logActivity("Running", 30);
        device.generateReport();
        device.sendAlert("Time to hydrate!");
        device.resetData();
    }
}

interface Trackable {
    void logActivity(String activity, int duration);

    default void resetData() {
        System.out.println("Tracker data reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    private String lastActivity;
    private int lastDuration;

    @Override
    public void logActivity(String activity, int duration) {
        this.lastActivity = activity;
        this.lastDuration = duration;
        System.out.println("Logged activity: " + activity + " for " + duration + " minutes.");
    }

    @Override
    public void generateReport() {
        if (lastActivity == null) {
            System.out.println("No activities logged yet.");
        } else {
            System.out.println("Report: Last activity was " + lastActivity + " for " + lastDuration + " minutes.");
        }
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }
}
