

/*Finding the second most smallest element from an array where there can be duplicate values"
*/

/**
 *
 * @author Uchchhwas
 */
public class SelectionSort2 {
    public static void main(String[] args) {
        int a[]={5,10,15,5,8,5,8,20,25};
        int i,j,min,size,temp,prev=0;
        size=a.length;
        for(i=0;i<size;i++)
        {
            min=i;
            for(j=i+1;j<size;j++)
            {
                if(a[j]<a[min])
                    min=j;               
            }
            
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            if(i==0)
                prev=a[i];
            else if(a[i]!=prev){
                System.out.println("second most smallest element "+a[i]);
                break;
            }
        }
    }
}
