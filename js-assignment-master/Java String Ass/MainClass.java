class MainClass  extends Other{
static  int dheeraj;
static{

System.out.println("static Main");
}
{
   dheeraj=7;
  System.out.println("INIT Main");
}
public static void main(String[] args) {
  new MainClass();
  System.out.println(dheeraj);
}
MainClass(){
System.out.println("Constructoor Main"+dheeraj);

}
}

class Other{
static{
  System.out.println("Other Static");
}
Other(){
  System.out.println("Other Constructor");
}
}
