import java.util.Scanner;
import java.util.Random;

class QuickSort {
  int n;
  int a[];

  QuickSort(int x) {
    n = x;
    a = new int[n];
  }

  void generate() {
    System.out.println("Generating n random numbers....");
    Random r = new Random();

    for (int i = 0; i < n; i++) {
      a[i] = r.nextInt(100);
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  int partition(int a[], int lb, int ub) {
    int pi, down, temp, up;
    pi = a[lb];
    down = lb;
    up = ub;
    while (down < up) {
      while ((a[down] <= pi) && (down < up))
        down++;
      while (a[up] > pi)
        up--;
      if (down < up) {
        temp = a[down];
        a[down] = a[up];
        a[up] = temp;
      }
    }

    a[lb] = a[up];
    a[up] = pi;
    return up;
  }

  void qSort(int a[], int lb, int ub) {
    if (lb < ub) {
      int j = partition(a, lb, ub);
      qSort(a, lb, j - 1);
      qSort(a, j + 1, ub);
    }
  }

  void display() {
    for (int i = 0; i < n; i++)
      System.out.print(a[i] + " ");
  }
}

class QucikSortMain {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int x = s.nextInt();

    QuickSort q = new QuickSort(x);
    q.generate();
    long startTime = System.currentTimeMillis();
    q.qSort(q.a, 0, q.n - 1);
    long endTime = System.currentTimeMillis();

    double timeTaken = (endTime - startTime);
    System.out.println("\nThe Sorted array is:");
    q.display();
    System.out.println("\nTime taken=" + timeTaken + "  Milli seconds");
  }
}