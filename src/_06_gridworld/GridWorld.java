package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
//1. Figure out how to get a World to show.
//
//2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
//
//3. Add another bug at a random location in the world.
//
//4. Change the color of that bug to blue.
//
//5. Make the bug face to the right.
//
//6. Add flowers to the left and right of the bug.
//
//7. Fill the whole world with flowers!
public class GridWorld {
public static void main(String[] args) {
	World world = new World();
	world.show();
	Color color = Color.blue;
	Bug bug = new Bug();
	Random rand = new Random();
	int rand1 = rand.nextInt(9);
	int rand2 = rand.nextInt(9);
	Bug bug2 = new Bug(color);
	Location loc = new Location(rand1, rand2);
	Location loc2 = new Location(1,2);
	world.add(loc, bug2);
	world.add(loc2, bug);
	bug2.turn();
	Flower flower = new Flower();
	for (int i = 0; i < 10; i++) {
		for (int i2 = 0; i2 < 10; i2++) {
			Location loc3 = new Location(i, i2);
			world.add(loc3, flower);
		
		
	}
	}
	
}
}
