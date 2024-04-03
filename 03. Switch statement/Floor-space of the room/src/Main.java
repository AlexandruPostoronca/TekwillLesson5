import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double r = 3.14d;
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String shapeRoom = scanner.next();

        switch (shapeRoom) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s*(s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                double l = scanner.nextDouble();
                double i = scanner.nextDouble();
                double areaOfTheRectangle = (l * i);
                System.out.println(areaOfTheRectangle);
                break;
            case "circle":
                double rCircle = scanner.nextFloat();
                double areaOfCircle = r * rCircle * rCircle;
                System.out.println(areaOfCircle);
                break;
        }
    }
}