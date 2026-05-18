import java.util.ArrayList;

public class UseFans {

    // Method for SINGLE Fan (NO toString allowed)
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("----------------------");
    }

    // Method for COLLECTION of Fans (NO toString allowed)
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            System.out.println("Fan Details:");
            System.out.println("Speed: " + fan.getSpeed());
            System.out.println("On: " + fan.isOn());
            System.out.println("Radius: " + fan.getRadius());
            System.out.println("Color: " + fan.getColor());
            System.out.println("----------------------");
        }
    }

    // TEST CODE
    public static void main(String[] args) {

        ArrayList<Fan> fans = new ArrayList<>();

        // Create collection of Fan objects
        fans.add(new Fan(Fan.FAST, true, 10, "blue"));
        fans.add(new Fan(Fan.MEDIUM, false, 8, "red"));
        fans.add(new Fan(Fan.SLOW, true, 6, "green"));

        // Test single fan method
        System.out.println("=== SINGLE FAN TEST ===");
        displayFan(fans.get(0));

        // Test collection method
        System.out.println("=== ALL FANS TEST ===");
        displayFans(fans);
    }
}
