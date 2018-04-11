package mianshi0327;

public class DnaStrand {
    public static String makeComplement(String dna) {
        //Your code
        String s = "";
        char c ;
        for(int i=0;i<dna.length();i++){
            c = dna.charAt(i);
            if(c == 'T'){
                s += "A";
            }else if(c == 'A'){
                s += "T";
            }else if(c == 'C'){
                s += "G";
            }else if(c == 'G'){
                s += "C";
            }
        }
        return s;
    }
}
