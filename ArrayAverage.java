/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */
public class ArrayAverage {
    public static void main(String[]args){

        //많은 수의 배열값의 평균을 구하기(배열 갯수 구하기)

        int[] iArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
                ,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};

        int averageLength = iArr.length;
        int sum = 0;

        for (int e : iArr) {
            sum += e; //sum = sum + e;
        }

        int sumAverage = sum / averageLength;

        System.out.println("배열의 평균은" + sumAverage + "입니다.");
    }
}
