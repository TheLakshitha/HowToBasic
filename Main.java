 class Rectangle {
    private int length;
    private int width;
    private static int count = 0;

    public Rectangle(int length, int width) {
        super();
        this.setLength(length);
        this.setWidth(width);
        count++;
    }

    public int getLength() {
        return length;
    }

    private void setLength(int length) {
        if(length > 0){
            this.length = length;
        }else{
            throw new IllegalArgumentException("Length can't be less than zero");
        }
    }

    public int getWidth() {
        return width;
    }

    private void setWidth(int width) {
        if(length > 0){
            this.width = width;
        }else{
            throw new IllegalArgumentException("Width can't be less than zero");
        }
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

    public double diffPerimeter(Rectangle rect){
        return Math.abs(this.getPerimeter() - rect.getPerimeter());
    }

    public static int getCount() {
        return count;
    }

    public static double diffBetweenCircles(Circle circle1, Circle circle2){
        return Math.abs(circle1.getRadius() - circle2.getRadius());
    }
}


 class Circle {
    private double radius;
    private static int count;

    public Circle(double radius) {
        this.setRadius(radius);
        count++;
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        if(radius > 0){
            this.radius = radius;
        }else{
            throw new IllegalArgumentException("Radius can't be less than zero");
        }
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public static int getCount() {
        return count;
    }

    public static double diffBetweenCircles(Circle circle1, Circle circle2){
        return Math.abs(circle1.getRadius() - circle2.getRadius());
    }
}


public class Main {
    public static void main(String[] args) {
        Circle obj = new Circle(10);
        System.out.printf("The radius of the circle is %.2f, the area is %.2f and the Circumference is %.2f. This are %s circle objects\n",
                obj.getRadius(), obj.getArea(), obj.getCircumference(), Circle.getCount());

        Circle obj2 = new Circle(20);
        System.out.printf("The radius of the circle is %.2f, the area is %.2f and the Circumference is %.2f. This are %s circle objects\n",
                obj2.getRadius(), obj2.getArea(), obj2.getCircumference(), Circle.getCount());

        Circle obj = new Circle(30);
        System.out.printf("The radius of the circle is %.2f, the area is %.2f and the Circumference is %.2f. This are %s circle objects\n",
                obj.getRadius(), obj.getArea(), obj.getCircumference(), Circle.getCount());

        Rectangle rect1 = new Rectangle(10, 20);
        System.out.printf("Rectangle Number %s, Length %s, Width %s, Area, %.2f, Perimeter %.2f\n",
                Rectangle.getCount(), rect1.getLength(), rect1.getWidth(), rect1.getArea(), rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(50, 20);
        System.out.printf("Rectangle Number %s, Length %s, Width %s, Area, %.2f, Perimeter %.2f\n",
                Rectangle.getCount(), rect2.getLength(), rect2.getWidth(), rect2.getArea(), rect2.getPerimeter());

        System.out.printf("Different between Rectangle 1 and 2 is %.2f\n", rect1.diffPerimeter(rect2));
        System.out.printf("Different between Circle 1 and 2 is %.2f\n", Rectangle.diffBetweenCircles(obj, obj2));
    }
}
