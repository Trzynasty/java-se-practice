package Section6;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0) this.height=0;
        else this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }
}
