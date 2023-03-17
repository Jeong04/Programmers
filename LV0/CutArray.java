public class CutArray {

  public static void main(String[] args) {
    Solution4 s4 = new Solution4();

    int[] arr = { 1, 3, 5 };

    System.out.println(s4.solution(arr, 1, 2));
  }
}

class Solution4 {

  public int[] solution(int[] numbers, int num1, int num2) {
    int[] answer = new int[num2 - num1 + 1];

    for (int i = 0; i <= num2 - num1; i++) {
      answer[i] = numbers[i + num1];
    }
    return answer;
  }
}
