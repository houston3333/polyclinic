public class Main {
    public static void main(String[] args) {

    Patient patient1 = new Patient(1);
    Patient patient2 = new Patient(2);
    Patient patient3 = new Patient(3);
    Patient patient4 = new Patient(59634);

    Therapist therapist = new Therapist();

    therapist.appointDoctor(patient1);
    patient1.doctor.heal();

    therapist.appointDoctor(patient2);
    patient2.doctor.heal();

    therapist.appointDoctor(patient3);
    patient3.doctor.heal();

    therapist.appointDoctor(patient4);
    patient4.doctor.heal();

    }
}
