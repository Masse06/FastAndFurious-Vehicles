public class Vehicle {
    private String brand;
    private String model;
    private int maxSpeed;
    private String driver;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Vehicle(String brand, String model, int maxSpeed, String driver) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.driver = driver;
    }

    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.maxSpeed = 0;
        this.driver = "Unknown";
    }

    @Override
    public String showInfo() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", driver='" + driver + '\'' +
                '}';
    }
}
