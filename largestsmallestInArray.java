public class largestsmallestInArray {
    public static void main(String[] args) {
        
        int[] arr = {10, 5, 20, 30, 9, 40, 54, 50};

        int max = arr[0];
        int min = arr[0];

        for(int element : arr)
        {
            if(element > max)
            {
                max = element;
            }
            if(min > element)
            {
                min = element;
            }
        }

        System.out.println("Smallest Number is : "+ min);
        System.out.println("Largest Number is : "+ max);
    }    
}
