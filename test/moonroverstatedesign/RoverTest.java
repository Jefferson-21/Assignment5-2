/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package moonroverstatedesign;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author jeyarajjeyakumar
 */
 public class RoverTest {
    @Test
    public void testIdleState() {
        MoonRover rover = new MoonRover();
        assertEquals(0, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.accelerate();
        assertEquals(1, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.turnLeft();
        assertEquals(1, rover.getSpeed());
        assertEquals(270, rover.getDirection());

        rover.turnRight();
        assertEquals(1, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.decelerate();
        assertEquals(1, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.stop();
        assertEquals(0, rover.getSpeed());
        assertEquals(0, rover.getDirection());
    }

    @Test
    public void testForwardState() {
        MoonRover rover = new MoonRover();
        rover.setCurrentState(rover.getForwardState());

        assertEquals(0, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.accelerate();
        assertEquals(1, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.turnLeft();
        assertEquals(1, rover.getSpeed());
        assertEquals(270, rover.getDirection());

        rover.turnRight();
        assertEquals(1, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.decelerate();
        assertEquals(0, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.accelerate();
        assertEquals(1, rover.getSpeed());
        assertEquals(0, rover.getDirection());

        rover.stop();
        assertEquals(0, rover.getSpeed());
        assertEquals(0, rover.getDirection());
    }
 }
