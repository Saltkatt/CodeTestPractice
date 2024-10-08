import java.util.Arrays;

public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan) {

        int start = 0;
        int end = sortedArray.length -1;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start) / 2;
            if (sortedArray[mid] < lessThan){
                if (mid < sortedArray.length - 1 && sortedArray[mid + 1] < lessThan){
                    start = mid + 1;
                    continue;
                }
                else {
                    return mid +1;
                }
            }
             if(sortedArray[mid] >= lessThan) {
                 end = mid - 1;
             }
        }
        return 0;

       /* int count = 0;

        for(int i = 0; i < sortedArray.length; i++){
            if(sortedArray[i] < lessThan){
                count++;
            } else {
                break;
            }
        }
        return count;*/

    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }

}
