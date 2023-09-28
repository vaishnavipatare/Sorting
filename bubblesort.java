public class bubblesort
{
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    } 

    public static void main(String []args)
    {
        boolean swapped;

        int arr[]={123,45,43,23,32,1};
        //bubble sort
        for(int i=0;i <arr.length;i++)
        {
            swapped =false;

           for(int j=0;j<arr.length-i-1;j++)
           {
            if(arr[j]>arr[j+1])
            {   
                //swapping
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
           }
           //if there is no swap then code will terminate saving time and space
        if (!swapped)
        {
            break;
        }
        }
        printArray(arr);

    }
}