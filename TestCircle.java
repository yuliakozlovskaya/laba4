public class TestCircle {
    import java.lang.*;
import java.util.Scanner;
import com.company.Circle;

    public class Tester {
        public static void main(String[] args) {
            double r;
            Circle k1 = new Circle(2.5, 2.6, 2.9, "pink");
            System.out.println("Длина окружности = " + k1.getLength() + "см\n");
            Scanner source = new Scanner(System.in);
            System.out.println("Пожалуйста, введите радиус ");
            r = source.nextDouble();
            k1.setR(r);
            System.out.println("\nДлина окружности равна " + k1.getLength() + "см");
        }
}
