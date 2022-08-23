package programmers;

import java.util.Arrays;

public class pro12947 {

    public static void main(String[] args) {
        System.out.println(solution2(10));
    }

    /**
     * 값을 받아서 각 자릿수를 구하기 위해 문자열로 변환 및 split, 그리고 각 자리수를 더하고 나눠지는 값으로 return true or false
     * @param x
     * @return
     */
    public static boolean solution(int x) {
        String s = Integer.toString(x);
        int sum = 0;

        for (String n : s.split("")) {
            sum += Integer.parseInt(n);
        }

        return x % sum == 0;
    }

    /**
     * reduce 를 활용해서 짧은 코드로 풀기!
     * @param x
     * @return
     */
    public static boolean solution2(int x) {
        String s = Integer.toString(x);
        Integer reduce = Arrays.stream(s.split("")).map(value -> Integer.parseInt(value)).reduce(0, (pre, value) -> pre + value);

        return x % reduce == 0;
    }
}
