package ss10_dsa_list_set.Demo;


import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println("truoc khi them phan tu: " + nums.size());
        nums.add(1);
        System.out.println("sau khi them phan tu: " + nums.size());
        nums.add(1,4);
        nums.set(0,4);
        System.out.println(nums);
        System.out.println(nums.get(1));
        System.out.println(nums.contains(5));
        System.out.println(nums.indexOf(4));
        System.out.println(nums.isEmpty());

        for(Integer i : nums){
            System.out.println(i);
        }
        nums.forEach(x -> System.out.println(x));
    }
}
