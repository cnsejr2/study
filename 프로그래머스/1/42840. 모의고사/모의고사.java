import java.util.*;

class Solution {
    public ArrayList solution(int[] answers) {
        int[] score = new int[3];
        
        int[] arr1 = { 1, 2, 3, 4, 5}; // 5개
        int[] arr2 = { 2, 1, 2, 3, 2, 4, 2, 5}; // 8개
        int[] arr3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10개
        
        // 수포자 1 점수 계산
        for (int i  = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) score[0]++;
            if (answers[i] == arr2[i % arr2.length]) score[1]++;
            if (answers[i] == arr3[i % arr3.length]) score[2]++;
        }
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                list.add(i + 1);
            }
        }
        return list;
    }
}