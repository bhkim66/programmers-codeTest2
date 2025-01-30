package org.example;

public class Sichu {
//    public int solution(int[][] land) {
//        int answer = 0;
//
//        int[][] oilMap = new int[land.length][land[0].length];
//
//
//        for (int i = 0; i < land.length; i++) {
//            for (int j = 0; j < land[0].length; j++) {
//                if(land[i][j] == 1) {
//                    oilMap[i][j] = i+1;
//                }
//            }
//        }
//
//        System.out.println("i : ");
//        for (int[] ints : oilMap) {
//            for (int anInt : ints) {
//                System.out.print(" " + anInt);
//            }
//            System.out.println(" ");
//        }
//
//
//        return answer;
//    }

    // x축 먼저 탐색 후 y축 탐색 x축 y축 움진인 거리 만큼 가져와서 넘기기
    public int solution(int[][] land) {
        int answer = 0;

        //x 좌표마다 존재하는 기름 수를 더한 값을 저장하는 배열
        int[] x = new int[land[0].length];

        for (int i = 0; i < land[0].length; i++) {
            for (int j = 0; j < land.length; j++) {
                if(land[j][i] == 0) {
                    continue;
                }
                int[] oil = findOil(land, i, j, 0, 0);
                for(int z = i; z<=oil[1]; z++) {
                    x[z] += oil[0];
                }
            }
        }
        answer = x[0];
        for (int i = 1; i < x.length; i++) {
            if(x[i] > answer) {
                answer = x[i];
            }
        }
        return answer;
    }

    public int[] findOil(int[][] land, int i, int j, int oilCount, int x) {
        int[] oil = new int[3];
        oil[0] = oilCount;
        oil[1] = x;
        if(j == land.length || i == land[0].length || i == -1 || j == -1) {
            return oil;
        }
        if(land[j][i] == 0) {
            return oil;
        }

        if(land[j][i] == 1) {
            land[j][i] = 0;
            oil[0] += 1;
            if(i > x) {
                oil[1] = i;
            }
            oil = findOil(land, i, j + 1, oil[0], oil[1]);
            oil = findOil(land, i, j - 1, oil[0], oil[1]);
            oil = findOil(land, i + 1, j, oil[0], oil[1]);
            oil = findOil(land, i - 1, j, oil[0], oil[1]);
        }

        return oil;
    }



//    public int solution(int[][] land) {
//        int answer = 0;
//
//        //x 좌표마다 존재하는 기름 수를 더한 값을 저장하는 배열
//        int[] x = new int[land[0].length];
//        int[][] oilMap = new int[land.length][land[0].length];
//
//        for (int i = 0; i < oilMap[0].length; i++) {
//            for (int j = 0; j < oilMap.length; j++) {
//                if(oilMap[j][i] == 1) {
//                    continue;
//                }
//                int[] oil = findOil(land, i, j, oilMap, 0, 0);
//                for(int z = i; z<=oil[1]; z++) {
//                    x[z] += oil[0];
//                }
//            }
//        }
//        answer = x[0];
//        for (int i = 1; i < x.length; i++) {
//            if(x[i] > answer) {
//                answer = x[i];
//            }
//        }
//        return answer;
//    }
//
//    public int[] findOil(int[][] land, int i, int j, int[][] oilMap, int oilCount, int x) {
//        int[] oil = new int[2];
//        oil[0] = oilCount;
//        oil[1] = x;
//        if(j == land.length || i == land[0].length) {
//            return oil;
//        }
//        if(land[j][i] == 0) {
//            return oil;
//        }
//
//        if(land[j][i] == 1 && oilMap[j][i] == 0) {
//            oilMap[j][i] = 1;
//            oil[0] += 1;
//            if(i > x) {
//                oil[1] = i;
//            }
//            oil = findOil(land, i, j + 1, oilMap, oil[0], oil[1]);
//            oil = findOil(land, i + 1, j, oilMap, oil[0], oil[1]);
//        }
//
//        return oil;
//    }

}
