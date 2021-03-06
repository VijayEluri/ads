package sorting;

import java.util.Arrays;

/**
 * Implementation of selection sort
 */
public class SelectionSort {
  public static <T extends Comparable<T>> T[] selectionsort(T[] items) {
    int size = items.length;
    int i, j, min;

    for (i = 0; i < size; i++) {
      min = i;

      for (j = i + 1; j < size; j++) {
        if (items[j].compareTo(items[min]) < 0) {
          min = j;
        }
      }

      swap(items, i, min);
    }

    return items;
  }

  private static <T extends Comparable<T>> void swap(T[] items, int x, int y) {
    T tmp;
    tmp = items[x];
    items[x] = items[y];
    items[y] = tmp;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(selectionsort(new Integer[]{1, 2, 3, 4, 5, 6, 7})));
    System.out.println(Arrays.toString(selectionsort(new Integer[]{5, 1, 6, 3, 4, 2, 7})));
    System.out.println(Arrays.toString(selectionsort(new Integer[]{7, 6, 5, 4, 3, 2, 1})));

    System.out.println(Arrays.toString(selectionsort(new String[]{"a", "b", "c", "d", "e"})));
    System.out.println(Arrays.toString(selectionsort(new String[]{"b", "c", "a", "e", "d"})));
    System.out.println(Arrays.toString(selectionsort(new String[]{"e", "d", "c", "b", "a"})));
  }
}
