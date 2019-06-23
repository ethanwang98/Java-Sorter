public class HeapSorter extends Sorter
{
    HeapSorter(int num)
    {
        super(num);
    }

    public void sort()
    {
        heapSort(arr, this.cap);
    }

    private static void heapSort(int[] arr, int cap)
    {
        heapify(arr, cap);
        int end = cap - 1;
        while (end > 0)
        {
            swap(arr, end, 0);
            end--;
            siftSmallestDown(arr, 0, end);
        }
    }

    private static void heapify(int[] arr, int cap)
    {
        for (int start = parent(cap - 1); start >= 0; start--)
        {
            siftSmallestDown(arr, start, cap - 1);
        }
    }

    private static void siftSmallestDown(int[] arr, int low, int high)
    {
        int root = low;
        while (leftChild(root) <= high)
        {
            int child = leftChild(root);
            int toSwap = root;
            if (arr[toSwap] < arr[child])
                toSwap = child;
            if (child + 1 <= high && arr[toSwap] < arr[child + 1])
                toSwap = child + 1;
            if (toSwap == root)
                return;
            else
            {
                swap(arr, root, toSwap);
                root = toSwap;
            }
        }
    }

    private static int parent(int i)
    {
        return (i - 1) / 2;
    }

    private static int leftChild(int i)
    {
        return 2 * i + 1;
    }
}
