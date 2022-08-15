package MethodOverloading;

public class MethodOverloadingMain {
    public static void main(String args[]){
        Oveloading o=new Oveloading();
        double result;
        o.demo(10);
        o.demo(10,20);
        result =o.demo(1.2);
        System.out.println("Result:"+result);

    }
}
