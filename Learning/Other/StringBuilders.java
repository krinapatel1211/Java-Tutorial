
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Krina");
        System.out.println(sb);

        //charAT()
        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'S');
        System.out.println(sb);

        sb.setCharAt(0, 'K');
        sb.insert(3,'S');
        System.out.println(sb);

        //delete the extra 'S'
        sb.delete(3,4);
        System.out.println(sb);

        sb.append("Patel");
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
