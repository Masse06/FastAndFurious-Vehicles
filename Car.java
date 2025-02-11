public class Car extends Vehicle{
    private int numDoors;
    private boolean hasNitro;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isHasNitro() {
        return hasNitro;
    }

    public void setHasNitro(boolean hasNitro) {
        this.hasNitro = hasNitro;
    }

    public Car(String brand, String model, int maxSpeed, String driver, int numDoors, boolean hasNitro) {
        super(brand, model, maxSpeed, driver);
        this.numDoors = numDoors;
        this.hasNitro = hasNitro;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", hasNitro=" + hasNitro +
                '}';
    }

    public int activateNitro(int maxSpeed) {
        hasNitro = true;
        maxSpeed = getMaxSpeed();
        maxSpeed += 50;
        return maxSpeed;
    }
}
