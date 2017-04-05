/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */
public class Gugudan {
    public static void main(String[]args){

        int[] iArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                         21,22,23,24,25,26,27,28,29,30};

        //배열이 나오면 무조건 for ( :) 문 돌리기

        for (int e : iArr) {
            String converted = String.valueOf(e); //숫자가 문자형태로 변환된다

            if (converted.contains("3") || converted.contains("6")  || converted.contains("9")) {
                System.out.println("짝!");
            } else {
                System.out.println(converted);
            }
        }

    }
}
