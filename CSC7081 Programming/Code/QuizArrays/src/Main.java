import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int count = 0;
        int val = 1;

        while (count<15) {
            nums[count%5] += val;
            val++;
            count++;
        }
        System.out.println(Arrays.toString(nums));


        //Q2

        String[] words = new String[5];
        words[4] = "test";
        words[5] = "test2";
        int len1 = words.length;
        int len2 = words[2].length();
        System.out.println(len1);
        System.out.println(words[4].length());
        System.out.println(words[2].length());

    }
}