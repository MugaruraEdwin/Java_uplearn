public class Toyota extends Car {

    private String size;
    private String age;

    public Toyota(){
        super("Harrier", "red");
    }

    public Toyota(String brand, String color, String size, String age) {
        super(brand, color);
        this.size = size;
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String goesFast(String speed) {
        System.out.println("That car is really slow travelling at average speeds of" +speed+ " due to it's " +size + " size" );
        return super.goesFast(speed);
    }

    public void setAge(String age) {
        this.age = age;
    }
}
