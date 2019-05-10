class AddArguments{
public static void main(String[] args) {
  AddArguments ag= new AddArguments();
  System.out.println(ag.AddArg(args));
}

int AddArg(String...arg){
  int count=0;
if(arg.length==1){
  System.out.println("Error");
  return 0;
}
else{
  for (int i=0;i<arg.length ;i++ ) {

    count+=Integer.parseInt(arg[i]);
  }
  return count;
}

}






}
