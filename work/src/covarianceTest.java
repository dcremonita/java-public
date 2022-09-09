
class A{
    A get(){
        return this;
    }
}

public class covarianceTest extends A{
    @Override
    covarianceTest get(){
        return this;
    }

    void message(){
        System.out.println("welcome to covariant return type");
    }

    public static void main(String args[]){
        new covarianceTest().get();
    }
}