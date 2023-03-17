class Duplication {
    public int duplication(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer++;
            }
        }
        return answer;
    }
}

public class DuplicationCount {
    public static void main(String[] args) {
        Duplication d = new Duplication();

        int[] tem = {1, 1, 2, 3, 4, 5};

        System.out.println(d.duplication(tem, 2));
    }
}
