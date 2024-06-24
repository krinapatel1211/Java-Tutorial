package Learning.SOmeMoreConcepts.ProgramsPractice.PassBY;


public class PassByReference {

    public static void main(String[] args) {
        Point p = new Point(0, 0);
        System.out.println(p);

    }

    public static void move(Point p){
        p.x++;
        p.y++;

    }
    public static class Point{
        int x; 
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
