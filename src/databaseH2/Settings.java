package databaseH2;

import game.Direction;
import game.Tile;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public record Settings(String userID, Color color, int speed, Direction direction,
                       ArrayList<Tile> bodyTiles, Tile headTiles, Tile appleTile) implements Serializable {
}
