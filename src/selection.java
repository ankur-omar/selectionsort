class selection
{
    public static void main(String[] args)
    { int temp =0;
        int[] a = {10,30,5,15,20,25};

        for(int i=0;i<a.length;i++)
        {
            int min=i;

            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }
            }
            temp = a[min];
            a[min] = a[i];
            a[i]= temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+ "");
        }
    }
}

