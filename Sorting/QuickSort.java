public class QuickSort {
    public void quickSort(int a[],int low,int high){
        if(low<high){
            int p=partition(a, low, high);
            quickSort(a, low, p-1);
            quickSort(a, p, high);
        }
        
    }
    public int partition(int a[],int low,int high){
        int pivot=a[high];
        int i,j,temp;
        i=low-1;
        for(j=low;j<high;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, n-1);
 
        System.out.println("sorted array");
        printArray(arr);
    }
}
