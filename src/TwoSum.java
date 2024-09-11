import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSum(int[] list, int sum) {

        Arrays.sort(list);

        int left = 0, right = list.length - 1;

        Map<Integer, Integer> complements = new HashMap<>();

        while(left < right){
            int result = list[left] + list[right];

            if(result == sum){
                complements.put(list[left], list[right]);
                return new int[]{complements.get(1)};

            }else if (result < sum){
                left++;

            }else{
                right++;
            }

        }
        return new int[]{};




        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
