/*Model View Class

 */
public class Numbers {
    int redNumber;
    int greenNumber;
    int yellowNumber;

    GraphView gView;

    public Numbers(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.greenNumber = n2;
        this.yellowNumber = n3;
    }

    public void attach(GraphView gView) {
        this.gView = gView;
    }

    public void updateValues(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.greenNumber = n2;
        this.yellowNumber = n3;
        gView.updateGraph(n1, n2, n3);
        }
}

