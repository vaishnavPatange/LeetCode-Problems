public class isPalindrome {

    public static boolean isPalindromeNum(int num){
        
        if (num < 0) {
            return false;
        }
        
        int originalNum = num;
        int reverseNum = 0;

        while(num != 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10; 
        }

        if(originalNum != reverseNum){
            return false;
        } else{
            return true;
        }

        
    }
    public static void main(String[] args){
        int num = -112222221;
        boolean is = isPalindromeNum(num);

        if(is){
            System.out.println("True");
        } else{
            System.out.println("false");
        }
    }
}
