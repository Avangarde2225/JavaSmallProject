package AbstractClasses;

public abstract class GameCalculator {
    public abstract void calculate();

    public final void gameOver(){
        System.out.println("Game is over");
    }
}
