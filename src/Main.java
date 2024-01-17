import java.util.Arrays;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        // 1
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Spliterator<Integer> s1 = Arrays.spliterator(arr);
        Spliterator<Integer> s2 = s1.trySplit();
        System.out.println("spliterator 1");
        s1.forEachRemaining(System.out::println);
        System.out.println("spliterator 2");
        s2.forEachRemaining(System.out::println);
        System.out.println();


        // 2
        String[] arr2 = {"Apple", "banana", "pie"};
        Spliterator<String> s = Arrays.spliterator(arr2);
        s.tryAdvance(System.out::println);
        s.tryAdvance(System.out::println);


        // 3
        System.out.println();
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Spliterator<Integer> s_3 = Arrays.spliterator(arr3, 0, 4);
        Spliterator<Integer> s_4 = s_3.trySplit();
        System.out.println("spliterator 1");
        s_3.forEachRemaining(System.out::println);
        System.out.println("spliterator 2");
        s_4.forEachRemaining(System.out::println);
    }
}