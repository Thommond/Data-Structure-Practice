import java.util.*;


class BinaryS {

  public static int search(int[] arr, int key, int l, int h) {



    int mid = (l + h) / 2;

    if (h < l) {
     return -1;
    }

    if (key == arr[mid]) {

     return mid;

     // If num is less then middle search lower half
   } else if (key < arr[mid]) {

     return search(arr, key, l, mid - 1);

     // Otherwise search upper half of arr
    } else {

     return search(arr, key, mid + 1, h);
    }

  }

  // Implemented my bubble sort.
  public static int[] sort(int[] arr) {

    int len = arr.length;
    int swap = 0;

    for (int i=0; i < len; i++) {
      for (int j=1; j < (len-i); j++) {
        if (arr[j-1] > arr[j]) {
          // swap elements
          swap = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = swap;
        }
      }
    }
    return arr;
  }


  public static void main(String args[]) {

    // Initializations
    int[] arr = {1, 4, 19, 2, 5, 77, 32, 34, 9, 11};
    BinaryS b = new BinaryS();
    int[] newArr = b.sort(arr);
    int len = newArr.length - 1;
    // Printing outputs to user
    System.out.println("Array after sorting.\n");
    System.out.println(Arrays.toString(newArr) + "\n");

    int num = b.search(newArr, 19, 0, len);

    System.out.println("Found at : " + num);
  }

}
