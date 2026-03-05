public class Main {
    public static void main(String[] args) {
        Point point = new Point(5.3F, 2.4F);
        System.out.println(point);

        Point point2 = point.translated(2.4F, 5.3F);
        System.out.println(point2);

        Segment segment = new Segment();
        segment.p = point;
        segment.q = point2;
        System.out.println(segment.length());

        Segment segments[] = new Segment[5];
//        float max = segments[0].length();
//        for (Segment s : segments){
//            if (max<s.length()){
//                max = s.length();
//            }
//        }
    }
    }




