public class Staff {
    String brand;

    int power;

    int min;

    int max;

    Staff() {
        super();
        System.out.println("Created new Staff.");
    }

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

    public static void bigBrain(Staff staff) {
        if(staff.max >= 150) {
            System.out.println("He is big brain!");
        }
        else {
            System.out.println("He is not big brain :(");
        }
    }

    public static void powerLevel(Staff staff) {
        if(staff.power >= 150) {
            System.out.println("Power level 2!");
        }
        else {
            System.out.println("Power level 1...");
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", min=" + min +
                ", max=" + max +
                '}' + "\n";
    }
}