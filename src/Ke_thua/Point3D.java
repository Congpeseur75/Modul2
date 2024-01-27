package Ke_thua;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float z){
        this.z = z;
    }
    public Point3D(float z, float x, float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.z = z;
    }
    public float[] getXYZ(){
        float[] relust = new float[3];
        relust[0] = this.getX();
        relust[1] = this.getY();
        relust[2] = this.getZ();
        return relust;

    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(2.3f);
        System.out.println(point3D);

        point3D = new Point3D(2.3f,4.5f,5.5f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}


