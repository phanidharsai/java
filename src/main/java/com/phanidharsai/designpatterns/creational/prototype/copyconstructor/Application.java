package com.phanidharsai.designpatterns.creational.prototype.copyconstructor;

public class Application {
    public static void main(String[] args){
        GameState currentState = new GameState(1);
        GameState checkpoint = new GameState(currentState);  // Deep copy
        try {
            currentState.enterBossFight();
        } catch (Exception e) {
            currentState = checkpoint;  // Restore from copy
        }




    }
}
