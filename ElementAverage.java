/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */
public class ElementAverage {
    public static void main(String[]args){
        //베열 안에 있는 단어의 문자열 개수 평균 구하기

        String[] iArr = {"숟가락반상마실","스시메이진","맛찬들","최우영스시",
                "철판목장","용호낙지","은행골","메이비","돌배기집"};

        int sum = 0;
        int numOfChar = 0;
        int sumAverage = 0;
        int averageLength = iArr.length;

        for (String e : iArr) {
         numOfChar = e.length();
         //System.out.println(numOfChar);
            sum = sum + numOfChar;
        }

        sumAverage = sum / averageLength;
        System.out.println("글자수 평균 " + sumAverage);



    }
}
