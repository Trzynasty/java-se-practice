public class Exercise3 {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay<=23 && hourOfDay>=0){
            if ((hourOfDay<8 || hourOfDay>22) && barking){return true;}
            else{return false;}
        }
        else{return false;}
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
    }
}
