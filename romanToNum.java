public class romanToNum {
    
    public static int getVal(char s){
        switch (s) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int toNum(String str){
        int num = str.length();
        int sum = 0;

        for(int i=0; i<num; i++){
            char ch1 = str.charAt(i);

            if( (i+1) < num && getVal(ch1) < getVal(str.charAt(i+1)) ){
                sum -= getVal(ch1);
            } else{
                sum += getVal(ch1);
            }

        }

        return sum;

    }
    
    public static void main(String[] args) {
        
        String roman = "MCMXCIV";

        System.out.println("Number is : " + toNum(roman));

    }
}
