public class InsertionSorter extends Sorter
{
    InsertionSorter(int num)
    {
        super(num);
    }

    public void sort()
    {
        insertionSort(this.arr, 1, this.cap);
    }

    public static void insertionSort(int[] arr, int low, int cap)
    {
        for (int i = low; i < cap; i++)
        {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j])
            {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }
}
