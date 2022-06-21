public class pairSum {
    public static void main(String[] args) {
        int arr[] = {-3,-2, -1, 0, 1};
        int sum = -2;

        int i = 0;
        int j = arr.length-1;

        while(i < j)
        {
            if(arr[i]+arr[j] == sum)
            {
                System.out.println(arr[i]+" + "+arr[j] +" = "+sum);
                break;
            }
            if(arr[i]+arr[j]>sum)
            {
                j--;
            }else{
                i++;
            }
        }
    }    
}
