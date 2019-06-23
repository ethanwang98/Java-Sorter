public class QuickSorter extends Sorter
{
    QuickSorter(int num)
    {
        super(num);
    }

    public void sort()
    {
        quickSort(this.arr, 0, this.cap - 1);
    }

    private static void quickSort(int[] arr, int low, int high)
    {
        if (high - low < 16)
            InsertionSorter.insertionSort(arr, low, high + 1);
        else
        {
            int pivot = medOfThree(arr, low, high);
            int part = partition(arr, low, high, pivot);
            quickSort(arr, low, part - 1);
            quickSort(arr, part + 1, high);
        }
    }

    private static int medOfThree(int[] arr, int low, int high)
    {
        int med = low + (high - low) / 2;
        if (arr[med] < arr[low])
            swap(arr, med, low);
        if (arr[high] < arr[low])
            swap(arr, high, low);
        if (arr[med] < arr[high])
            swap(arr, med, high);
        return arr[high];
    }

    private static int partition(int[] arr, int low, int high, int pivot)
    {
        int below = low;
        int above = high - 1;
        while (true)
        {
            while (arr[below] < pivot)
                below++;
            while (pivot < arr[above])
                above--;
            if (below < above)
            {
                swap(arr, below, above);
                below++;
                above--;
            }
            else
                break;
        }
        swap(arr, below, high);
        return below;
    }
}
