package E;

public class CountAndSay {
    public String solution(int n) {
        String res = "";
        for (; n > 0; n--) {
            char[] array = res.toCharArray();
            res = "";
            if (array.length == 0) {
                res = "1";
            }
            else {
                int i = 0;
                while (i < array.length) {
                    int count = 1;
                    while ((i+1 < array.length) && array[i] == array[i+1]) {
                        count++;
                        i++;
                    }
                    res += (count + Character.toString(array[i]));
                    i++;
                }
            }
        }

        return res;
    }
}
