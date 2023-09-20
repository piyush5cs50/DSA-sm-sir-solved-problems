import java.util.ArrayList;
import java.util.List;

public class SubSetII {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subSetList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        func(nums,0,list,subSetList);
        return subSetList;
    }
    static void func(int[] nums, int ind, ArrayList<Integer> list, List<List<Integer>> subSetList){
        if(ind == nums.length){
            subSetList.add(list);
            return;
        }
        func(nums,ind+1,list, subSetList);

        list.add(nums[ind]);
        func(nums,ind+1,list, subSetList);
    }
}
