package Backend;

public class Area {

    private double redius;
    private double redius2;
     private double redius3;
    private double redius4;

    public double getRad() {
        return redius;
    }

    public double getRad2() {
        return redius2;
    }
    public double getRad3() {
        return redius3;
    }

    public double getRad4() {
        return redius4;
    }

    public Area(int rad, double rad2) {
        this.redius = (rad * rad) * 3.14;
        this.redius2 = (rad2 * rad2) * 3.14;
        this.redius3 = (2 * 3.14)*rad;
        this.redius4 = (2 * 3.14)*rad2;
    }
}
