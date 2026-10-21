class PrimeNumber 
{
    public static void main(String[] args) 
    {
        boolean isPrime = true;
        int num = 11;

        if(num <= 1) {
            isPrime = false;
        }
        else {
            for (int i = 2; i < num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(num+ " Is Prime Number");
        }
        else {
            System.out.println(num+ " Is Not a  Prime Number");
        }
    }
}