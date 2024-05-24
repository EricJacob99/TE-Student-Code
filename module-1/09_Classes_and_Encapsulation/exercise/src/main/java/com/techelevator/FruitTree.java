package com.techelevator;

public class FruitTree {
    private String typeOfFruit;

    private int startingPiecesOfFruit;

    private int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.startingPiecesOfFruit = startingPiecesOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getStartingPiecesOfFruit() {
        return startingPiecesOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {
        boolean piecesPicked;

        if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            piecesPicked = true;
        } else {
            piecesPicked = false;
        }

        return piecesPicked;
    }
}
