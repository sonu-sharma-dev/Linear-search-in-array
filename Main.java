import java.util.Scanner;

public class Main {
    //linear search in array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter Number to search: ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if (index == -1){
            System.out.println("Key not found");
        }else {
            System.out.println("Key found at index: " + index);
        }
    }
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
