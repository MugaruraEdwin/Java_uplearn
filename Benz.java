public class Benz extends Car{

    private boolean isCar_stand;
    private boolean isLuxurious;
    public Benz(){
        super("Mercedes", "pink" );
    }
    public Benz(String brand, String color, boolean isCar_stand, boolean isLuxurious) {
        super(brand, color);
        this.isCar_stand = isCar_stand;
        this.isLuxurious = isLuxurious;
    }

    @Override
    public String toString() {
        return "Benz{" +
                "isCar_stand=" + isCar_stand +
                ", isLuxurious=" + isLuxurious +
                '}';
    }

    @Override
    public String goesFast(String speed) {
        System.out.println("Car moves super fast at a speed of " +speed);
        return super.goesFast(speed);
    }
}
