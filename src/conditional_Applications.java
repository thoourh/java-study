import java.util.Scanner;

public class conditional_Applications {
    public static void main(String[] args) {
        //현재 시각에 시간(분)을 더한 시각을 출력하는 프로그램
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ( B+C>=60 ) {
            if (A+(B+C)/60>=24) {
                A=(A+(B+C)/60)-24;
                B=(B+C)%60;
            } else {
                A=(A+(B+C)/60);
                B=(B+C)%60;
            }
        } else {
            B=B+C;
        }
        System.out.print(A);
        System.out.print(" ");
        System.out.print(B);
    }
}
