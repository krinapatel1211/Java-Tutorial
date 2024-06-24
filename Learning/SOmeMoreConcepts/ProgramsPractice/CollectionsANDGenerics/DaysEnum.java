package Learning.SOmeMoreConcepts.ProgramsPractice.CollectionsANDGenerics;

public class DaysEnum {
    public enum DaysOfWeek{
        MONDAY(true), 
        TUEDAY(true), 
        WEDNESDAY(true), 
        THURSDAY(true), 
        FRIDAY(true), 
        SATURDAY(false), 
        SUNDAY(false);

        private final boolean isWeekDay;

        private DaysOfWeek(boolean isWeekDay) {
            this.isWeekDay = isWeekDay;
        }

        public String getType(){
            return (isWeekDay) ? "Weekday" : "Weekend";
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing Days of Weeks: ");
        for (DaysOfWeek day : DaysOfWeek.values()){
            System.out.printf("%s is a %s", day, day.getType());
            System.out.println();
        }
    }
}
