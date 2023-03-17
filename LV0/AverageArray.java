public class AverageArray {

  public static void main(String[] args) {
    Solution3 s3 = new Solution3();

    int[] arr = { 89, 31, 50 };

    System.out.println(s3.solution(arr));
  }
}

class Solution3 {

  public double solution(int[] numbers) {
    double answer = 0;
    for (int i = 0; i < numbers.length; i++) {
      answer += numbers[i];
    }
    return answer / numbers.length;
  }
}
