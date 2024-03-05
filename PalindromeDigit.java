class PalindromeDigit{
    static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int temp =x;
        int reverse =0;
        while(temp != 0){
            reverse = reverse*10 + temp%10;
            temp = temp/10;
        }
        return (reverse == x);
    }

public static void main(String[] args){
    int x = -121;
    if(isPalindrome(x) == true){
        System.out.print("number is palindrome");
    }
    else System.out.print("number is not palindrome");
}
}
