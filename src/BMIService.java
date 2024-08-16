public class BMIService {

    int weight;
    double height;
    int index;


    public int calculate(int weight, double height) {
        int index = (int) (weight / (height * height));
        return (int) index;
    }
}

