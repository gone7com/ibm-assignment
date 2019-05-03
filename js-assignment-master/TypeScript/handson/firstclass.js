var myCar = /** @class */ (function () {
    function myCar(model, price, engine) {
        this.model = "";
        this.price = 0;
        this.engine = "";
        this.model = model;
        this.price = price;
        this.engine = engine;
    }
    myCar.prototype.runCar = function () {
        console.log(this.model + " is Running");
    };
    return myCar;
}());
var audi = new myCar("audi", 700000000, "4cylinder");
audi.runCar();
