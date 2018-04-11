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
                max--;
            }else min++;

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
