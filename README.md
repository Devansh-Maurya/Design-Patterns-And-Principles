# Design Patterns and Principles
**A collection of design patterns and principles written in Kotlin.**

### Design Principles

* **Identify the aspects of your application that vary and separate them from what stays the same.** Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.

* **Program to an interface, not an implementation.** "Program to an interface" really means "Program to a supertype". The word interface is overloaded here. There’s the concept of interface, but there’s also the Java construct interface. You can program to an interface, without having to actually use a Java interface. The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code.

* **Favor composition over inheritance.** Creating systems using composition gives you a lot more flexibility. Not only does it let you encapsulate a family of algorithms into their own set of classes, but it also lets you change behavior at runtime as long as the object you’re composing with implements the correct behavior interface.

* **Strive for loosely coupled designs between objects that interact.** Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.

* **The open-closed principle: Classes should be open for extension, but closed for modification.** allow classes to be easily extended to incorporate new behavior without modifying existing code. Such designs are resilient to change and flexible enough to take on new functionality to meet changing requirements. 

### Design Patterns

* **Strategy Pattern:** The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
  * **Example:** [An action game design using Strategy pattern](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles/tree/master/src/strategy/actiongame)
  
* **Observer Pattern: The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.** Subjects, or as we also know them, Observables, update Observers using a common interface. Observers are loosely coupled in that the Observable knows nothing about them, other than that they implement the Observer interface. You can push or pull data from the Observable when using the pattern (pull is considered more “correct”). Don’t depend on a specific order of notification for your Observers. Java has several implementations of the Observer Pattern, including the general purpose java.util.Observable.
  * **Example:** Weather app design using Observer pattern.
     1. [From scratch](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles/tree/master/src/observer/weatherdata/scratch)
     2. [Using Java's in-built Observer pattern](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles/tree/master/src/observer/weatherdata/inbuilt)
