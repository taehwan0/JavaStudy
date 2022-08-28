package programmers;

/**
 * 1 부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하기
 */
public class pro12921 {

    public static void main(String[] args) {
        System.out.println(solution(10)); // -> 2, 3, 5, 7
        System.out.println(solution(5)); // -> 2, 3, 5
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n ; i++) {
            if(isPrime(i)) answer++;
        }

        return answer;
    }

    public static boolean isPrime(int n) {

        for (int i = 2; i < ((int) Math.sqrt(n)) + 1; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
