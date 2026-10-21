class SumOfDigits
{

    public static void main(String[] args)
    {
        int num = 36;
        int temp = num;
        int digit = 0;
        int sum = 0;

        while(num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10; 
        }

        System.out.println("Sum of Digits of " +temp+ " is : " +sum);
    }
}