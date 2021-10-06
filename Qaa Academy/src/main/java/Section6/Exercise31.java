package Section6;

public class Exercise31 {
    private double width;
    private double height;

    public Exercise31(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public Exercise31(){
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0) this.width=0;
        else this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0) this.height=0;
        else this.height = height;
    }

    public double getArea(){
        return height*width;
    }

    public static void main(String[] args) {
         Exercise31 wall = new Exercise31(5,4);
         System.out.println("area= " + wall.getArea());
         wall.setHeight(-1.5);
         System.out.println("width= " + wall.getWidth());
         System.out.println("height= " + wall.getHeight());
         System.out.println("area= " + wall.getArea());
    }
}
