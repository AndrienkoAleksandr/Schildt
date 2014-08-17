package bit_operation;

/**
 * Created by USER on 13.06.2014.
 */
public class MultiByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }

}
