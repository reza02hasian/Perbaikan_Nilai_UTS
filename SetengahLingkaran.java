package lingkaran;


public class SetengahLingkaran implements Lingkaran {
    
    double result;
    public SetengahLingkaran(){
        result = 0;
    }

    @Override
    public void hitungLuas() {
       double luas1 = (Panjang/2 * Lebar)- (Math.PI * (Panjang /2) *(Panjang/2) /4);
       
       result = 2 * luas1;
    }

    @Override
    public void tampilkanLuas() {
        System.out.println("Luas nya adalah: " + this.result);
    }
    
    public double getResult(){
        return result;
    }
    
    
}