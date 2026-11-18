class Calculator
{
  int calculate(int a, int b)
    {
        System.out.println("The sum is "+(a+b));
        return a+b;
    }
    double calculate(double a, double b)
    {
        System.out.println("The product is "+(a*b));
        return a*b;
    }
    int calculate(int a, int b, int c)
    {

        System.out.println("The largest is "+(Math.max( a, Math.max(b,c))));
        return Math.max( a, Math.max(b,c));
    }
    double calculate(int a, double b)
    {
        System.out.println("The difference is "+(a-b));
        return a-b;
    }
    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        c.calculate(24,35);
        c.calculate(2.4,2.6);
        c.calculate(3,4,5);
        c.calculate(6,5.5);
    }
}