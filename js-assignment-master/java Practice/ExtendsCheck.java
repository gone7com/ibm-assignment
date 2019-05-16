class A 	{

}

class B extends A 	{

}

class C extends B 	{

}

class D extends C 	{

}

class Gen<Temp>	{

}

class ExtendsCheck	{
	public static void main(String[] args) {
		Gen<? extends B> g1= new Gen<>();
		Gen<? super B> g2= new Gen<>();
	}
}
