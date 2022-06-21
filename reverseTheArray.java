public class reverseTheArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 21, 7, 3};

        int i = 0;
        int j = arr.length-1;

        while(i < j)
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;j--;
        }

        for(int element : arr)
        {
            System.out.print(element+" ");
        }
    }
}
