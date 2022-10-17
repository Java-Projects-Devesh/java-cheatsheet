package JavaABasicsAndIntermediateDemo;

class JapaneseCar {
    private static String country ;
    private static int numberOfCars;
    private int VIN_NUMBER;
    private String make;
    private double price;
    private boolean isPremium;

    public JapaneseCar(int VIN_NUMBER) {
        this.VIN_NUMBER = VIN_NUMBER;
        numberOfCars++;
    }

    public JapaneseCar(int VIN_NUMBER, String make) {
        this.VIN_NUMBER = VIN_NUMBER;
        this.make = make;
        numberOfCars++;
    }

    public JapaneseCar(int VIN_NUMBER, String make, double price, boolean isPremium) {
        this.VIN_NUMBER = VIN_NUMBER;
        this.make = make;
        this.price = price;
        this.isPremium = isPremium;
        numberOfCars++;
    }

    public int getVIN_NUMBER() {
        return VIN_NUMBER;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        System.out.println("Country is set to: " + country);
        JapaneseCar.country = country;
    }

    public static int getNumberOfCars(){
        System.out.println(numberOfCars);
        return numberOfCars;
    }
}

