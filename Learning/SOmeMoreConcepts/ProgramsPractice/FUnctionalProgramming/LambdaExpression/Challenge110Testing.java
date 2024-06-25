package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

public class Challenge110Testing {
    public static void main(String[] args) {
        Truth candidate = num ->{
            for (int i=2; i<num; i++){
                if (num%i==0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(candidate.isCandidate(12));


    }
}
