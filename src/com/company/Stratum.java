
/**
 * Created by Piotr Lasek on 15.12.2015.
 */
public class Stratum {

    int layer;

    int size;

    // Cell[][] cells;

    /**
     *
     * @param size
     */
    public Stratum(int size) {
        // cells = new Cell[size][size];
        this.size = size;
    }

    /**
     *
     * @param lowerStratum
     */
    public Stratum(Stratum lowerStratum) {



    }

    /**
     *
     * @return
     */
    public Stratum aggregate() {
        Stratum aggregatedStratum = new Stratum(this);



        return aggregatedStratum;
    }

}
