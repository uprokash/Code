/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uchchhwas
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[]={10,15,5,8,20,25};
        int i,j,min,size,temp;
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
            System.out.println(a[i]);
        }
      
    }
    
}
