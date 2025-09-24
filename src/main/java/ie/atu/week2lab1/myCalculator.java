package ie.atu.week2lab1;

public class myCalculator {

    private int num1;
    private int num2;

    public myCalculator(){
        num1 = 0;
        num2 = 0;
    }

    public myCalculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }


    public int add(int num1, int num2){

        return num1 + num2;

    }

    public int substraction(int num1, int num2){

        return num1 - num2;

    }
    public int multiply(int x, int y){

        return x*y;

    }

    public int divide(int x, int y){

        try{
           return x/y;
        }catch (ArithmeticException ae){
            System.out.println("Please enter a number different than 0 at division");
        }

        return x/y;
    }


}
