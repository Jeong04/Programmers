public class LambSkewers {

  public static void main(String[] args) {
    Solution2 s2 = new Solution2();

    System.out.println(s2.solution(64, 6));
  }
}

class Solution2 {

  public int solution(int n, int k) {
    int answer = (12000 * n) + (2000 * k) - (n / 10 * 2000);
    return answer;
  }
}
