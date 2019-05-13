class Timer extends Thread{
int time;
public static void main(String[] args) {


Timer timer= new Timer();
timer.start();
}

public void run(){
while (true) {


  try{
Thread.sleep(1000);
}
catch(Exception e){

}
finally{
System.out.print("\r" + time);
time++;
}
}
}

}
