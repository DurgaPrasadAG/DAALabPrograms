import java.util.*;

class MergeSort {
    int n;
    int a[];

    MergeSort(int x) {
        n = x;
        a = new int[n];
    }

    void generate() {
        System.out.println("Generating n random numbers.... ");
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20);
            System.out.print(a[i] + " ");
        }
    }

    void merge(int low, int mid, int high) {
        int h, i, j, k;
        int[] b = new int[n];
        h = low;
        i = low;
        j = mid + 1;
        while ((h <= mid) && (j <= high)) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h = h + 1;
            } else {
                b[i] = a[j];
                j = j + 1;
            }
            i = i + 1;
        }
        if (h > mid) {
            for (k = j; k <= high; k++) {
                b[i] = a[k];
                i = i + 1;
            }
        } else {
            for (k = h; k <= mid; k++) {
                b[i] = a[k];
                i = i + 1;
            }
        }

        for (k = low; k <= high; k++)
            a[k] = b[k];
    }

    void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

class MergeSortDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int x = s.nextInt();

        MergeSort m = new MergeSort(x);
        m.generate();
        long startTime = System.currentTimeMillis();
        m.mergeSort(0, m.n - 1);
        long endTime = System.currentTimeMillis();

        System.out.println("\nThe Sorted array is : ");
        m.display();
        System.out.println("\nTime taken = " + (endTime - startTime) + " milli seconds");
        s.close();
    }
}