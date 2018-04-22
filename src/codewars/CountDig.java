package codewars;

/**
 * Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.
 * Square all numbers k (0 <= k <= n) between 0 and n. Count the numbers
 * of digits d used in the writing of all the k**2. Call nb_dig (or nbDig or ...)
 * the function taking n and d as parameters and returning this count.
 *
 * 计算k**2 书写中包含数字d的个数？
 */
public class CountDig {
    public static void main(String[] args){
        System.out.println(nbDig(25,1));
    }


    public static int nbDig(int n, int d) {
        int count = 0;
        String sb;
        for(int k=0;k<=n;k++){
            sb = k*k +"";
            if((sb.indexOf(d+"")) != -1){
                if(sb.indexOf(d+"")!=sb.lastIndexOf(d+"")){
                    for(int i =0;i<sb.length();i++){
                        if(sb.charAt(i)-48 == d){
                            count++;
                        }
                    }
                    continue;
                }
                count++;
            }
        }

        return count;
    }
}
