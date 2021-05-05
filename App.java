/**
 * Created by  Adam on 3/17/201.
 */


public class App {
    //final static private String EASY = "134862705";
    final static private String MEDIUM = "125340678";
    //final static private String HARD = "567408321";
    final static private String GOAL_STATE = "012345678";



    public static void main(String[] args) {
        String rootState = MEDIUM;
        long startTime = System.currentTimeMillis();

        SearchTree search = new SearchTree(new Node(rootState), GOAL_STATE);
        search.aStar(Heuristic.H_ONE);

        long finishTime = System.currentTimeMillis();
        long totalTime = finishTime - startTime;
        System.out.println("Time  :" + totalTime);


    }
}
