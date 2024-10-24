//3.Program of Vaccination to be taken firstDose,secondDose and BoosterDose

abstract class vaccine {

    int age;
    String nationality;

    vaccine(int age, String nationality) // constructor
    {
        // initialization via constructor
        this.age = age;
        this.nationality = nationality;
    }

    int firstDose = 0;
    int secondDose = 0;

    void firstDose() // FirstDose Method
    {
        if (age == 18 && nationality.equals("Indian")) {
            System.out.println("User Can take first Dose...Vaccination successfull and You have to pay 250Rs");
            firstDose = 1;
        } else if (age < 18 && nationality.equals("Indian"))
            System.out.println("You are under 18");
        else if (age >= 18 && !(nationality.equals("Indian")))
            System.out.println("You are not Indian");
        else
            System.out.println("You are not Indian and you are under age");
    }

    void secondDose() // SecondDose Method
    {
        {
            if (firstDose == 1) {
                System.out.println("You are eligible for second dose..");
                secondDose = 1;
            } else {
                System.out.println("Oops....You are not eligible for second dose!");
            }
        }

    }

    abstract void boosterDose(); // abstract method
}

class VaccinationSuccessful extends vaccine {
    VaccinationSuccessful(int age, String n) {
        super(age, n);
    }

    void boosterDose() // abstract method boosterDose definition
    {
        if (firstDose == 1 && secondDose == 1)
            System.out.println("You are eligible for Booster Dose");
        else
            System.out.println("You are not eligible for Booster Dose");
    }

}

public class Vaccination // main class
{
    public static void main(String[] args) {
        VaccinationSuccessful vs = new VaccinationSuccessful(18, "Indian");
        vs.firstDose(); // calling firstDose Method
        vs.secondDose(); // calling secondDose Method
        vs.boosterDose(); // calling boosterDose Method

    }
}
