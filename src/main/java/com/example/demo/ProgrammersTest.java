package com.example.demo;


import java.time.LocalDate;

public class ProgrammersTest {

    public static void main(String[] args) {

        System.out.println(solution(5,24));

    }

    static String solution(int a, int b) {



        LocalDate ld = LocalDate.of(2016, a,b);
        String answer = ld.getDayOfWeek().toString().substring(0,3);

        return answer;

    }
}
