public class duplicateNumberInArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)            //TC - O(n*n)
            {                                                //SC - O(1)
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}
