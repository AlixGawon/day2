/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */
public class ArrayExample {
    public static void main(String[]args){
        //배열을 for문으로..

        int[] iArr = {1,2,3,4,5,6,7,8,9,10};

        for (int e : iArr ) {
            if (e % 5 == 0) {
                System.out.println("Bingo!");
            }else {
                System.out.println(e);
            }
        }
    }
}
