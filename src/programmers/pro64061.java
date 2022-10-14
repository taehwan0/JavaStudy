package programmers;

public class pro64061 {

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int result = solution(board, moves);
        System.out.println(result);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        return answer;
    }
}
