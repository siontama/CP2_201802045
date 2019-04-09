package kr.ac.cnu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cmd;
        int a, b;
        Scanner input = new Scanner(System.in);
        ScientificCalculator c1 = new ScientificCalculator();

        while (true) {
            System.out.print("연산 선택 (1.sum 2.sub 3.mul 4.div 5.log 6.square 9.종료) : ");
            cmd = input.nextInt();
            if (cmd == 9)
                break;
            System.out.print("첫번째 수 : ");
            a = input.nextInt();
            System.out.print("두번째 수 : ");
            b = input.nextInt();
            if (cmd == 1)
                System.out.println(a + " + " + b + " = " + c1.sum(a, b));
            else if (cmd == 2)
                System.out.println(a + " - " + b + " = " + c1.sub(a, b));
            else if (cmd == 3)
                System.out.println(a + " * " + b + " = " + c1.mul(a, b));
            else if (cmd == 4)
                if (b == 0) System.out.println("나누는 수는 0이 될 수 없습니다.");
                else System.out.println(a + " / " + b + " = " + c1.div(a, b));
            else if (cmd == 5)
                if (b == 0) System.out.println("로그의 윗수는 0이 될 수 없습니다.");
                else if (a < 0) System.out.println("로그의 밑은 0보다 커야 합니다.");
                else if (a == 1) System.out.println("로그의 밑은 1이 될 수 없습니다");
                else System.out.println(a + " * ㅣn" + b + " = " + c1.log(a, b));
            else if (cmd == 6)
                System.out.println(a + " ^ " + b + " = " + c1.square(a, b));
        }
    }
}
