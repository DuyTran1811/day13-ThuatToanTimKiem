package BT2;

import java.util.Scanner;

public class BinarySearch {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    static int binarySearch(int[] arr, int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid - 1, value);
            return binarySearch(arr, mid + 1,high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Phan Tu Muon Tim");
        var x = Integer.parseInt(input.nextLine());
        int n = array.length;
      var result =  binarySearch(array, 0, n - 1, x);
      if (result == -1)
          System.out.println("Khong Tim Thay Phan Tu Trong Mang");
      else
          System.out.println("Phan Thu Thay O Vi Tri "+result);
    }
}
