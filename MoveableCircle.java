/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lb7;

/**
 *
 * @author thaih
 */
public class MoveableCircle implements Moveable{

    private MoveablePoint center;
    private int radius;

    public MoveableCircle(MoveablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.center.setX(this.center.getX() + this.center.getxSpeed());
    }

    @Override
    public void moveDown() {
        this.center.setX(this.center.getX() - this.center.getxSpeed());
    }

    @Override
    public void moveLeft() {
        this.center.setY(this.center.getY() - this.center.getySpeed());
    }

    @Override
    public void moveRight() {
        this.center.setY(this.center.getY() + this.center.getySpeed());
    }

    @Override
    public String toString() {
        return "Center: " + "(" + this.center.getX() + ", "+  this.center.getY() + ")";
    }
}
