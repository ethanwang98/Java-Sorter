import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner arrCap = new Scanner(System.in);
        int cap = arrCap.nextInt();
        InsertionSorter insert = new InsertionSorter(cap);
        QuickSorter quick = new QuickSorter(cap);
        HeapSorter heap = new HeapSorter(cap);
        for (int i = 0; i < cap; i++)
        {
            Scanner numInput = new Scanner(System.in);
            int num = numInput.nextInt();
            insert.insert(num);
            quick.insert(num);
            heap.insert(num);
        }
        insert.sort();
        insert.print();
        quick.sort();
        quick.print();
        heap.sort();
        heap.print();
    }
}
