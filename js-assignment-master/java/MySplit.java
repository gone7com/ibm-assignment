
class MySplit{
public static void main(String[] args) {
MySplit ms= new MySplit();
 ms.MySplitVersion("Dheeraj,Joshi",',');
// for (String newst :strnew ) {
  // System.out.println(newst);
}


String[] MySplitVersion(String str,char delimitor){

String[] newstr= new String[str.length()];
int count=0;
int newloc=0;
int len=0;
for(int i =0;i<str.length()-1;i++){
  if(str.charAt(i)==delimitor){

  len++;
  }
}
int[] loc= new int[len];
for(int i =0;i<str.length()-1;i++){

if(str.charAt(i)==delimitor){
  loc[count]=str.indexOf(delimitor);
count++;
}

}

for(int j=0;j<loc.length;j++){
  if(loc[j]==0){
    continue;
  }
newstr[j]=str.substring(newloc,loc[j]);

newloc=loc[j];
}

for(int l=0;l<newstr.length;l++){
if(newstr[l].equals("null")){
continue;
}
else
  System.out.println(newstr[l]);
}

return newstr;
}
}











// String newstr[]= new String[str.length()];
// int flag=0;
// int index=0;
// int arrindex=0;
// if (str.contains(delimitor)) {
// index=str.indexOf(delimitor);
//   while(index!=-1){
//   newstr[arrindex]=str.substring(flag,index);
//   str=str.replace(delimitor,"");
//   str=str.substring(index);
//   flag=index;
//   arrindex++;
//
// }
// return newstr;
// }
// else{
//   newstr[0]=str;
// return  newstr;
// }
// // return newstr;
// }
