package mianshi0327;

/**
 *  奇偶分割数组
 */
public class SolutionJO {

    public static int[] solution(int[] i){
        int max = i.length-1;
        int min = 0;
        while(min<max){
            if(i[min]%2==0){
                if( i[max]%2==1){
                    i[max] = i[max] + i[min];
                    i[min] = i[max] - i[min];
                    i[max] = i[max] - i[min];
                    min++;
                    max--;
                }
                max--;      //遇到偶数自减1
            }else min++;  //奇数的话继续执行

        }
        return i;
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8};
        int[] aa = solution(a);
        for(int i=0;i<aa.length;i++){
            System.out.print(aa[i]);
        }
    }
}
