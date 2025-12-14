package abstractClasses;

public class Thar extends Vehicle{


    Thar(String brand) {
        super(brand);
    }

    @Override
    void start() {

    }

    public static void main(String[] args) {
        // I cannot create object  for Vehicle class in order to call he method
      //  Vehicle ve = new Vehicle(); 'Vehicle' is abstract; cannot be instantiated

        /*

        Q -> If I cannot create object of the abstract class then why constructor is there that calls parent class ?

        because  the purpose of consructor calling that way meaning that allocating the memory to an instance variable  of vehcile class and assign a default value to that vairable and this is th responsiblity of that constructor


         */
    }
}
