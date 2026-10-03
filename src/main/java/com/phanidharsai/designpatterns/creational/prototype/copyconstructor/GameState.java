package com.phanidharsai.designpatterns.creational.prototype.copyconstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameState {
    private int score;
    private int level;
    private List<String> inventory;
    private Map<String, Integer> achievements;

    // Regular constructor
    public GameState(int level) {
        this.score = 0;
        this.level = level;
        this.inventory = new ArrayList<>();
        this.achievements = new HashMap<>();
    }

    // Copy constructor — explicit and clear
    public GameState(GameState other) {
        this.score = other.score;
        this.level = other.level;
        this.inventory = new ArrayList<>(other.inventory);
        this.achievements = new HashMap<>(other.achievements);
    }

    // Copy factory method — alternative style
    public static GameState copyOf(GameState other) {
        return new GameState(other);
    }

    // Mutators
    public void addScore(int points) { score += points; }
    public void addItem(String item) { inventory.add(item); }
    public void unlock(String achievement) { achievements.put(achievement, level); }

    public void enterBossFight() throws Exception {
        Exception UnsupportedOperationException = null;
        throw UnsupportedOperationException;
    }
}