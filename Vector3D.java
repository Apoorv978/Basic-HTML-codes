/* representation of vectors in 3 dimensional coordinate System */

class Vector3D{
private double[] vector;
public void Vector3D(double x,double y,double z){
  vector= new double[3];
  vector[0]=x;
  vector[1]=y;
  vector[2]=z;
}
public void Vector3D(double x,double y){
vector[0]=x;
vector[1]=y;
vector[2]=0;
}
public void Vector3D(double x){
  vector[0]=x;
  vector[1]=0;
  vector[2]=0;
}
public void Vector3D(){
  vector[0]=0;
  vector[1]=0;
  vector[2]=0;
}

public static void main(String[] args){
  Vector3D v = v.Vector3D(1.2,2.2,8.5);
  System.out.println("the vector is represented in cartesian coordinate system ("+v[0]+","+v[1]+","+v[2]+")");
  Vector3D v = v.Vector3D(1.2,2.2);
  System.out.println("the vector is represented in cartesian coordinate system ("+v[0]+","+v[1]+","+v[2]+")");
  Vector3D v = v.Vector3D(1.2);
  System.out.println("the vector is represented in cartesian coordinate system ("+v[0]+","+v[1]+","+v[2]+")");
  Vector3D v = v.Vector3D();
  System.out.println("the vector is represented in cartesian coordinate system ("+v[0]+","+v[1]+","+v[2]+")");
}
}
