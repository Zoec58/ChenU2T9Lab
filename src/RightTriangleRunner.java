public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle tri1 = new RightTriangle(Math.random()*10, Math.random()*10);
        RightTriangle tri2 = new RightTriangle(Math.random(),Math.random());

        double hyp1 = tri1.hypotenuse();
        double hyp2 = tri2.hypotenuse();

        System.out.println(hyp1 + "\n" + hyp2);
    }
}
