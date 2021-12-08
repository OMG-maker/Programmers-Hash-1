import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args){

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String answer = solution(participant, completion);

        System.out.println("answer : " + answer);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (i != completion.length - 1) {
                if (!completion[i].equals(participant[i])) {
                    answer = participant[i];
                    break;
                }
            } else {
                if (!completion[i].equals(participant[i])) {
                    answer = participant[i];
                } else {
                    answer = participant[i + 1];
                }
            }
        }
        return answer;
    }
}