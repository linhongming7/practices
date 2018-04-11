package mianshi0327;

/**
 * 判断是否为有效数字
 */
public class IsNumber {
    public static boolean isNum(String s){
        for(int i=s.length()-1;i>0;i--){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static double isNum2(String s){
        return Double.parseDouble(s);
    }

    public static void main(String[] args){
        System.out.println(isNum("0.7"));
        System.out.println(Double.parseDouble("4e3"));
        System.out.println(isNum2("1e19"));


    }
    
}
