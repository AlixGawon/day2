package mapml.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-04-13.
 */
public class ParkModel {
    public static void main(String[] args) {

        //List<Park> list = new ArrayList<>(); //list for park object

        Map<String, Park> map = new HashMap<>();//해쉬맵 쓸 때는 Map<Key, Value>로 써야함.

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Parks.csv"));
            //위의 구문은 예외상황이 발생해서 에러가 난다 그러므로 try, catch문을 사용한다(빨간전구)
            br.readLine();//맨 처음 한 줄 띄어넘기
            String line = "";//한 줄 씩 읽을 데이터를 위한 변수 지정
            while ((line = br.readLine()) != null) {//한 줄씩 읽을 때 만약 공백이 나오지 않을 때!
                // 다행히 이번 데이터에는 공백이 없음. 공백 있는 것은 HallOFFame의 main예제 볼 것
                String[] splitted = line.split(",");//한 줄 데이터 들어간 line을 split하는 과정

                //Map에 넣기 List에서는 add 쓰고 HashMap에서는 put을 씀

                map.put(splitted[0], new Park(splitted[1],splitted[2],
                        splitted[3],splitted[4],splitted[5]));
                //0번째가 key, 그 다음부터가 value.
                // 앞에 Map<String, Park> map = new HashMap<>();라고 한 것에서 보면
                // Key부분을 splitted[0]으로 지정한 것이고, value는 Park에서 불러옴.

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } //try문 안에 모든 것 넣기!
        System.out.println(map);
    }
    }
