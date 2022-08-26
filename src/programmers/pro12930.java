package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * 문자열을 공백 단위로 단어로 분리하고, 짝수번 알파벳은 대문자, 홀수번 알파벳은 소문자로 변환하고 반환하기
 */
public class pro12930 {

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
        System.out.println(solution("hello"));
    }


    /*
    s 를 공백 단위로 분리하여 단어별로 split,
    단어를 문자별로 또 다시 split 하여 배열을 만들고 반복문을 통해 StringBuilder 를 만듦.
    이때, n 번째 알파벳임을 알기 위해 index 가 필요하기 때문에 for i 문을 사용했음.
    (iter 방식에서도 index 를 얻을 수 있을까? -> 변수를 사용해 루프에서 증가시키는 방법으로 써야할듯..)

    마지막에 공백이 들어 갈 수 있음 고로 split(" ", -1) 로 마지막 공백은 구분자로 쓰지 않도록 처리함
     */
    public static String solution(String s) {
        String[] tokenArray = s.split(" ", -1);
        List<String> resultList = new ArrayList<>();

        for(String token : tokenArray) {
            String[] element = token.split("");
            StringBuilder tempStringBuilder = new StringBuilder();

            for(int i = 0; i < element.length; i++) {
                if(i % 2 == 0) tempStringBuilder.append(element[i].toUpperCase());
                else tempStringBuilder.append(element[i].toLowerCase());
            }
            resultList.add(tempStringBuilder.toString());
        }
        return String.join(" ", resultList);
    }
}
