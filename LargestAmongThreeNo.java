class LargestAmongThreeNo
{

    public static void main(String[] args)
    {
        int a = 10;
        int b = 25;
        int c = 15;

        if(a>b && a>c) {
            System.out.println(a+ " Is Largest Number");
        }
        else if(b>a && b>c) {
            System.out.println(b+ " Is Largest Number");
        }
        else {
            System.out.println(c+ " Is Largest Number");
        }
    }

}