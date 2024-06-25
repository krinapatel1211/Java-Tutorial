package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class COunter {
    private int count = 1;

    public synchronized void increament(){
        count++;

    }

    public int getCount(){
        return count;
    }

}
