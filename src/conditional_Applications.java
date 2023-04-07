import java.util.Scanner;

public class conditional_Applications {
    public static void main(String[] args) {
        //현재 시각에 시간을 더한 시각을 출력하는 프로그램
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ( B+C>=60 ) {
            B=B+C-60;
            A++;
            if(A>=24){
                A=A-24;
            }
        } else {
            B=B+C;
        }
        System.out.println(A);
        System.out.println(B);
    }
}
