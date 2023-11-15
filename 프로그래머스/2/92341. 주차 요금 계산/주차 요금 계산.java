/*
    5H : 계산은 했으나, 배열로 전달 못함
    
    차량번호를 기준으로 for문 실행
        check가 true인 경우, 이미 조회한 차량번호임
        조회가 끝났음에도 inout이 true라면 23:59에 출차, 그때 records 위치를 k에 저장
        e > 0 : 두 번 이상 입/출차 한 경우 


*/
import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        boolean[] check = new boolean[records.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < records.length; i++) {
            String[] r = records[i].split(" ");
            if (!check[i]) {
                check[i] = true;
                boolean inout = false;
                int time = 0;
                int k = 0; int e = 0;
                for (int j = i; j < records.length; j++) {
                    String[] st = records[j].split(" ");
                    if (r[1].equals(st[1])) {
                        check[j] = true;
                        if (st[2].equals("IN")) {
                            inout = true;
                            k = j;
                            if (e > 0) {
                                r = records[j].split(" ");
                            }
                        } else {
                            inout = false; 
                            e++;
                            String[] inTime = r[0].split(":");
                            String[] outTime = st[0].split(":");
                            int hour = Integer.parseInt(outTime[0]) - Integer.parseInt(inTime[0]);
                            int minute = Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]);
                            
                            if (minute < 0) {
                                time = time + ((hour - 1) * 60 + Integer.parseInt(outTime[1]) + (60 - Integer.parseInt(inTime[1])));
                            } else {
                                time = time + (hour * 60 + minute);
                            }
                        }
                    }
                }
                 // 23:59 출차 : 마지막 내역이 입차인 경우
                String[] inR = records[k].split(" ");
                if (inout) {
                    String[] inTime = inR[0].split(":");
                    time += ((23 - Integer.parseInt(inTime[0])) * 60 + 59 - Integer.parseInt(inTime[1]));
                }

                // 주차요금계산
                int result  = fees[1]; // 기본요금
                time -= fees[0]; // 기본시간
                if (time < 0) {
                    time = 0;
                }

                if (time % fees[2] != 0) {
                    result += ((time / fees[2] + 1) * fees[3]);
                } else {
                    result += ((time / fees[2]) * fees[3]);
                }
                map.put(inR[1], result);
            }
        }
        
        // 검색 참고
        // 차량번호가 작은 자동차부터 청구할 주차 요금을 차례대로 정수배열에 담은 것
        int[] answer = new int[map.size()];
        int q = 0;
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByKey());
        for(Map.Entry<String, Integer> entry : entryList){
            answer[q] = entry.getValue();
            q++;
        }
        
        return answer;
    }
}