import java.io.PrintStream;
import java.util.Scanner;
public class Vico {
    public static void main(String[] args) {
        byte[] array = new byte[]{30, 85, 5, -120, -5};
        byte max = array[0];
        int i;
        for (i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (array[i] > max))
                max = array[i];
        }
        if (max < 0)
            System.out.println("Нет положительных чисел");
        else
            System.out.println(max);
    }
}

