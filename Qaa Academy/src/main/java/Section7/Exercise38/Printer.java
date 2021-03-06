package Section7.Exercise38;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel>-1 && tonerLevel<=100) this.tonerLevel = tonerLevel;
        else this.tonerLevel=-1;
        this.duplex = duplex;
        pagesPrinted=0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100){
            if (tonerAmount+tonerLevel<=100){
                tonerLevel+=tonerAmount;
                return tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint=duplex? pages/2+pages%2: pages;
        pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }
}
