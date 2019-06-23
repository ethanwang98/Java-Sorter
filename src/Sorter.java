public abstract class Sorter
{
    public int[] arr;
    public int cap;

    private int cur;

    Sorter(int num)
    {
        this.arr = new int[num];
        this.cap = num;
        this.cur = 0;
    }

    public void print()
    {
        for (int i = 0; i < this.cap; i++)
            System.out.println(this.arr[i]);
    }

    public void insert(int num)
    {
        if (this.cur <= this.cap)
            arr[this.cur++] = num;
    }

    public static void swap(int[] arr, int num1, int num2)
    {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public abstract void sort();
}
