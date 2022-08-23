package programmers;

public class pro12950 {

    public static void main(String[] args) {
    }

    // arr1 과 arr2 의 크기는 같다는 조건하에 아래와 같이 만들었는데 결국 answer 도 크기가 같기 때문에 V2 와 같이 처리해도 가능하다.
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    // 코드가 조금은 깔끔해졌다.
    public int[][] solutionV2(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer[0].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}
