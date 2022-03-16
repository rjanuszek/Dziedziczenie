import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        // Hej mamo - jesteś SUPER!

        PC officeComputer1 = new PC("Office computer", "HP", 500, 128);
        PC officeComputer2 = new PC("Office computer", "HP", 500, 128);
        PC officeComputer3 = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);
        Laptop mackbook = new Laptop("XGames", "HP GAMES", 500, 256, 50);

//        gamingLaptop.setBatteryLevel(70);
//        gamingLaptop.switchOn();
//        System.out.println(gamingLaptop.getSate());
        System.out.println(mackbook);

        officeComputer1.switchOn();
        System.out.println(officeComputer1.getSate());

        officeComputer1.setPowerSupply(true);
        officeComputer1.switchOn();
        System.out.println(officeComputer1.getSate());

    }
}
