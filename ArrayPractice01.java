package kadai5;

public class ArrayPractice01 {
    public static void main(String[] args){
        int[] scores = {20,78,42,56,70,90,52,16,81,34};
        int sum = 0;
        double ave;

        for(int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
        }
        ave = (double) sum / scores.length;
        System.out.println("合計値：" + sum);
        System.out.print("平均値：" + ave);
    }
}
