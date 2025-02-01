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

//        int[][] land1 = {{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};
//        //9
//        Sichu sichu = new Sichu();
//        int sichu1 = sichu.solution(land1);
//        System.out.println("sichu1 = " + sichu1);
//
//        int[][] land2 = {{1, 0, 1, 0, 1, 1}, {1, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 1}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
//        //16
//        int sichu2 = sichu.solution(land2);
//        System.out.println("sichu2 = " + sichu2);
//
//        int[][] land3 = {
//                {0,1,0,1,0},
//                {1,1,1,1,0},
//                {0,1,0,1,0},
//                {0,1,1,1,0},
//                {0,0,0,0,0},
//                {0,0,1,0,0},
//                {0,0,1,0,0}
//        };
//        int sichu3 = sichu.solution(land3);
//        System.out.println("sichu3 = " + sichu3);

        AnalogClock analogClock = new AnalogClock();

//        int h = 0, m = 5, s = 30;
//        int h0 = 0, m0 = 7, s0 = 0;
//        int solution0 = analogClock.solution(h, m, s, h0, m0, s0); // 2
//
//        int h1 = 12, m1 = 0, s1 = 0;
//        int h2 = 12, m2 = 0, s2 = 30;
//
//        int solution1 = analogClock.solution(h1, m1, s1, h2, m2, s2); // 1

//        int h3 = 0, m3 = 6, s3 = 1;
//        int h4 = 0, m4 = 6, s4 = 6;
//        int solution2 = analogClock.solution(h3, m3, s3, h4, m4, s4); //0

//        int h5 = 11, m5 = 59, s5 = 30;
//        int h6 = 12, m6 = 0, s6 = 0;
//        int solution3 = analogClock.solution(h5, m5, s5, h6, m6, s6); //1

        int h7 = 11, m7 = 58, s7 = 59;
        int h8 = 11, m8 = 59, s8 = 0;
        int solution4 = analogClock.solution(h7, m7, s7, h8, m8, s8); //1

        int h9 = 1, m9 = 5, s9 = 5;
        int h10 = 1, m10 = 5, s10 = 6;
        int solution5 = analogClock.solution(h9, m9, s9, h10, m10, s10); //2

        int h11 = 0, m11 = 0, s11 = 0;
        int h12 = 23, m12 = 59, s12 = 59;
        int solution6 = analogClock.solution(h11, m11, s11, h12, m12, s12); //2852
    }





}