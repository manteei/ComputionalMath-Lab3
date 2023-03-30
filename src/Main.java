public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        int number = input.chooseFunction();
        double eps = input.getEpsilon();
        double a = input.chooseLeftBoard();
        double b = input.chooseRightBoard();
        TrapezioidMethod trapezioidMethod = new TrapezioidMethod(number);
        double result = trapezioidMethod.calculateResult(a, b, eps);
        if(trapezioidMethod.getsecondGap()){
            System.out.println("На этом интервале происходит разрыв второго рода!");
            System.out.print("Полученный результат: Infinity");
        } else if (trapezioidMethod.getremovableGap()){
            System.out.println("На этом интервале происходит устранимый разрыв первого рода!");
            System.out.println("Разобьем интервал на части и вычислим их отдельно");
            System.out.println("Полученный результат: " + result);
        }else if (trapezioidMethod.getfirstGap()){
            System.out.println("На этом интервале происходит неустранимый разрыв первого рода!");
            System.out.print("Полученный результат: Infinity");
        }else {
            System.out.println("Полученный результат: " + result);
        }

    }
}
