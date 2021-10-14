package Section6.Exercise32;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Point(){
    }

    public double distance(Point point){
        int xA=this.getX();
        int yA=this.getY();
        int xB= point.getX();
        int yB= point.getY();
        return Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    }

    public double distance(int x, int y){
        return distance(new Point(x,y));
    }

    public double distance(){
        return distance(0,0);
    }
}
