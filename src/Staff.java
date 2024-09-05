public class Staff {
    String brand;

    int power;

    int min;

    int max;

    public Staff(String brand, int power, int min, int max) {
        this.max = max;
        this.brand=brand;
        this.min = min;
        this.power=power;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}