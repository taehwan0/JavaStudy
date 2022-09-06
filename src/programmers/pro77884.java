package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * left 부터 right 까지의 숫자중
 * 약수의 개수가 짝수이면 +
 * 약수의 개수가 홀수이면 -
 * 하여 result 반환
 *
 * 제곱수인 경우 약수의 개수가 홀수라고 함
 * i % Math.sqrt(i) == 0 -> 홀수
 */
public class pro77884 {

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));

        System.out.println(solution2(13, 17));
        System.out.println(solution2(24, 27));
    }

    public static int solution(int left, int right) {
        int result = 0;

        for(int i = left; i <= right; i++) {
            List<Integer> divisor = getDivisor(i);
            if(divisor.size() % 2 == 0) result += i;
            else result -= i;
        }

        return result;
    }

    public static List<Integer> getDivisor(int a) {
        List<Integer> result = new ArrayList<>();

        for(int i=1; i<= a; i++) {
            if(a % i == 0) result.add(i);
        }

        return result;
    }

    public static int solution2(int left, int right) {
        int result = 0;

        for(int i = left; i <= right; i++) {
            if(i % Math.sqrt(i) == 0) result -= i;
            else result += i;
        }

        return result;
    }
}
