package com.example.demo;


import java.time.LocalDate;
import java.util.*;

public class ProgrammersTest {

    public static void main(String[] args) {

        //System.out.println(solution12943(626331));
        //System.out.println(solution12930("Hello  eVeryone"));
        //solution12930("hello World");
        //System.out.println(solution12914(500));

        /**
         *  [6, 10, 2]	"6210"
         *  [33,32, 30, 34, 5, 9]	"9534330"
         *  [10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  987654321101000
         *  [412, 41]
         * [303,30]
         */
        int[] a = {0,0};
        System.out.println(solution42746(a));


    }

    static String solution(int a, int b) {

        LocalDate ld = LocalDate.of(2016, a,b);
        String answer = ld.getDayOfWeek().toString().substring(0,3);

        return answer;

    }

   private static int solution12943(int num) {
        int answer = 0;
        long tmp = num;

        while(tmp!=1 && answer < 500){

            if(tmp%2==0) {  tmp = tmp/2; }
            else{  tmp = tmp*3+1; }
            answer++;
        }

        return (tmp==1) ?  answer : -1;
    }

    private static String solution12930(String s){

        char[] strArr = s.toCharArray();

        for(int i=0, j=0; i<strArr.length; i++){
            if(strArr[i]==' '){
                continue;
            }

            if(i%2==0){ strArr[i] = (strArr[i] >= 'a')? (char) (strArr[i] - 32) : strArr[i] ; }
            else{       strArr[i] = (strArr[i] <= 'Z')? (char) (strArr[i] + 32) : strArr[i];  }
        }

        return new String(strArr);
    }

    static boolean solution12909(String s) {
        Stack<Character> st = new Stack<>();
        char[] strArr = s.toCharArray();

        for(int i=0; i<strArr.length; i++){

            if(strArr[i]=='('){
                st.push('(');
            }else if(strArr[i]==')'){

                if(st.isEmpty()) return false;
                else st.pop();
            }
        }

        return st.isEmpty();
    }

    static long solution12914(int n) {

        if(n==1 || n==2){
            return n;
        }

        long[] arr = new long[n];

        arr[0]=1;
        arr[1]=2;

        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return (long) arr[arr.length-1]%1234567;
    }

    static String solution42746(int[] numbers) {


        String[] strArrr = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            strArrr[i] = String.valueOf(numbers[i]);
        }

        List<String> strList = Arrays.asList(strArrr);


        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String hero1, String hero2) {

                System.out.println("before###"+hero1 + "/" + hero2);
                if(hero1.length() > hero2.length()){
                    hero2 = String.format("%"+hero1.length()+"s", "").replace(' ',hero2.charAt(0));

                }else if (hero1.length() < hero2.length()){
                    hero1 = String.format("%"+hero2.length()+"s", "").replace(' ',hero1.charAt(0));
                }

                System.out.println("after###"+hero1 + "/" + hero2);
                System.out.println(hero1.compareTo(hero2)*-1);
                return hero1.compareTo(hero2)*-1;
            }
        });

        return String.join("",strList);

    }
}
