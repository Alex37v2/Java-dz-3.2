public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(67.9,1.79);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}
