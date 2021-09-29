//BRP_java fellowship-004(workshop)
//segregate program in java
//Input [1,1,0,1,0,0,]
// output [0,0,0,1,1,1,]

public class segregate {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,0,0}; //array length=6
        int j=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==0) //if value at index is equal to 0
            {
                arr[j++]=arr[i]; //[0,0,0]
            }
        }
        //already moved zero,now the remaining value 1
        while (j< arr.length)
        {
            arr[j++]=1; //[0,0,0,1,1,1]
        }
        for (int k=0;k< arr.length;k++)
        {
            System.out.println(arr[k] + " ");
        }

    }
}
