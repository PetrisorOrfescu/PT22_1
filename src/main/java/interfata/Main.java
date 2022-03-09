package interfata;

public class Main{
    public static void main(String args[]) {
        PolyView view = new PolyView();
        PolyModel model = new PolyModel();
        PolyController c = new PolyController(model,view);
    }
}
