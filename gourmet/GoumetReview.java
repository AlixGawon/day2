package gourmet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-04-12.
 */
public class GoumetReview {
    public static void main(String[] args) {
        Goumet spoon = new Goumet();
        spoon.title = "숟가락반상 마실";
        spoon.mainMenu = "한정식 ,떡갈비, 갈비찜";
        spoon.score = 111;

        Goumet sushiMayjin = new Goumet();
        sushiMayjin.title = "스시메이진";
        sushiMayjin.mainMenu = "스시, 스시뷔페";
        sushiMayjin.score = 70;

        Goumet flavor = new Goumet();
        flavor.title = "맛찬들";
        flavor.mainMenu = "삼겹살, 한우, 목살";
        flavor.score = 49;

        Goumet sushiChoi = new Goumet();
        sushiChoi.title = "최우영스시";
        sushiChoi.mainMenu = "초밥,회전초밥";
        sushiChoi.score = 49;

        Goumet ironPlate = new Goumet();
        ironPlate.title = "철판목장";
        ironPlate.mainMenu = "스테이크, 철판, 함박스테이크";
        ironPlate.score = 46;

        List<Goumet> list = new ArrayList<>();//Goumet형의 list에 위의 정보들 담기.
        list.add(spoon);
        list.add(sushiMayjin);
        list.add(flavor);
        list.add(sushiChoi);
        list.add(ironPlate);

        //맛집 점수의 평균 구하기
        int scoreTotal =0;

        for (Goumet e : list ) {
            scoreTotal = scoreTotal + e.score;//list 다 돌 때까지 e(score)다 더하기.
        }

        System.out.println("총 합" + scoreTotal);
        System.out.println("평균" + scoreTotal/(list.size()));

    }
}
