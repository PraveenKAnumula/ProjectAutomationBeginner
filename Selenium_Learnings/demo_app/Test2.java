package demo_app;

public class Test2 extends Test {

    public static void main(String[] args) {
        try
        {
            initializer();
            addProduct();
            checkout();
            Register();
            Createaccount();
            Payment();
        } catch (Exception e) {
            // Handle the exception here
            e.printStackTrace();
    }
  }
}

