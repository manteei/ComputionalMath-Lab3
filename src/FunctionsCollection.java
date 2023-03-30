public class FunctionsCollection {
    public  double f1(double x) {
        return Math.sqrt(Math.abs(x)) / (x - 3); //Имеет неустранимый разрыв 1 рода
    }
    public  double f2(double x) {
        return 1/x;
    }
    public  double f3(double x) {
        return x/(x-2);
    }
    public  double f4(double x) {
        return (Math.pow(x, 2) - 1) / (x - 1);
    }

}
