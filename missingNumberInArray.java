public class missingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};

        int max = arr[0];
        int actualSum = 0;
        for(int element : arr)
        {
            if(element > max)
            {
                max = element;
            }
            actualSum += element;
        }
        int correctSum = 0;
        for(int i = 1; i <= max; i++)
        {
            correctSum += i;
        }
        
        if(correctSum != actualSum)
        {
            System.out.println("Missing Number is : "+(correctSum-actualSum));
        }
        else
        {
            System.out.println("No Missing NUmber!!");
        }
    }
}
