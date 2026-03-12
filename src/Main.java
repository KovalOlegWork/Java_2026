import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Point[] points = new Point[5];
        points[0] = new Point(2.3F, 5.6F);
        points[1] = new Point(10.5F, 12.4F);
        points[2] = new Point(15.4F, 74.2F);
        points[3] = new Point(72.4F, 81.3F);
        points[4] = new Point(162.2F, 51.3F);

        Polygon polygon = new Polygon(points);

        points[2].setX(1000);

        Point[] points1 = new Point[3];
        points1[0] = new Point(2.3F, 5.6F);
        points1[1] = new Point(10.5F, 12.4F);
        points1[2] = new Point(15.4F, 74.2F);

        Polygon polygon1 = new Polygon(points1);
        Polygon polygon2 = new Polygon(new Point[]{
                new Point(2.3F, 5.6F),
                new Point(10.5F, 12.4F),
                new Point(15.4F, 74.2F)
        });

        SvgScene svgScene = new SvgScene();
        svgScene.addPolygon(polygon);
        svgScene.addPolygon(polygon1);
        svgScene.addPolygon(polygon2);
        svgScene.addPolygon(polygon2);

        System.out.println(polygon);
        System.out.println(polygon.toSvg());
        svgScene.save("out.svg");
    }
}




