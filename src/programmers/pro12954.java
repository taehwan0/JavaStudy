package programmers;

import java.util.ArrayList;
import java.util.List;

public class pro12954 {
    public static void main(String[] args) {
        for (Long aLong : solution(5, 10)) {
            System.out.println(aLong);
        }

        for (Long aLong : solutionV2(5, 10)) {
            System.out.println(aLong);
        }
    }


    // int 자료형인 x, n 이 List<Long> 에 들어가려면 형변환이 필요했고, List -> Array 로 또 형변환이 필요했다.
    public static Long[] solution(int x, int n) {
        long sum = 0;
        List<Long> xList = new ArrayList<>();


        for(int i = 0; i < n; i++) {
            sum += x;
            xList.add(Long.parseLong(Long.toString(sum)));
        }
        return xList.toArray(new Long[xList.size()]);
    }

    // long 과 int 는 합연산이 형변환 없이 가능해서 간단하게 처리 할 수 있다.
    public static long[] solutionV2(int x, int n) {
        long[] arr = new long[n];
        arr[0] = x;

        for(int i=1; i< n; i++) {
            arr[i] = arr[i - 1] + x;
        }
        return arr;
    }
}
