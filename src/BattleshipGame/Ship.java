package BattleshipGame;

public class Ship {
    private int[] locationCells;
    private int numOfHits;

    public void setLocation(int[] locs) {
        locationCells = locs;
    }

    public String checkHit(int guess) {
        for (int cell : locationCells) {
            if (cell == guess) {
                numOfHits++;
                if (numOfHits == locationCells.length) {
                    return "Kill!";
                }
            } else {
                return "Hit!";
            }
        }
        return "Miss!";
    }
}
