
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make new city kw
        City kw = new City();
        
        //make new robot
        Robot steve = new Robot(kw, 0, 2, Direction.WEST);
        
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        
        steve.move();
        steve.move();
        steve.turnLeft();
        steve.move();
        steve.move();
        steve.move();
        steve.turnLeft();
        steve.move();
        steve.move();
        steve.move();
        steve.turnLeft();
        steve.move();
        steve.move();
        steve.move();
        steve.turnLeft();
        steve.move();
    }
}
