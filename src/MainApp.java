import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        // Hej mamo - jesteś SUPER!

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

//        gamingLaptop.setBatteryLevel(70);
//        gamingLaptop.switchOn();
//        System.out.println(gamingLaptop.getSate());


        officeComputer.switchOn();
        System.out.println(officeComputer.getSate());

        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getSate());

    }
}
