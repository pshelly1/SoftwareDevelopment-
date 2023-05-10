
import java.util.*;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        int n = 50000000;
        Vector<Integer> vector;
        vector = new Vector<>();

        Random random = new Random();
        int[] array = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            n = random.nextInt(Integer.MAX_VALUE);
            array[i] = random.nextInt(Integer.MAX_VALUE);
            arrayList.add(random.nextInt(Integer.MAX_VALUE));
            boolean add = vector.add(random.nextInt(Integer.MAX_VALUE));

        }

        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
        }
        long endTime = System.nanoTime();
        long arrayTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(random.nextInt(Integer.MAX_VALUE));
        }
        endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            vector.add(random.nextInt(Integer.MAX_VALUE));
        }
        endTime = System.nanoTime();
        long vectorTime = endTime - startTime;

        System.out.println("Array time: " + arrayTime + "ns");
        System.out.println("ArrayList time: " + arrayListTime + "ns");
        System.out.println("Vector time: " + vectorTime + "ns");

    }
}
