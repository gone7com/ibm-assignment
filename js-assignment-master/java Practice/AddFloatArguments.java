class AddFloatArguments{

   public static void main(String[] args) {
    float sum = 0.0f;
    for(int i = 0; i < args.length; i++)
     sum = sum + Float.parseFloat(args[i]);
    System.out.printf("Ans: %.2f", sum);
   }






}
