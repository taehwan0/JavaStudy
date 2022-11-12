package programmers;

/**
 * 삼총사 https://school.programmers.co.kr/learn/courses/30/lessons/131705?language=java 3개의 요소를 뽑아서 0이 될 수 있는 경우의 수 반환
 */
public class pro131705 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2, 3, 0, 2, -5}));
        System.out.println(solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }

    public static int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
