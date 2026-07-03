public class JedliksToyCar {
            private int distance;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        if(battery <= 0) {
            return "Driven 2000 meters";
        }
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if(battery <= 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        distance = distance + 20;
        battery = battery - 1;
    }
}
