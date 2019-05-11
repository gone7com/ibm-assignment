
class MySplit{
public static void main(String[] args) {
MySplit ms= new MySplit();
 ms.MySplitVersion("Dheeraj,Joshi,son",',');
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
len+=1;
int[] loc= new int[len];
System.out.println(loc.length);
for(int i =0;i<str.length()-1;i++){
Character a= new Character(str.charAt(i));
if(a.equals(delimitor)){
  System.out.println(delimitor);
  loc[count]=i;
count++;
}

}
loc[count]=str.length();
System.out.println(loc[0]+" "+loc[1]+" "+count);
for(int j=0;j<loc.length;j++){
  if(loc[j]==0){
    continue;
  }
newstr[j]=str.substring(newloc,loc[j]);

newloc=loc[j]+1;
}
System.out.println("Answer after  split is:");
for(int l=0;l<newstr.length-1;l++){

if(newstr[l]==null){
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
