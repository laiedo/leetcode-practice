import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List result=new ArrayList<Integer>();
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    //!result.contains(i)||!result.contains(j)条件不能写这个
                    //这样写是一真全真，真之后不会再计算后面的关系（逻辑或
                    //!result.contains(i)&&!result.contains(j)条件也不能写这个
                    //这样写一假全假，假之后不会计算后面的关系（逻辑与
                    //需要的是两个条件分别都判断 使用|&
                    //筛选出不重复的添加进结果数组
                    //需要的是判断且分别判断
                    if(!result.contains(i)){
                    result.add(i);
                    //不要把判断j的条件写在这里因为后面如果不满足前条件根本判断不了j
                    //写这里面相当于&
                    }
                    if (!result.contains(j)){
                        result.add(j);
                    }
                }
            }
        }
        Integer array[]=new Integer[result.size()];
        array=(Integer[]) result.toArray(array);
        int finalResult[]=new int[array.length];
        for (int k=0;k<array.length;k++){
            finalResult[k]=array[k].intValue();
        }
        return finalResult;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int[] nums=new int[length];
        for(int i=0;i<length;i++){
			nums[i]=sc.nextInt();
		}
        int target=sc.nextInt();
        Solution sl=new Solution();
        int[] result=sl.twoSum(nums, target);
		//打印数组
		for(int i:nums){
			System.out.print(i+" ");
		}
        //打印结果,不能使用foreach写法，因为要一个一个打印出来，所以需要操作下标
        //foreach写法i是数组的内容而不是数组的下标
        for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
        
    }
}