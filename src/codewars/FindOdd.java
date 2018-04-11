package codewars;

/**
 *      Given an array, find the int that appears an odd number of times.
 *      There will always be only one integer that appears an odd number of times.
 *      查找数组中出现奇数次数的数字
 */
public class FindOdd {
    public static void main(String[] args){
        int[] a = {3,5,3,18,4,4,5,6,6,1,1};
        System.out.println(findIt(a));
    }

    public static int findIt(int[] A) {
        for(int i=0;i<A.length;i++){
            int index=0;
            for(int j=0;j<A.length;j++){
                if(A[i]==A[j]) index++;
            }
            if(index%2==1) {
                return A[i];
            }
        }
        return -1;
    }
}
