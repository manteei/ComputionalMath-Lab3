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
            System.out.println("�� ���� ��������� ���������� ������ ������� ����!");
            System.out.print("���������� ���������: Infinity");
        } else if (trapezioidMethod.getremovableGap()){
            System.out.println("�� ���� ��������� ���������� ���������� ������ ������� ����!");
            System.out.println("�������� �������� �� ����� � �������� �� ��������");
            System.out.println("���������� ���������: " + result);
        }else if (trapezioidMethod.getfirstGap()){
            System.out.println("�� ���� ��������� ���������� ������������ ������ ������� ����!");
            System.out.print("���������� ���������: Infinity");
        }else {
            System.out.println("���������� ���������: " + result);
        }

    }
}
