package ss13_search_aglorishm.demo;

public class SearchAlgo {
    public static int linearSearch(int[] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                return i;
            }
        }
        return -1;
    }
//    public static int binarySearch(int[] numbers, int num) {
//        int maxIndex = numbers.length - 1;
//        int minIndex = 0;
//        while (maxIndex > minIndex) {
//            int midIndex = (maxIndex + minIndex) / 2;
//            if(numbers[midIndex] == num) {
//                return midIndex;
//            } else if(numbers[midIndex] > num) {
//                midIndex = midIndex - 1;
//            } else {
//                minIndex = midIndex + 1;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int[] numbers = {1,23,4,8,97,7};
        System.out.println(linearSearch(numbers, 7));
    }
}
