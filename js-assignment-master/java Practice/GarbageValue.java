class GarbageValue{
public static void main(String[] args){
Runtime runtime= Runtime.getRuntime();
System.out.println("Total memory avialable:"+runtime.totalMemory());
System.out.println("free memory avialable:"+runtime.freeMemory());
for (int var=0;var<10000 ;var++ ) {
  new java.util.Scanner(System.in);
}

runtime.gc();
System.out.println("free memory avialable:"+runtime.freeMemory());
}


}
