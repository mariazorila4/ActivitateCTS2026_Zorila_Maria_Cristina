package ro.ase.cts.main;

import ro.ase.cts.clase.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1=Hotel.getInstance("Grand Hotel", 50,10);
        Hotel hotel2=Hotel.getInstance("Covasna", 200, 0);

        hotel1.rezervaCamera();
        hotel2.rezervaCamera();
        hotel2.rezervaCamera();
    }
}
