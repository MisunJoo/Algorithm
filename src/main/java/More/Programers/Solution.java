package More.Programers;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};




        return answer;
    }
    public static void main(String[] args){
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        Solution s = new Solution();

        int result[] = s.solution(progresses, speeds);
        for (int r : result){
            System.out.println(r);
        }
    }
}