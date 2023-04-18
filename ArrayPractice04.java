package kadai5;

public class ArrayPractice04 {
    public static void main(String[] args) {
        int[] scores = {20,78,42,56,70,90,52,16,81,34};
        for(int i = 0; i < scores.length - 1; i++) {
            for(int j = scores.length - 1; j > 0 + i; j--) {
                if(scores[j-1] > scores[j]) {
                    int tmp = scores[j-1];
                    scores[j-1] = scores[j];
                    scores[j] = tmp;
                }
            }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}

/*
int[] scores = {20,78,42,56,70,90,52,16,81,34};
        for(int i = 0; i < scores.length - 1; i++) {
            for(int j = 0; j < scores.length - 1 - i; j++) {
                if(scores[j] > scores[j+1]) {
                    int tmp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
 */