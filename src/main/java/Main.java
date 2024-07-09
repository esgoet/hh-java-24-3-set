public class Main {
    public static void main(String[] args) {
        Medication ibu = new Medication("Ibuprofen", 2.90, 20);
        Medication paracetamol = new Medication("Paracetamol", 2.45, 27);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(ibu);
        pharmacy.save(paracetamol);
        System.out.println(pharmacy.find("Ibuprofen"));
        pharmacy.changeQuantity("Ibuprofen", 14);
        System.out.println(pharmacy);
        pharmacy.changeQuantity("Ibuprofen", -50);
        System.out.println(pharmacy);
        System.out.println(pharmacy.getCount());
    }
}
