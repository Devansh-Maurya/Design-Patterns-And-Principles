# Design Patterns and Principles
**A collection of design patterns and principles written in Kotlin.**

### Design Principles

* **Identify the aspects of your application that vary and separate them from what stays the same.** Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.

* **Program to an interface, not an implementation.** "Program to an interface" really means "Program to a supertype". The word interface is overloaded here. There’s the concept of interface, but there’s also the Java construct interface. You can program to an interface, without having to actually use a Java interface. The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code.

* **Favor composition over inheritance.** Creating systems using composition gives you a lot more flexibility. Not only does it let you encapsulate a family of algorithms into their own set of classes, but it also lets you change behavior at runtime as long as the object you’re composing with implements the correct behavior interface.
