In Python, everything is public by default. This means there is no way to enforce how class attributes and behaviour are accessed and changed. In Java on the other hand, we can (sort of) enforce the rule that a class value must only be manipulated from within the class with the use of **private** visibility.

The use of the **static** keyword means that the member **stays within the class itself** - it should not be called on instances, and if a static value is updated, the update is reflected in all instances. The Math class is a good example of a static context, and contains lots of static methods and fields (such as PI).

All Java classes **extend the Object class** in Java.lang, directly or indirectly (Object is the "ancestor" of all other classes).

Subclasses (child classes) inherit behaviour and attributes from the superclass (parent), but can also have additional attributes and functionality. We can also override inherited superclass methods using the `@Override` annotation. This means replacing a given method with one of the same name but with customised params or behaviour.

Inheritance is **is-a** behaviour. Every Surgeon *is a* doctor (but not every doctor is a surgeon).

>NB. You can make arrays of superclass objects containing instances of subclasses:
>![[MyObjectArray.png]]

#private #visibility #static #inheritance #extends #override #is-a #Object #annotations #Arrays