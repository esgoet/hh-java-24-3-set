import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {
    Map<String, Medication> medications = new HashMap<>();

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }


    public Medication find(String medicationName) {
        return medications.get(medicationName);
    }

    public void delete(Medication medication) {
        medications.remove(medication.getName());
    }

    public void changeQuantity(String medicationName, int quantity) {
        Medication medication  = medications.get(medicationName);
        if (medication != null) {
            medication.changeQuantity(quantity);
        }

    }

    public int getCount() {
        return medications.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(medications, pharmacy.medications);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(medications);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medications=" + medications +
                '}';
    }
}
