package bai6;

import java.util.Arrays;
public class MovablePoint extends Point2D{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] pt = new float[2];
        pt[0] = this.xSpeed;
        pt[1] = this.ySpeed;
        return pt;
    }
    public void setSpeed(float xSpeed, float ySpeed, float x, float y){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;;
    }
    public MovablePoint move(){
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3.5f,4.5f);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));

        movablePoint = new MovablePoint(3.5f,4.5f,5.5f,6.5f);
        System.out.println(movablePoint);
    }
}
