public class selectionsort
{
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
       int arr[]={12,4,54,23,34,342,21};

       //selection sort
       for(int i=0;i<arr.length;i++)
       {
        int smallest=i;
        for (int j=i+1;j<arr.length;j++)
        {
            if (arr[smallest]>arr[j])
            {
                int temp=arr[smallest];
                arr[smallest]=arr[j];
                arr[j]=temp;
            }
        }
       }
       printArray(arr);
    }
}
