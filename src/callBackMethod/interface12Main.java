package callBackMethod;

public class interface12Main implements interface1,interface2{

    @Override
    public void pring() {
        System.out.println("which interface?"); //To change body of generated methods, choose Tools | Templates.
    }

    
    public static void main(String[] args) {
        interface12Main aMain=new interface12Main();
        aMain.pring();
        
    }
}
