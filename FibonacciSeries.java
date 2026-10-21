class FibonacciSeries
{
    public static void main(String[] args) 
    {
        int length = 8;
        int a = 0, b = 1, next = 0;

        System.out.print(a+ " " +b);

        for(int i = 1; i <= length; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.print(" " +next);
        }
    }
}