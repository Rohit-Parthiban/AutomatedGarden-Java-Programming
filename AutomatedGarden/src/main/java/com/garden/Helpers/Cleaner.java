package com.garden.Helpers;

import com.garden.Model.Plant;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.io.File;

public class Cleaner {
    private boolean busy;
    private int row;
    private int col;

    public Cleaner() {
        this.busy = false;
        this.row = -1;
        this.col = -1;
    }

    public boolean isBusy() {
        return busy;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void visitPlant(Plant plant) {
        this.busy = true;
        this.row = plant.getRow();
        this.col = plant.getCol();
        plant.reducePestAttacks(2); // Reduces pest attacks by 2

    }

    public void finishVisit() {
        this.busy = false;
        this.row = -1;
        this.col = -1;
    }
}
