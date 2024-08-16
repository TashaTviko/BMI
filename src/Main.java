public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weight = 47;
        double height = 1.51;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}