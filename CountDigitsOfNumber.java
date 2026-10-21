class CountDigitsOfNumber
{
    public static void main(String[] args) 
    {
        int num = 1518;
        int temp = num;
        int count = 0;
        int digit = 0;

        if (num == 0) {
            System.out.println("The Count Of Digits of 0 is : 1" );
        }
        else {
            while(num != 0) {
                digit = num % 10;
                num = num / 10;
                count ++;
            }

            System.out.println("The Count Of Digits of " +temp+ " is : " +count);

        }
        
    }
}