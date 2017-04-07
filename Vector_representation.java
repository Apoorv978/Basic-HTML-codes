/* representation of vectors in 3 dimensional coordinate System */

class Vector3D{
private double[] vector;
public void Vector3D(double x,double y,double z){
  vec= new double[3];
  v[0]=x;
  v[1]=y;
  v[2]=z;
}
public void Vector3D(double x,double y){
  this(x,y,0.0);
}
public void Vector3D(double x){
  this(x,0.0,0.0);
}
public void Vector3D(){
  this(0.0,0.0,0.0);
}
}
public static void main(string[] args){
  for(int i=0;i<3;i++){
      Vector3D v[
  v.Vector3D(1.2,2.2,8.5);
  System.out.println("the vector is represented in cartesian coordinate system ("+v[0]","+v[1]+","+v[2]+")");
  v.Vector3D(1.2,2.2);
  System.out.println("the vector is represented in cartesian coordinate system ("+v[0]","+v[1]+","+v[2]+")");
  v.Vector3D(1.2);
  System.out.println("the vector is represented in cartesian coordinate system ("+v[0]","+v[1]+","+v[2]+")");
  v.Vector3D();
  System.out.println("the vector is represented in cartesian coordinate system ("+v[0]","+v[1]+","+v[2]+")");
}
}
