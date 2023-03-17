class Length {
    public int[] length(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

public class LengthArray {
    public static void main(String[] args) {
        Length l = new Length();
        String[] tmp = {"I", "Love", "Programmers."};
        System.out.println(l.length(tmp));
    }
}
