enum PizzaSize{SMALL, MEDIUM, LARGE}
//
//     private int serving;
//
//     PizzaSize(int serving){
//         this.serving = serving;
//     }
//
//     public int getServing(){
//         return this.serving;
//     }
//
// }

class MyPizza{
    void getMenu(){
        System.out.println("Dear Customer, we have the following sizes available:");
        //Loop through the values of enum
        PizzaSize []arr = PizzaSize.values();
        for(PizzaSize size : arr){
System.out.println(size);
            // System.out.println(size + " serves " + size.getServing() + " persons");
        }

    }

    public static void main(String[] args) {
        new PizzaShop().getMenu();
    }
}
