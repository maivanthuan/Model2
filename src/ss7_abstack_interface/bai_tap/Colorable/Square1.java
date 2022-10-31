package ss7_abstack_interface.bai_tap.Colorable;

public class Square1 {
    double ga;
    Square1(double ga) {
        this.ga=ga;
    }

    public double getGa() {
        return ga;
    }
    public double Area() {
        return ga*ga;
    }

    @Override
    public String toString() {
        return "cánh gà: "+ga+" Area:  "+Area();
    }
}
