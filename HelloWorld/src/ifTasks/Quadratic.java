package ifTasks;

public class Quadratic {


    private int aValue;
    private int bValue;
    private int cValue;

    public Quadratic(int a, int b, int c) {
        aValue = a;
        bValue = b;
        cValue = c;
    }

    public int calculateDiscriminant() {
        int answer = ((bValue * bValue) + (-4 * aValue * cValue));
        return answer;
    }

}//end class

