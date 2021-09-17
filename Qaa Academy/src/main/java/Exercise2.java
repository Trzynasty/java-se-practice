public class Exercise2 {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes=kiloBytes/1024;
            System.out.printf("%s KB = %s MB and %s KB%n",kiloBytes,megaBytes,(kiloBytes-megaBytes*1024));
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
