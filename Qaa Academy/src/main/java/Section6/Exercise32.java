package Section6;

public class Exercise32 {
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

    public Exercise32(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Exercise32(){
    }

    public double distance(Exercise32 exercise32){
        int xA=this.getX();
        int yA=this.getY();
        int xB= exercise32.getX();
        int yB= exercise32.getY();
        return Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    }

    public double distance(int x, int y){
        return distance(new Exercise32(x,y));
    }

    public double distance(){
        return distance(0,0);
    }

    public static void main(String[] args) {
        Exercise32 first = new Exercise32(6, 5);
        Exercise32 second = new Exercise32(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Exercise32 point = new Exercise32();
        System.out.println("distance()= " + point.distance());
    }
}
