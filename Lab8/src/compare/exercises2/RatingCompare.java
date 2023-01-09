package compare.exercises2;

import java.util.*;

public class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return Double.compare(left.getRating(), right.getRating());
    }
}
