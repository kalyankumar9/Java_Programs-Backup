
class Rectangle{ // we are binding the variables length, width with the method findArea
 
 private int length=20;//Data encapsulation..
 private int width=10;
 
 public void findArea(){
  System.out.println("Area="+length*width);
 }
 
 public int getLength(){
  return this.length;
 }
 
 public int getWidth(){
  return this.width;
 }
 
}