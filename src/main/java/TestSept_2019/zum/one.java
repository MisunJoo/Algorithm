package TestSept_2019.zum;

public class one {

    public static void main(String[] args) throws Exception {
        int inner = 2;
        int outer = 4;
        int[] points_x = {4, 0, 1, -2};
        int[] points_y = {-4, 4, 3, 0};
        System.out.println(solution(inner, outer, points_x, points_y)); //2
    }

    public static int solution(int inner, int outer, int[] points_x, int[] points_y) {
        int count = 0;

        // 포인트들이 그 집합내에 속할 수 있는지 검사하기
        for (int i = 0; i < points_x.length; i++) {
            int x = Math.abs(points_x[i]);
            int y = Math.abs(points_y[i]);

            if (x + y > inner && x < outer && y < outer) {
                count++;
            }
        }
        return count;
    }
}
