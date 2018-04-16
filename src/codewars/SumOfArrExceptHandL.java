package codewars;

/**
 * Sum all the numbers of the array except the highest and the lowest element
 */
public class SumOfArrExceptHandL {
    public static void main(String[] args){
        int i= sum(new int[]{6, 2, -8,1, 8, 10});
        int[] i2 =null ;
        int i3 = sum(i2);
        System.out.println(i);
        System.out.println(i3);
    }
    public static int sum(int[] numbers)
    {
        if(numbers ==null||numbers.length<2  )return 0;
        int sum = numbers[0];
        int highest=numbers[0];
        int lowest =numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(highest<numbers[i]){
                highest =numbers[i];
            }
            if(lowest>numbers[i]){
                lowest = numbers[i];
            }
            sum += numbers[i];
        }
        return sum-lowest-highest;
    }
}
