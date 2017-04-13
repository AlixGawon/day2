package park;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017-04-12.
 */
public class ParkMain {

    public static void main(String[] args) throws Exception{//예외를 처리하지 않고 프로그램을 실행하겠다는 의미.
        // 실제로 실무에서 저럴 일 없음

        //문제 1) List<Park>로 변환
        //문제 2) 국가가 US가 아닌 볼파크 수는?
        //문제 3) alias가 있는 볼파크 수는?
        //문제 4) 볼파크 이름의 글자수 평균은?

        //FileReader로 파일 불러오고 BufferedReader로 파일 가독성 높이기

        BufferedReader br = new BufferedReader(new FileReader("src\\Parks.csv"));

        //데이터 담을 공간 List로 지정하기
        List<Park> parkList = new ArrayList<>();

        //기본 form 제거 후 2번째 줄 부터 읽는 방법
        br.readLine();

        //파일 입력 및 출력 방법
        String line = "";
        while ((line = br.readLine()) != null){//br.readLine()을 마련해놓은 line에 변수로 넣는다.
            // null은 빈 공간 의미

            //불러온 자료 split로 나누고 하나하나 데이터에 담기.
            String[] splitted = line.split(",");//,를 기준으로 나눈다.
            //List<Park> splitted1 = Arrays.asList(line.split(","));


        }





    }
}
