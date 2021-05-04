class Linear {

  public static int search(int[] arr, int num) {
    int len = arr.length;

    for (int i = 0; i < len; i++) {
        if (arr[i] == num)
            return i;
    }

    return -1;
  }

  public static void main(String args[]) {
    int arr[] = { 2, 3, 4, 10, 40 };
    int num = 10;

    int result = search(arr, num);

    if (result == -1) {

      System.out.print("Chosen number is not in given array.");
    } else {

      System.out.print("Chosen number is present at index "+ result + "\n");
    }
  }
}
