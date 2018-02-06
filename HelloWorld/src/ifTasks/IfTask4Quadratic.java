package ifTasks;

public class IfTask4Quadratic {


    private int a;
    private int b;
    private int c;

    public IfTask4Quadratic(int aInput, int bInput, int cInput) {
        a = aInput;
        b = bInput;
        c = cInput;
    }

    public int calculateDiscriminant() {
        int answer = ((b * b) + (-4 * a * c));
        return answer;
    }

}

