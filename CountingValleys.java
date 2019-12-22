//Problem link: https://www.hackerrank.com/challenges/counting-valleys/problem

import java.util.Scanner;

public class CountingValley {
    public static void countingValleys(String str){
        int seaLevel=0;
        int valley=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='D')
                seaLevel--;
            if(ch[i]=='U')
                seaLevel++;
            if(seaLevel==0 && ch[i]=='U')
                valley++;
        }
        System.out.println(valley);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String str=in.next();
        countingValleys(str);
    }
}
