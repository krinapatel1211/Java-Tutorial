package Learning.SOmeMoreConcepts.ProgramsPractice.CollectionsANDGenerics;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(Summ(3,4,7,67,8,8,9,9));
    }
    public static int summ(int a, int b){
        return a+b;
    }

    public static int Summ(int x, int y, int... a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }
}
