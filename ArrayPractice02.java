package kadai5;
import java.util.Scanner;
public class ArrayPractice02 {
    public static void main(String[] args) {

        System.out.println("要素数の入力");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num = Integer.parseInt(s1);

        System.out.println("各要素の入力");

        var scores = new int[num];

        for(var a = 0; a < num; a++) {
            var s2 = sc.nextLine();
            var num1 = Integer.parseInt(s2);
            scores[a] = num1;
        }

        int sum = 0;
        double ave;

        for(int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
        }
        ave = (double) sum / scores.length;
        System.out.println("合計値：" + sum);
        System.out.print("平均値：" + ave);

        sc.close();

    }

}
