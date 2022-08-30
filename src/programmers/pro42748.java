package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * K번째 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java
 *
 * 입력받은 배열에서 커맨드에 맞게 배열 추출 후 정렬하고 인덱스 리턴하기
 * [2, 3, 1, 4, 5] 에 커맨드 [2, 3, 1] -> [3, 1] 추출 및 [1, 3] 으로 정렬 1번째 요소 -> 1
 */
public class pro42748 {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, command)));
    }

    /**
     * array 또는 List 로 풀기
     * 가변 길이를 사용하려면 List 가 좋기는 한데 형변환이 필요함.
     * 길이를 알 수 있다면 array 방식이 좋은듯
     * @param array
     * @param commands
     * @return
     */
    public static int[] solution(int[] array, int[][] commands) {
//        List<Integer> answer = new ArrayList<>();
        int[] result = new int[commands.length];
        int i = 0;

        for (int[] command : commands) {
            int[] copyArray = Arrays.copyOfRange(array, command[0] - 1, Math.min(command[1], array.length));
//            answer.add(Arrays.stream(copyArray).sorted().toArray()[command[2] - 1]);

            result[i] = Arrays.stream(copyArray).sorted().toArray()[command[2] - 1];
            i++;
        }

//        return answer.stream().mapToInt(value -> value).toArray();
        return result;
    }
}
