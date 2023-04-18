package kadai5;

public class ArrayPractice03 {
    public static void main(String[] args) {
        int[] scores = {1,2,3,4,5,6,7,8,9};
        for (var i = 0; i < scores.length; i++) {
            for (var j = 0; j < scores.length; j++) {
                System.out.println( scores[i] + "　×　" + scores[j] + "　=　" + (scores[i] * scores[j]));
            }
            System.out.println("----------");
        }
    }
}

