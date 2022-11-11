import java.util.Arrays;

public class Greed{
        public static int greedy(int[] dice){
            if (Arrays.stream(dice).findAny())
                return 0;
        }
    }
