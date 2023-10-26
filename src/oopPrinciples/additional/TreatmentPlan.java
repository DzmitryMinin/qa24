package oopPrinciples.additional;

public class TreatmentPlan {
    public void setTreatmentPlan (int planCode) {
        if (planCode == 1) {
            Doctor surgeon = new Surgeon();
            surgeon.treat();
        }
        else if (planCode == 2) {
            Doctor dentist = new Dentist();
            dentist.treat();
        }
        else {
            Doctor therapist = new Therapist();
            therapist.treat();
        }
    }
}
