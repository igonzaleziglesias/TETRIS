package tetris;

public class Tetris {

    public static void main(String[] args) {

        App game = new App();
        game.setLocationRelativeTo(null);//Para posicionar la ventana en el centro de la pantalla(automatico al ser null)
        game.setVisible(true);

    }
}
