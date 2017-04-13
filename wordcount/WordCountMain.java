package wordcount;

import wordcount.wordcountservice.WordCountService;
import wordcount.wordcountservice.WordCountServiceImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-04-13.
 */
public class WordCountMain {
    public static void main(String[] args) {
//파일 불러와서 보기 쉽게 BufferedReader 형식으로 변환한 후 데이터 리스트 만들기


        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\closer.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line = "";
            List<String> list = new ArrayList<>();//파일에서 나온 데이터 리스트 만들기
            // 그리고 WordCountService에 갖다줌

            String[] splitted = line.split(" ");//String 객체를 splitted로 설정 후 스페이스(공백)으로 나눈다.
            // String[]로 return하는

            for (String e : splitted) { //따로 클래스를 만든 것이 아니기 때문에 그냥 String으로 지정해도 됨.
                list.add(e);//list에 e를 넣는다.
        }
        //인터페이스 이용
        WordCountService service = new WordCountServiceImpl();//인터페이스 이용. 상속같은 느낌으로다가 씀.
        // 인터페이스의 변수를 임플리먼트 클래스에서 재사용하는 것이기 때문에 이렇게 적음
        int count = service.getWordCount(list); //데이터를 실제로 분석하는 함수
        System.out.println(count);

    }
}
