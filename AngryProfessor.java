//Problem link: https://www.hackerrank.com/challenges/angry-professor/problem

import java.util.Scanner;

public class Main {
    public static void angryProfessor(int attendeesThreshold, int[] students){
        int threshold=0;
        for(int i=0;i<students.length;i++){
            if(students[i]<=0)
                threshold++;
        }
        if(threshold<attendeesThreshold)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i=0;i<testCase;i++){
            int studentsNumber = in.nextInt();
            int[] students = new int[studentsNumber];
            int attendeesThreshold = in.nextInt();
            for(int j=0;j<studentsNumber;j++)
                students[j] = in.nextInt();
            angryProfessor(attendeesThreshold,students);
        }
        in.close();
    }
}
