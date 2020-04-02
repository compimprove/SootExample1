public class FizzBuzz {
    public void printFizzBuzz(int k){
        if (k%15==0)
            System.out.println("FizzBuzz");
        else if (k%5==0)
            System.out.println("Buzz");
        else if (k%3==0)
            System.out.println("Fizz");
        else
            System.out.println(k);
    }

    public void method2(int k){
        if (k%15==0)
            System.out.println("FizzBuzz");
        else if (k%5==0)
            System.out.println("Buzz");
        else if (k%3==0)
            System.out.println("Fizz");
        else
            System.out.println(k);
    }
}
