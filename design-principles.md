---
description: >-
  A design principle is a basic tool or technique that can be applied to
  designing or writing code to make that code more maintainable, flexible, or
  extensible.
---

# Design Principles

### Index

1. Identify the aspects of your application that vary and separate them from what stays the same.
2. Program to an interface, not an implementation
3. Favour composition over inheritance
4. Strive for loosely coupled designs between objects that interact
5. The Open-Closed Principle
6. Dependency Inversion Principle
7. Principle of Least Knowledge \(Law of Demeter\)
8. The Hollywood Principle
9. Single Responsibility

* **Identify the aspects of your application that vary and separate them from what stays the same.** Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.
* **Program to an interface, not an implementation.** "Program to an interface" really means "Program to a supertype". The word interface is overloaded here. There’s the concept of interface, but there’s also the Java construct interface. You can program to an interface, without having to actually use a Java interface. The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code.
* **Favour composition over inheritance.** Creating systems using composition gives you a lot more flexibility. Not only does it let you encapsulate a family of algorithms into their own set of classes, but it also lets you change behavior at runtime as long as the object you’re composing with implements the correct behavior interface.
* **Strive for loosely coupled designs between objects that interact.** Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
* **The Open-Closed Principle: Classes should be open for extension, but closed for modification.** Allow classes to be easily extended to incorporate new behavior without modifying existing code. Such designs are resilient to change and flexible enough to take on new functionality to meet changing requirements. While it may seem like a contradiction, there are techniques for allowing code to be extended without direct modification. Be careful when choosing the areas of code that need to be extended; applying the Open-Closed Principle EVERYWHERE is wasteful and unnecessary, and can lead to complex, hard-to-understand code.
* **Dependency Inversion Principle: Depend upon abstractions. Do not depend upon concrete classes.** At first, this principle sounds a lot like “Program to an interface, not an implementation,” right? It is similar; however, the Dependency Inversion Principle makes an even stronger statement about abstraction. It suggests that our high-level components should not depend on our low-level components; rather, they should both depend on abstractions. A “high-level” component is a class with behavior defined in terms of other, “low-level” components. For example, [PizzaStore]() is a high-level component because its behavior is defined in terms of pizzas - it creates all the different pizza objects, and prepares, bakes, cuts, and boxes them, while the pizzas it uses are low-level components.

  _**Where’s the “inversion” in Dependency Inversion Principle?**_

  The “inversion” in the name Dependency Inversion Principle is there because it inverts the way you typically might think about your OO design. The low-level components depend on a higher level abstraction. Likewise, the high-level component is also tied to the same abstraction. So, the top-to-bottom dependency chart has inverted itself, with both high-level and low- level modules now depending on the abstraction.

* **Principle of Least Knowledge \(Law of Demeter\): Talk only to your immediate friends** It means when you are designing a system, for any object, be careful of the number of classes it interacts with and also how it comes to interact with those classes. This principle prevents us from creating designs that have a large number of classes coupled together so that changes in one part of the system cascade to other parts. When you build a lot of dependencies between many classes, you are building a fragile system that will be costly to maintain and complex for others to understand. But how do you keep from doing this? The principle provides some guidelines: take any object; now from any method in that object, the principle tells us that we should only invoke methods that belong to:

  * The object itself
  * Objects passed in as a parameter to the method
  * Any object the method creates or instantiates \(Notice that these guidelines tell us not to call methods on objects that were returned from calling other methods!!\)
  * Any components of the object \(Think of a “component” as any object that is referenced by an instance variable. In other words, think of this as a HAS-A relationship\)

  What’s the harm in calling the method of an object we get back from another call? Well, if we were to do that, then we’d be making a request of another object’s subpart \(and increasing the number of objects we directly know\). In such cases, the principle forces us to ask the object to make the request for us; that way we don’t have to know about its component objects \(and we keep our circle of friends small\).

* **The Hollywood Principle: Don't call us, we'll call you.** The Hollywood Principle gives us a way to prevent **"dependency rot."** Dependency rot happens when you have high-level components depending on low-level components depending on high-level components depending on sideways components depending on low-level components, and so on. When rot sets in, no one can easily understand the way a system is designed. With the Hollywood Principle, we allow low-level components to hook themselves into a system, but the high-level components determine when they are needed, and how. In other words, the high-level components give the low-level components a “don’t call us, we’ll call you” treatment.
* **Single Responsibility: A class should have only one reason to change.** Every responsibility of a class is an area of potential change. More than one responsibility means more than one area of change. This principle guides us to keep each class to a single responsibility. We know we want to avoid change in a class like the plague — modifying code provides all sorts of opportunities for problems to creep in. Having two ways to change increases the probability the class will change in the future, and when it does, it’s going to affect two aspects of your design. Separating responsibility in design is one of the most difficult things to do. Our brains are just too good at seeing a set of behaviors and grouping them together even when there are actually two or more responsibilities. The only way to succeed is to be diligent in examining your designs and to watch out for signals that a class is changing in more than one way as your system grows.
  * **Cohesion** is a term you’ll hear used as a measure of how closely a class or a module supports a single purpose or responsibility.
  * We say that a module or class has high cohesion when it is designed around a set of related functions, and we say it has low cohesion when it is designed around a set of unrelated functions.
  * Cohesion is a more general concept than the Single Responsibility Principle, but the two are closely related. Classes that adhere to the principle tend to have high cohesion and are more maintainable than classes that take on multiple responsibilities and have low cohesion.

## 

