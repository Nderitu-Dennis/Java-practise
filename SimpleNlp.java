public class SimpleNlp {
    public SimpleNlp() {

    }

    public int FrogJump(int startingPoint, int endPoint, int distanceByOneJump) {
        int totalDistance = endPoint - startingPoint;
        int numberOfJumps = totalDistance / distanceByOneJump;

        if (totalDistance % distanceByOneJump != 0) {
            numberOfJumps++;

        }
        return numberOfJumps;
    }


    public static void main(String[] args) {

        SimpleNlp nlp = new SimpleNlp();
        System.out.println(nlp.FrogJump(10,100,40));


    }
}


