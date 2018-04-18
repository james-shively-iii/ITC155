
//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment 2 - Partition.java

class Partition
{
	
	public static void main(String[] args)
    {
        Partition par = new Partition();
        int[] array = {5, 4, 7, 2, 1, 9, 3, 6, 10, 8};

        System.out.print("Original  Array : ");
        for(int i=0; i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }

        int length = array.length;

        par.Part(array, 0, length-1);

        System.out.print("Sorted  Array : ");
        for(int i=0; i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
	
    public void par(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q = Part(a, p,r);
            par(a, p, q-1);
            par(a, q+1, r);
        }
     }

     int Part(int[] a, int p, int r)
     {
         int x = a[r];

         int i = p-1;
         int temp=0;

         for(int j=p; j<r-1; j++)
         {
             if(a[j]<=x)
             {
                 i++;
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }

         temp = a[i+1];
         a[i+1] = a[r];
         a[r] = temp;
         return (i+1);
     }
}

