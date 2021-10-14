package Section6.Exercise35;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
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
