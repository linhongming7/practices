package codewars;

import java.util.Arrays;

/**
 * Take 2 strings s1 and s2 including only letters from ato z.
 * Return a new sorted string, the longest possible, containing distinct letters,
 * each taken only once - coming from s1 or s2. #Examples: ``` a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"     longest(a, b) -> "abcdefklmopqwxy"
 * a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```
 * "排序两个字符串，去除重复字符"
 */
public class TwoToOne {
    public static void main(String[] args){
        char c = 'a';
        String s = "abababbabcdleljgsdz";
       byte[] bytes = s.getBytes();
//        Arrays.sort(bytes);
//        System.out.println(Arrays.toString(bytes));
//        StringBuffer sb = new StringBuffer(new String(bytes));
//        System.out.println(sb);
//        StringBuffer sb = new StringBuffer((char)99);  //空白
//        System.out.println((char)97);
        System.out.println(longest("inmanylanguages", "theresapairoffunctions"));
    }
    /*
    public static String longest (String s1, String s2) {
        String s3 = s1 + s2;
        byte[] bytes = s3.getBytes();
        Arrays.sort(bytes);
        StringBuffer sb = new StringBuffer("");
        sb.append((char)bytes[0]);
        for(int i=1;i<bytes.length;i++){
            if(bytes[i]!=bytes[i-1]){
                sb.append((char)bytes[i]);
            }
        }
        return sb.toString();
    }
    */
    //改进
    public static String longest (String s1, String s2){
        String s3 = s1 + s2;
        StringBuilder sb = new StringBuilder();
        for(char c = 'a';c<='z';c++){
            if(s3.contains(c+"")){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
