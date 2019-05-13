class Random extends Thread{
  public static void main(String[] args) {
Random ran= new Random();
ran.start();
  }
public void run(){
try{
while(true){
    Thread.sleep(1000);
System.out.println(Math.abs(System.currentTimeMillis()*System.currentTimeMillis()%10000));
}
}
catch(Exception e){
}
}
}
