package Learning.SOmeMoreConcepts.ProgramsPractice.CollectionsANDGenerics;

public class WrapperClasses {
    public enum TrafficSignal{
        RED, GREEN, YELLOW;
    }
    public static void main(String[] args) {
        Integer first = Integer.valueOf(10);
        System.out.println(first);

        Integer second = 55;
        System.out.println(second);

        
        TrafficSignal color = TrafficSignal.RED;
        color = TrafficSignal.GREEN;
        System.out.println(color);



    }
}

