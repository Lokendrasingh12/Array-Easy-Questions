import java.util.*;

public class moreThanTwoDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> answer = new HashSet<>();

        int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1, 1, 1, 1};

        for(int element : arr)
        {
            if(!h.contains(element))
            {
                h.add(element);
            }
            else
            {
                answer.add(element);
            }
        }
        for(int element : answer)
        {
            System.out.println(element);
        }
    }
}
