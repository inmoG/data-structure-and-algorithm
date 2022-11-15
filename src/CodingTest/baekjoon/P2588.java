package CodingTest.baekjoon;

import java.util.Scanner;

public class P2588 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            String[] strNum = String.valueOf(num2).split("");
            for(int i = 0; i<strNum.length; i++){
                int num = Integer.parseInt(strNum[i]);
                System.out.format("%d * %d: ", num1, num);
                System.out.print(num1 * num);
                System.out.println();
            }
            System.out.println(num1 * num2);
        }
}
