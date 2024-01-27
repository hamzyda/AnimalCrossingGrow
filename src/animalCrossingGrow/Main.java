package animalCrossingGrow;
//main
public class Main {
    AnimalCrossingGrow AnimalCrossingGrow = new AnimalCrossingGrow();

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AnimalCrossingGrow window = new AnimalCrossingGrow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}