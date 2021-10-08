package Section6;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.setFloor(floor);
        this.setCarpet(carpet);
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea()* carpet.getCost();
    }
}
