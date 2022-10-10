package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 신고 결과 받기
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334?language=java
 */
public class pro92334 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> indexMap = new HashMap<>();
        for(int i=0; i < id_list.length; i++) {
            indexMap.put(id_list[i], i);
        }

        HashMap<String, List<String>> reportMap = new HashMap<>();  
        for(String r : report) {
            String[] split = r.split(" ");
            String reporter = split[0];
            String target = split[1];

            List<String> reporterList = reportMap.getOrDefault(target, new ArrayList<>());
            if(!reporterList.contains(reporter)) reporterList.add(reporter);
            reportMap.put(target, reporterList);
        }

        int[] result = new int[id_list.length];
        for (String id : reportMap.keySet()) {
            List<String> reporterList = reportMap.getOrDefault(id, new ArrayList<>());
            if(reporterList.size() >= k) {
                reporterList.forEach(v -> {
                    Integer index = indexMap.get(v);
                    result[index] += 1;
                });
            }
        }

        return result;
    }
}
