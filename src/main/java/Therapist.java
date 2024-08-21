public class Therapist extends Doctor {

    @Override
    public void heal() {
        System.out.println("Пациент был у терапевта");
    }

    public void appointDoctor(Patient patient) {
        System.out.println(patient.treatment);

        if (patient.treatment == 1) {
            patient.doctor = new Surgeon();

        } else if (patient.treatment == 2) {
            patient.doctor = new Dentist();

        } else {
            patient.doctor = this;
        }

    }
}
