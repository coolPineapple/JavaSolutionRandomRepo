import java.util.Comparator;

public class Main {

public static void main(String[] args) {
	Integer list[] = {10,-1, 9, 3, 7, 6, 6, 4, 6, 2, 1};
    //insertionSort(list);
    
    
    for(int i:list) {
    	System.out.println(i);
    }
    Comparator<Integer> c = null;
    insertionSortGeneric(list, c);
    for(int i:list) {
    	System.out.println(i);
    }
    
}


public static <E extends Comparable<E>> void insertionSort (E[] list) 
{	int sizeOfList = list.length;
/*	In this i is variable of int type, which is used to generate count 
 * of variables for outer loop
 * Similarly, j is used for counter of inner loop
 * 
 * This program will sort the list[] in increasing order
 */
 
  int i, j;
  E temp;
  
  for (i = 1; i < sizeOfList; i++)
  {
    temp = list[i];
    for (j = i; j > 0 && list[j - 1].compareTo(temp) > 0; j--)
    {
      list[j] = list[j - 1];
    }
    list[j] = temp;
  }
}


private static Comparator c;



public void insertionSort(Object[] a) {

   for (int i=0;  i != a.length;  i = i+1) {
      Object itemToInsert = a[i];
      int j = i;
      while (j != 0  &&  greaterThan(a[j-1], itemToInsert)) {
         a[j] = a[j-1];  j = j-1;
      }
      a[j] = itemToInsert;
   }
}

private static boolean greaterThan(Object left, Object right)

   { return c.compare(left, right) == 1; }


public static <T> void insertionSortGeneric(T[] a, Comparator<? super T> c) {

	for (int i=0;  i != a.length;  i = i+1) {
        Integer itemToInsert = (Integer) a[i];
        int j = i;
        while (j != 0  &&  greaterThan(a[j-1], itemToInsert)) {
           a[j] = a[j-1];  j = j-1;
        }
        a[j] = (T) itemToInsert;
     }
	
}
}
