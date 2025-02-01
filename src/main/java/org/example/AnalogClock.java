package org.example;

public class AnalogClock {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = 0;

        int total1 = h1 * 60 * 60 + m1 * 60 + s1;
        int total2 = h2 * 60 * 60 + m2 * 60 + s2;

        int diff = total2 - total1;
        int startSec = s1 * 720;
        int startMin = (m1 * 60 + s1) * 12;
        int startHour = h1 * 60 * 60 + m1 * 60 + s1;

        if ((h1 == 0 || h1 == 12) && m1 == 0 && s1 == 0) {
            answer += 1;
        }

        for (int i = 1; i <= diff; i++) {
            startSec += 720;
            startMin += 12;
            startHour += 1;
            if (startSec - startMin >= 0 && startSec - startMin < 708) {
                answer++;
            }
            if (startSec - startHour >= 0 && startSec - startHour < 719) {
                answer++;
            }
            if (startSec == 43200 && startMin == 43200 && startHour == 43200) {
                answer--;
            }
            if (startSec == 43200) startSec = 0;
            if (startMin == 43200) startMin = 0;
            if (startHour == 43200) startHour = 0;
        }

        return answer;
    }
}
