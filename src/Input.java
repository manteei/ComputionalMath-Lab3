import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    public int chooseFunction() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Численное интегрирование");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Выберите номер функции для интегрирования:\n 1)y = sqrt(|x|)/(x-3) \n 2)y = 1/x \n 3)y = x/(x-2);  \n 4)y = (x^2-1)/(x-1)");
        System.out.println("------------------------------------------------------------------------------");
        String s;
        while(true) {
            s = scanner.nextLine();
            try {
                int num = Integer.parseInt(s);
                if (num < 6 && num > 0) {
                    return num;
                }
                System.out.println("Ошибка! Номер должен задаваться числом от 1 и до 5");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Номер должен задаваться числом");
            }
        }
    }
    public double getEpsilon() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Введите точность приближения");
        double eps;
        String s;
        while (true) {
            s = scanner.nextLine();
            try {
                eps = Double.parseDouble(s);
                if (eps > 0.0D && eps <= 1.0D) {
                    break;
                }
                System.out.println("Ошибка! Точность должна задаваться числом больше 0 и меньше 1");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Точность должна задаваться числом");
            }
        }
        return eps;
    }


    public double chooseLeftBoard(){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Выберите нижний предел интегрирования:");
        System.out.println("------------------------------------------------------------------------------");
        String s;
        while(true) {
            s = scanner.nextLine();
            try {
                double num = Double.parseDouble(s);
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Нижний предел интегрирования должен задаваться числом");
            }
        }
    }

    public double chooseRightBoard(){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Выберите верхний предел интегрирования:");
        System.out.println("------------------------------------------------------------------------------");
        String s;
        while(true) {
            s = scanner.nextLine();
            try {
                double num = Double.parseDouble(s);
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Верхний предел интегрирования должен задаваться числом");
            }
        }
    }

}
