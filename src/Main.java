public class Main {
    static int Sequential (int[]Number,int sources){
        for (int i = 0; i< Number.length; i++){
            if( sources==Number[i]){
                return i;
            }
        }
    return -1;
}
public static void main (String[] args){
        int[] Number= {2,1,5,6,7,-19,-20,10};
        int sources = 7;

        System.out.println(Sequential(Number,sources));
}
}

