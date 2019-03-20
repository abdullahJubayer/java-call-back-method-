package callBackMethod;
public class MainClass {
    public static void main(String[] args) {
        
        add(10, 5, new showResult() {

            @Override
            public void resultSuccess() {
                System.out.println("Success");
            }

            @Override
            public void resultFailed() {
                System.out.println("Failed");
            }
        }
        );
        
        
        devide(5, 0, new showResult() {

            @Override
            public void resultSuccess() {
                System.out.println("Success");
            }

            @Override
            public void resultFailed() {
                System.out.println("Failed");
            }
        }
        );
    }
    
    
    public static int add(int a,int b,showResult result){
        try {
            int c= a+b;
            result.resultSuccess();
            return c;
        } catch (Exception e) {
            result.resultFailed();
            return 0;
        }
    }
    
        public static int devide(int a,int b,showResult result){
        try {
            int c= a/b;
            result.resultSuccess();
            return c;
        } catch (Exception e) {
            result.resultFailed();
            return 0;
        }
        
    }
}
