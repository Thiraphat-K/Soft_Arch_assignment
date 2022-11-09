// Please DO NOT MODIFY THIS FILE
package structural;


public class Main {

    public static void main(String[] args) {
        HealthcareWorkerTeam teamMedicalDragon = new HealthcareWorkerTeam();
        Surgeon ryutarou = new Surgeon("Ryutarou Asada", 0);
        Nurse miki = new Nurse("Miki Satohara", 500);
        Cardiologist keisuke = new Cardiologist("Keisuke Fujiyoshi", 3000);
        Anesthesiologist monji = new Anesthesiologist("Monji Arase", 10200);
        teamMedicalDragon.addMember(ryutarou);
        teamMedicalDragon.addMember(miki);
        teamMedicalDragon.addMember(keisuke);
        teamMedicalDragon.addMember(monji);

        System.out.println("================================");
        monji.service();
        System.out.println("Monji's price is " + monji.getPrice());
        teamMedicalDragon.service();
        System.out.println("Before Monji leaves, the total price of the Team Medical Dragon is " + teamMedicalDragon.getPrice());
        teamMedicalDragon.removeMember(monji);
        System.out.println("After Monji leaves, The total price of the Team Medical Dragon is " + teamMedicalDragon.getPrice());
        System.out.println("================================");

        HealthcareWorkerTeam doctorX = new HealthcareWorkerTeam();
        Surgeon michiko = new Surgeon("Michiko Daimon", 25000);
        Anesthesiologist hiromi = new Anesthesiologist("Hiromi Jonouchi", 5000);
        Surgeon hideki = new Surgeon("Hideki Kaji", 10300);
        doctorX.addMember(michiko);
        doctorX.addMember(hiromi);
        doctorX.addMember(hideki);
        doctorX.service();
        System.out.println("The total price of doctor X team is " + doctorX.getPrice());

        System.out.println("================================");
        HealthcareWorkerTeam healthcareSeries = new HealthcareWorkerTeam();
        healthcareSeries.addMember(teamMedicalDragon);
        healthcareSeries.addMember(doctorX);
        System.out.println("The total price of the healthcare series is " + healthcareSeries.getPrice());
    }
}
