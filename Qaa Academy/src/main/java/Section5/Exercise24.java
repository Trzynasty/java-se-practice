package Section5;

public class Exercise24 {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount<0 || smallCount<0 || goal<0) return false;
        int kilos=0;
        for (int i=1;i<=bigCount;i++){
            kilos+=5;
            if (kilos==goal) return true;
            if (kilos>goal) {
                kilos=(i-1)*5;
                break;
            }
        }
        return goal - kilos <= smallCount;
    }

    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (-3, 2, 12));
    }
}
