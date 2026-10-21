class PalindromeNumber 
{
    public static void main(String[] args)
    {
        int num = 121;
        int temp = num;
        int reverse = 0;
        int digit = 0;

        while(num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }

        if(temp == reverse) {
            System.out.println(temp+ " is a Palindrome Number");
        }
        else {
            System.out.println(temp+ " is Not a Palindrome Number");
        }
    }
}