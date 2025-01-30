package org.example;

import java.awt.print.Pageable;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        int[][] edges1 = {{2, 3}, {4, 3}, {1, 1}, {2, 1}};
//        [2, 1, 1, 0]

//        int[] solution = solution(edges1);

        int[][] edges2 = {{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}};
//        [4, 0, 1, 2]

//        int[] solution2 = solution(edges2);

        int[][] land1 = {{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};
        //9
        Sichu sichu = new Sichu();
        int sichu1 = sichu.solution(land1);
        System.out.println("sichu1 = " + sichu1);

        int[][] land2 = {{1, 0, 1, 0, 1, 1}, {1, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 1}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
        //16
        int sichu2 = sichu.solution(land2);
        System.out.println("sichu2 = " + sichu2);

        int[][] land3 = {
                {0,1,0,1,0},
                {1,1,1,1,0},
                {0,1,0,1,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,1,0,0}
        };
        int sichu3 = sichu.solution(land3);
        System.out.println("sichu3 = " + sichu3);


    }

    public static int[] solution(int[][] edges) {
        int[] answer = new int[4];
        List<Integer>[] adjList = new ArrayList[1000001];
        int[][] inNout = new int[1000001][3];
        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            inNout[a][0]++;
            inNout[b][1]++;
            inNout[a][2] = 1;
            inNout[b][2] = 1;
            // a->b연결관계 표시
            if(adjList[a] == null){
                adjList[a] = new ArrayList<Integer>();
                adjList[a].add(b);
            }
            else adjList[a].add(b);
        }
        int idx = 0;
        for(int i=0; i<1000001; i++){
            //들어오는 간선은 없지만 나가는 간선이 2이상이면 생성된 정점
            if(inNout[i][1] == 0 && inNout[i][0] >=2){
                idx = i;
                answer[0] = i;
            }
        }
        //생성된 정점과 연결된 정점들 in 간선 감소시켜주기
        int totalCount = 0; //전체 모양 그래프 개수
        for(int x : adjList[idx]){
            inNout[x][1]--;
            totalCount++;
        }
        inNout[idx][0] = 0;
        inNout[idx][1] = 0;
        inNout[idx][2] = 0;
        for(int i=0; i<1000001; i++){
            //막대 그래프
            if(inNout[i][1] == 0 && inNout[i][2] ==1)answer[2]++;

            //8자모양 그래프
            if(inNout[i][1] == 2 && inNout[i][0]==2) answer[3]++;
        }
        answer[1] = totalCount - (answer[2] + answer[3]);

        return answer;
    }



//    public static int[] solution(int[][] edges) {
//        int[] answer = {};
//
//        HashMap<Integer, Integer> map1 = new HashMap<>();
//
//        for (int[] edge : edges) {
//            if(map1.containsKey(edge[0])) {
//                map1.put(edge[0], map1.get(edge[0]) + 1 );
//            } else {
//                map1.put(edge[0], 1);
//            }
//        }
//        System.out.println("map1 = " + map1);
//
//        HashMap<Integer, Integer> map2 = new HashMap<>();
//
//        for (int[] edge : edges) {
//            if(map2.containsKey(edge[1])) {
//                map2.put(edge[1], map2.get(edge[1]) + 1 );
//            } else {
//                map2.put(edge[1], 1);
//            }
//        }
//        System.out.println("map2 = " + map2);
//
////        map1.forEach();
//
//
//        return answer;
//
//    }


}