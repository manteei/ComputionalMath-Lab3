public class TrapezioidMethod {
    private static int number;
    private static FunctionsCollection functionsCollection = new FunctionsCollection();
    private static boolean firstGap = false;
    private static boolean secondGap  = false;
    private static boolean removableGap  = false;
    public TrapezioidMethod(int number){
        this.number = number;
    }
    public double numericalIntegration(double a, double b, int n) {
        double h = (b-a)/n;
        double result = 0;
        for(int i = 0; i < n; i++) {
            double start = a + i * h;
            double finish = a + (i + 1) * h;
                if (gapIdentifier(start)) {
                    continue;
                }
             result += (finish - start)*(f(start) + f(finish))/2;
        }
        return result;
    }

    public double calculateResult(double a, double b, double eps){
        int n = 2;
        double previous;
        double current = 0;
        do {
            previous = current;
            current = numericalIntegration(a, b, n);
            n = n * 2;
        }while (isEps(current, previous, eps));
        return current;
    }


    public static boolean isGapDisposable(double x) {
        Double right = f(x - 0.0000001);
        Double left = f(x + 0.0000001);
        if (Math.abs(right - left) < 0.001) {
            removableGap = true;
            return true;
        } else {
            firstGap = true;
            return false;
        }
    }


    public static boolean gapIdentifier(double x)  {
        Double y = f(x);
        if (y.isInfinite()) {
            secondGap = true;
        }
        if (y.isNaN()) {
            if (isGapDisposable(x)) return true;
        }
        return false;
    }
    public boolean getsecondGap(){
        return secondGap;
    }
    public boolean getfirstGap(){
        return firstGap;
    }
    public boolean getremovableGap(){
        return removableGap;
    }

    private boolean isEps(double current, double previous, double eps){
        return Math.abs(current - previous) > eps;
    }
    public static double f(double x) {
        if (number == 1){
            return functionsCollection.f1(x);
        }else if (number == 2){
            return functionsCollection.f2(x);
        }else if(number == 3){
            return functionsCollection.f3(x);
        }else {
            return functionsCollection.f4(x);
        }
    }

}
