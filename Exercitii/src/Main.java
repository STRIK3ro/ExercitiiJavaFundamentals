import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sa se modeleze o sedinta de training
        //vom avea:
        // Trainee(student)
        //Nume
        //Stamina
        //Strength
        //O sa se antreneze Lunea Miercurea si Vinearea
        //o sa porneasca cu stamina 1000
        //de fiecare data stamina o sa ii scada
        //de fiecare data puterea o sa ii creasca
        //porneste cu puterea 50
        //Lunea cardio
        //Ati ars 300 calorii
        //Miecrurea body pump
        //Ati ars 500 calorii
        //Vinerea box
        //Ati ars 250 calorii
        //Cardio scade stamina cu 30
        //Body pump scade stamina cu 50
        //Box scade cu 70
        //Stamina >0
        //puterea creste cu 10
        Scanner name=new Scanner(System.in);
        System.out.println("Va rugam introduceti numele trainee-ului");
        String nume=name.nextLine();
        Trainee ion = new Trainee(nume);

        Scanner zi = new Scanner(System.in);
        System.out.println("Introduceti ziua curenta ");
        String ziCurenta = zi.nextLine();
        while ((ziCurenta.equals("Luni") || ziCurenta.equals("Miercuri") || ziCurenta.equals("Vineri")) && ion.getStamina() > 0) {
            switch (ziCurenta) {
                case "Luni":
                    ion.cardio();
                    System.out.println("Stamina a ajuns la "+ion.getStamina());
                    break;
                case "Miercuri":
                    ion.bodyPump();
                    System.out.println("Stamina a ajuns la "+ion.getStamina());
                    break;
                case "Vineri":
                    ion.box();
                    System.out.println("Stamina a ajuns la "+ion.getStamina());
                    break;
                default:
                    System.out.println("Nu am gasit ziua curenta");
                    break;
            }
            ziCurenta = zi.nextLine();


        }
        if (!ziCurenta.equals("Luni") || !ziCurenta.equals("Miercuri") || !ziCurenta.equals("Vineri")) {
            System.out.println("Ai introdus o zi in care nu se antreneaza " + ziCurenta);
        }

        if (ion.getStamina() <= 0) {
            System.out.println("Trainee-ul " + ion.getName() + " a obosit ");

        }
        System.out.println("Puterea trainee-ului " + ion.getName() + " a ajuns la " + ion.getStrength());


    }
}
