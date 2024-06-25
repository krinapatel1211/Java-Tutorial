package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.Optional;

public class Challenge112 {
    public static void main(String[] args) {
        System.out.println(toOptional("Krina"));
        System.out.println(toOptional(null));
        System.out.println(toOptional(" "));
        
    }

    public static Optional<String> toOptional(String str){
        if (str==null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
