package search_problems;

import core_search.Tuple;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class SlidingTilePuzzle {

    //empty cell is 0
    private final List<Integer> INITIAL_STATE =
            new ArrayList<>(List.of(7,2,4, 5,9,6, 8,3,1));

    private final List<Integer> GOAL_STATE =
            new ArrayList<>(List.of(0,1,2, 3,4,5, 6,7,8));

    private final int SIZE;
    public SlidingTilePuzzle(){
        SIZE = (int) Math.sqrt(INITIAL_STATE.size());
    }

    public List<Tuple<List<Integer>, String>> execution(List<Integer> s) {
        int index = -1;
        List<Integer> copy = new ArrayList<Integer>(s);
        Tuple<List<Integer>, String> t = new Tuple<List<Integer>, String>(copy, "none");
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i) == 0) {
                index = i;
                break;
            }
        }

        int r = index / SIZE;
        int c = index % SIZE;
        //up
        if (r > 0) {
            swap(copy, index, index+SIZE);

        }
        //down
        if(r <  SIZE-1){
            swap(copy, index, index-SIZE);
        }
        //left
        if(c>0){
           swap(copy, index, index-1);
        }
        //right
        if (c<SIZE-1) {
            swap(copy, index, index+1);
        }
    }
        }


