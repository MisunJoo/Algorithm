package TestSept_2019.zum;

public class two {

    public static void main(String[] args) throws Exception {
        int[] X = {1, 2, 3, 1, 2, 12, 8, 4};
        int[] Y = {5, 10, 15, 2, 4, 15, 10, 5};
        System.out.println(solution(X, Y));
    }

    public static int solution(int[] X, int[] Y) {
        int count = 0;
        double[] a = new double[X.length];
        // 분수로 만들어서 저장
        for (int i = 0; i < X.length; i++) {
            a[i] = X[i] / (double) Y[i];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 1) {
                    count++;
                }
            }
        }

        return count % 1000000007;
    }
}
