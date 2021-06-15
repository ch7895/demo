package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void test() {
        assertEquals(solution68935(45),7);
        assertEquals(solution12900(4),5);


    }


    public int solution68935(int n) {

        StringBuilder sb = new StringBuilder();
        long tmpn = (long) n ;

        while(tmpn>0){
            sb.append(tmpn%3);
            tmpn = tmpn/3;
        }
        int three = 1;

        tmpn = Long.parseLong(sb.toString());
        int answer=0;

        while(tmpn>0){
            answer += tmpn % 10 * three;
            three = three*3;
            tmpn = tmpn/10;
        }
        return answer;
    }

    public int solution12900(int n) {

        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=2;

        for(int i=2; i<n; i++){
            arr[i]= (arr[i-2] +arr[i-1]) % 1000000007;
        }

        return arr[n-1];
    }

}
