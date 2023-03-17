class Solution1 {

  public int solution(int n) {
    int answer = 0;
    for (int index = 0; index <= n; index++) {
      if (index % 2 == 0) {
        answer += index;
      }
    }
    return answer;
  }
}

public class EvenAdd {

  public static void main(String[] args) {
    Solution1 s1 = new Solution1();

    System.out.println(s1.solution(10));
  }
}
