package bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
            super(color);
        }

        @Override
        public void draw() {
            System.out.print("Drawing rectangle. ");
            color.getColor();
        }

}
