package dataStructure_and_Algorithm.array;
import java.util.Random;

public class chapter3_loop_4 {
    public static void main(String[] args) {
        // 생성된 난수 중 소수만 배열에 저장한다.
        Random random = new Random();
        final int ARRAY_LENGTH = 10;
        int[] result = new int[ARRAY_LENGTH];
        boolean isPrimeNumber = true;

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            // 소수는 자기 자신과 1만 존재하는 수.
            int Num = random.nextInt(ARRAY_LENGTH) + 1; // 1~ 10 중 하나의 수룰 박스에 담는다.

            if (Num == 1) {
                continue; // Num % 2 != 0 계산식에 접근하지 못하게 continue 사용
            } else if (Num == 2) {
                result[i] = Num;
                continue; // Num이 2라면 Num % 2 != 0 계산식에 접근하지 못하게 continue를 사용한다.
            }

            for (int j = 2; j < Num; j++) {
                if (Num % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if(isPrimeNumber){
                result[i] = Num;
            }
        }

        // 몫이 1과 자기 자신만 된다.
        System.out.println();
        System.out.println("배열에 저장된 소수");
        for (int k : result) {
            if (k > 0) {
                System.out.print(k + " ");
            }
        }
    }
}
