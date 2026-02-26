public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 5.4F;
        point.y = 2.3F;
        point.translate(5.3F, 4.2F);
        System.out.println(point);

        Point point2 = point.translated(2.4F, 5.3F);
        System.out.println(point2);

        Segment segment = new Segment();
        segment.p = point;
        segment.q = point2;
        System.out.println(segment.length());

        Segment segments[] = new Segment[5];
        float max = segments[0].length();
        for (Segment s : segments){
            if (max<s.length()){
                max = s.length();
            }
        }
    }

    public static float metod (Segment[], segments)
}


