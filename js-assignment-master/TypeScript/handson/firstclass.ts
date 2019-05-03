class myCar {
model:string="";
price:number=0;
engine:string="";

constructor(model:string,price:number,engine:string){

this.model=model;
this.price=price;
this.engine=engine;
}

 runCar(){
  console.log(`${this.model} is Running`);
}

//  runCar()(price:number){
// if(price<500000)
// console.log("Simple Car is running");
//   else{
//     console.log("Premium Car is running");
//   }
// }
}
var audi= new myCar("audi",700000000,"4cylinder");
audi.runCar();
