This is a word inherited from biology, describing an organism with many forms or stages.

Polymorphism allows us to **program in the general** instead of in the specific and is a key concept in OOP.

## Compile Time Polymorphism
This is method overloading. Compiler will work out at compile time which method you're planning to use.

## Run Time Polymorphism
Uses inheritance and interfaces. Also known as **dynamic method dispatch**, where a call toan overridden method is resolved at runtime.

The JVM **doesn't call the method that is defined by the variable type**, it calls the method for the object that is referred to.

![[DynamicMethodDispatch.png]]

Run Time Polymorphism allows programs to process objects that share a superclass as though they were all objects ***of*** the superclass.

Polymorphic processing allows you to create an Array (eg of type Animal) then create objects of subclass types by assigning to each index position:
```
Animal[] animals = new Animal[];
animals[0] = new Dog();
animals[1] = new Lion();
animals[2] = new Animal();
```

We could then cycle through this array calling a method with overridden versions in each subclass, and the correct one would be called at runtime:
```
for (Animal a : animals) {
a.makeNoise(); // this produces different output for each (Bark, Roar, Animal makes a noise)
}
```

This is an example of programming the general.



#methodoverloading #polymorphism #inheritance #interfaces #programminginthegeneral