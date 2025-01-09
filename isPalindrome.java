public class isPalindrome {

    public static void isPalindromeNum(int num){
        int originalNum = num;
        int reverseNum = 0;

        while(num != 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10; 
        }

        if(originalNum != reverseNum){
            System.out.println(false);
        } else{
            System.out.println(true);
        }

        
    }
    public static void main(String[] args){
        int num = 12222221;
        isPalindromeNum(num);
    }
}
