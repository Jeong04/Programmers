public class DividePizza3 {

	public static void main(String[] args) {
		Pizza3 p3 = new Pizza3();
		System.out.println(p3.solution(4, 12));
	}
}

class Pizza3 {
	public int solution(int slice, int n) {
		int answer = 0;
		
		if(slice >= n) {
			answer = 1;
		} else if(n % slice == 0) {
			answer = n / slice;
		} else {
			answer = n / slice + 1;
		}
			
		return answer;
	}
}
