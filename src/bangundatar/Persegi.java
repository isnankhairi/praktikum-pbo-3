package bangundatar;

public class Persegi extends BangunDatar {
    protected double sisi;

    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double Luas(){
        return this.sisi * this.sisi;
    }

    @Override
    public double Keliling() {
        return 4*sisi;
    }
}
