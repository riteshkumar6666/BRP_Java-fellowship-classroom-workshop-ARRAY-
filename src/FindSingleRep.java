////BRP_java fellowship-004(workshop)
//Find the Elements Occurs only once like 2,3,3,2,9,7

public class FindSingleRep {
    public static void main(String[] args) {
        int[] a={2,3,3,2,9,7};
        int res=a[0];
        for (int i=1;i<a.length;i++)
        {
            res=res^a[i];
            System.out.println(res);

        }
        System.out.println("single repeated element "+res);
    }
}
