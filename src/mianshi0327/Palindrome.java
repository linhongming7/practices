package mianshi0327;
/**
 * 最长回文子串
 */
public class Palindrome {
    static String s;
    public static void main(String[] args){
        String s = "gmg";
        System.out.println(isPalindrome(s));  //true
        System.out.println(s.substring(0,3));  //gmg
        String sl = "veloogabacdoooeooowdcabagoole";
        System.out.println(longPalindrome(sl)); //
        StringBuffer sb = new StringBuffer("Hello");

    }
    //判断是否是回文串
    public static boolean isPalindrome(String s){
        if(s.length()>1){
            int min = 0;   //定义两个下标
            int max = s.length()-1;
            do{
                if(s.charAt(min)!=s.charAt(max)){
                    return false;
                }
                min++;
                max--;
            }while(min<=max);
            return true;
        }
        return false;
    }

    //最长回文子串
    public static String longPalindrome(String s){
        String l = "";    //最长字符串
        String ll;  //临时存储字符串
        int max = 0;  //最长子串的长度
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
                ll = s.substring(i,j);
                if(ll.length()>max && isPalindrome(ll)){
                    max = ll.length();
                    l = ll;
                }
            }
        }
        return l;
    }
}