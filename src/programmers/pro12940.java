package programmers;

import java.util.Arrays;

/**
 * 유클리드 호제법으로 최대공약수와 최소공배수 구하기
 * 2개의 자연수  a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단 a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
 * 이 성질에 따라, b를 r로 나눈 나머지 r0를 구하고, 다시 r을 r0로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다.
 * 이는 명시적으로 기술된 가장 오래된 알고리즘으로서도 알려져 있으며, 기원전 300년경에 쓰인 유클리드의 <원론> 제7권, 명제 1부터 3까지에 해당한다.
 */
public class pro12940 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }

    public static int[] solution(int n, int m) {
        if(m < n) {
            int temp = n;
            n = m;
            m = temp;
        }
        int gcdValue = gcd(n, m);
        int lcmValue = lcm(n, m, gcdValue);

        return new int[]{gcdValue, lcmValue};
    }

    /**
     * gcd(a, b) -> gcd(b, a % b)
     * if(a % b == 0) -> b 가 최대 공약수
     * else gcd(b, a % b) 재실행
     * @param n
     * @param m
     * @return
     */
    public static int gcd(int n, int m) {
        if(n % m == 0) return m;
        else return gcd(m, n % m);
    }


    /**
     * 최소 공배수는 (두 수의 곱 / 최대 공약수) 로 구할 수 있다.
     * @param n
     * @param m
     * @param gcd
     * @return
     */
    public static int lcm(int n, int m, int gcd) {
        return n * m / gcd;
    }
}
