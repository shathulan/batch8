public class Vehicle {
    private String make;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayinfo() {
        System.out.println("Manufacturer is  " + make);
        System.out.println("Year of Manufactures: " + year);

    }

}
