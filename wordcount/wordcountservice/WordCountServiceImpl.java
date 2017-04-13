package wordcount.wordcountservice;


import java.util.List;

/**
 * Created by Administrator on 2017-04-13.
 */
public class WordCountServiceImpl implements WordCountService{//인터페이스 구현하기 위해서 만든 이름이라고 보면 됨.
// 인터페이스를 임플리먼츠하는 이유 : 인터페이스를 포함한 추상메서드를 오버라이딩하면서 구현하기 위해서.

    public int getWordCount(List<String> list) {
        int count =0;
        for (String e : list) {
            if (!e.equals("")) { //공백문자는 포함 안 하기.!가 not의 의미니까 equals메서드 이용하면 편함
                count++;
                System.out.println(e);

            }
        }
        return count;
    }
}
