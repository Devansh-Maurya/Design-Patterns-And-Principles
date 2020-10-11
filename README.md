# Design Patterns and Principles
**A collection of design patterns and principles written in Kotlin.**

### What are Design Principles?

**A design principle is a basic tool or technique that can be applied to designing or writing code to make that code more maintainable, flexible, or extensible.**

[Explore the Design Principles in this repo](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles#design-principles)

### What are Design Patterns?

**A design pattern is a solution to a problem in a context.**
* The **context** is the situation in which the pattern applies. This should be a recurring situation.
* The **problem** refers to the goal you are trying to achieve in this context, but it also refers to any constraints that occur in the context.
* The **solution** is what you’re after: a general design that anyone can apply which resolves the goal and set of constraints.

If you find yourself in a context with a problem that has a goal that is affected by a set of constraints, then you can apply a design that resolves the goal and constraints and leads to a solution.

[Explore the Design Patterns in this repo](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles#design-patterns)

## Design Principles

#### Index

1. Identify the aspects of your application that vary and separate them from what stays the same.
2. Program to an interface, not an implementation
3. Favor composition over inheritance
4. Strive for loosely coupled designs between objects that interact
5. The Open-Closed Principle
6. Dependency Inversion Principle
7. Principle of Least Knowledge (Law of Demeter)
8. The Hollywood Principle
9. Single Responsibility

* **Identify the aspects of your application that vary and separate them from what stays the same.** Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.

* **Program to an interface, not an implementation.** "Program to an interface" really means "Program to a supertype". The word interface is overloaded here. There’s the concept of interface, but there’s also the Java construct interface. You can program to an interface, without having to actually use a Java interface. The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code.

* **Favor composition over inheritance.** Creating systems using composition gives you a lot more flexibility. Not only does it let you encapsulate a family of algorithms into their own set of classes, but it also lets you change behavior at runtime as long as the object you’re composing with implements the correct behavior interface.

* **Strive for loosely coupled designs between objects that interact.** Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.

* **The Open-Closed Principle: Classes should be open for extension, but closed for modification.** Allow classes to be easily extended to incorporate new behavior without modifying existing code. Such designs are resilient to change and flexible enough to take on new functionality to meet changing requirements. While it may seem like a contradiction, there are techniques for allowing code to be extended without direct modification. Be careful when choosing the areas of code that need to be extended; applying the Open-Closed Principle EVERYWHERE is wasteful and unnecessary, and can lead to complex, hard-to-understand code.

* **Dependency Inversion Principle: Depend upon abstractions. Do not depend upon concrete classes.** At first, this principle sounds a lot like “Program to an interface, not an implementation,” right? It is similar; however, the Dependency Inversion Principle makes an even stronger statement about abstraction. It suggests that our high-level components should not depend on our low-level components; rather, they should both depend on abstractions. A “high-level” component is a class with behavior defined in terms of other, “low-level” components. For example, [PizzaStore](src/factorymethod/pizzastoreexample/pizzastore/PizzaStore.kt) is a high-level component because its behavior is defined in terms of pizzas - it creates all the different pizza objects, and prepares, bakes, cuts, and boxes them, while the pizzas it uses are low-level components.

    _**Where’s the “inversion” in Dependency Inversion Principle?**_
    
    The “inversion” in the name Dependency Inversion Principle is there because it inverts the way you typically might think about your OO design. The low-level components depend on a higher level abstraction. Likewise, the high-level component is also tied to the same abstraction. So, the top-to-bottom dependency chart has inverted itself, with both high-level and low- level modules now depending on the abstraction.
    
* **Principle of Least Knowledge (Law of Demeter): Talk only to your immediate friends** It means when you are designing a system, for any object, be careful of the number of classes it interacts with and also how it comes to interact with those classes. This principle prevents us from creating designs that have a large number of classes coupled together so that changes in one part of the system cascade to other parts. When you build a lot of dependencies between many classes, you are building a fragile system that will be costly to maintain and complex for others to understand. But how do you keep from doing this? The principle provides some guidelines: take any object; now from any method in that object, the principle tells us that we should only invoke methods that belong to:
    * The object itself
    * Objects passed in as a parameter to the method
    * Any object the method creates or instantiates (Notice that these guidelines tell us not to call methods on objects that were returned from calling other methods!!)
    * Any components of the object (Think of a “component” as any object that is referenced by an instance variable. In other words, think of this as a HAS-A relationship)
    
    What’s the harm in calling the method of an object we get back from another call? Well, if we were to do that, then we’d be making a request of another object’s subpart (and increasing the number of objects we directly know). In such cases, the principle forces us to ask the object to make the request for us; that way we don’t have to know about its component objects (and we keep our circle of friends small).
    
* **The Hollywood Principle: Don't call us, we'll call you.** The Hollywood Principle gives us a way to prevent **"dependency rot."** Dependency rot happens when you have high-level components depending on low-level components depending on high-level components depending on sideways components depending on low-level components, and so on. When rot sets in, no one can easily understand the way a system is designed. With the Hollywood Principle, we allow low-level components to hook themselves into a system, but the high-level components determine when they are needed, and how. In other words, the high-level components give the low-level components a “don’t call us, we’ll call you” treatment.
    
* **Single Responsibility: A class should have only one reason to change.** Every responsibility of a class is an area of potential change. More than one responsibility means more than one area of change. This principle guides us to keep each class to a single responsibility. We know we want to avoid change in a class like the plague — modifying code provides all sorts of opportunities for problems to creep in. Having two ways to change increases the probability the class will change in the future, and when it does, it’s going to affect two aspects of your design. Separating responsibility in design is one of the most difficult things to do. Our brains are just too good at seeing a set of behaviors and grouping them together even when there are actually two or more responsibilities. The only way to succeed is to be diligent in examining your designs and to watch out for signals that a class is changing in more than one way as your system grows.
    * **Cohesion** is a term you’ll hear used as a measure of how closely a class or a module supports a single purpose or responsibility.
    * We say that a module or class has high cohesion when it is designed around a set of related functions, and we say it has low cohesion when it is designed around a set of unrelated functions.
    * Cohesion is a more general concept than the Single Responsibility Principle, but the two are closely related. Classes that adhere to the principle tend to have high cohesion and are more maintainable than classes that take on multiple responsibilities and have low cohesion.

## Design Patterns

#### Index

1. Strategy
2. Observer
3. Decorator
4. Factory Method
5. Abstract Factory
6. Singleton
7. Command
8. Adapter
9. Facade
10. Template Method
11. Iterator
12. Composite
13. State
14. Proxy

* **Strategy Pattern:** The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently of clients that use it.
  * **Example:** [An action game design using Strategy pattern](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles/tree/master/src/strategy/actiongame)
  
* **Observer Pattern: The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.** Subjects, or as we also know them, Observables, update Observers using a common interface. Observers are loosely coupled in that the Observable knows nothing about them, other than that they implement the Observer interface. You can push or pull data from the Observable when using the pattern (pull is considered more “correct”). Don’t depend on a specific order of notification for your Observers. Java has several implementations of the Observer Pattern, including the general purpose java.util.Observable.
  * **Example:** Weather app design using Observer pattern.
     1. [From scratch](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles/tree/master/src/observer/weatherdata/scratch)
     2. [Using Java's in-built Observer pattern](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles/tree/master/src/observer/weatherdata/inbuilt)

* **Decorator Pattern: The Decorator Pattern attaches additional responsibilities to an object dynamically.Decorators provide a flexible alternative to subclassing for extending functionality.** Composition and delegation can often be used to add new behaviors at runtime. The Decorator Pattern provides an alternative to subclassing for extending behavior. The Decorator Pattern involves a set of decorator classes that are used to wrap concrete components. Decorator classes mirror the type of the components they decorate. (In fact, they are the same type as the components they decorate, either through inheritance or interface implementation.) Decorators change the behavior of their components by adding new functionality before and/or after (or even in place of) method calls to the component. You can wrap a component with any number of decorators. Decorators are typically transparent to the client of the component; that is, unless the client is relying on the component’s concrete type. Decorators can result in many small objects in our design, and overuse can be complex.
  * **Example:** [Making different beverages with add-ons using Decorator pattern](https://github.com/Devansh-Maurya/Design-Patterns-And-Principles/tree/master/src/decorator/coffeeshop)

* **Factory Method Pattern: The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.** As with every factory, the Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types. The abstract Creator gives you an interface with a method for creating objects, also known as the “factory method.” Any other methods implemented in the abstract Creator are written to operate on products produced by the factory method. Only subclasses actually implement the factory method and create products. As in the official definition, you’ll often hear developers say that the Factory Method lets subclasses decide which class to instantiate. They say “decide” not because the pattern allows subclasses themselves to decide at runtime, but because the creator class is written without knowledge of the actual products that will be created, which is decided purely by the choice of the subclass that is used.
  * **Example:** [PizzaStore creating Pizzas using Factory method pattern](src/factorymethod/pizzastoreexample)
  
* **Abstract Factory Pattern: The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.** Abstract Factory allows a client to use an abstract interface to create a set of related products without knowing (or caring) about the concrete products that are actually produced. In this way, the client is decoupled from any of the specifics of the concrete products. Often the methods of an Abstract Factory are implemented as factory methods. The job of an Abstract Factory is to define an interface for creating a set of products. Each method in that interface is responsible for creating a concrete product, and we implement a subclass of the Abstract Factory to supply those implementations. So, factory methods are a natural way to implement your product methods in your abstract factories.
  * **Example:** [PizzaStore creating Pizzas with different ingredients using Abstract Factory pattern](src/abstractfactory/pizzastoreexample)
  
* **Singleton Pattern: The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.** We’re taking a class and letting it manage a single instance of itself. We’re also preventing any other class from creating a new instance on its own. To get an instance, we have to go through the class itself. We’re also providing a global access point to the instance: whenever you need an instance, just query the class and it will hand you back the single instance. We can implement this so that the Singleton is created in a lazy manner, which is especially important for resource-intensive objects.
  * **Example:**
      1. [From scratch](src/singleton/scratch)
      2. [Using Kotlin's `object`](src/singleton/kotlinobject)
      
* **Command Pattern: The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.** A **command object** encapsulates a request by binding together a set of actions on a specific **receiver**. To achieve this, it packages the actions and the receiver up into an object that exposes just one method, `execute()`. When called, `execute()` causes the actions to be invoked on the receiver. From the outside, no other objects really know what actions get performed on what receiver; they just know that if they call the `execute()` method, their request will be serviced. The examples linked below show parameterizing an object with a command. An **invoker** makes a request of a Command object by calling its `execute()` method, which invokes those actions on the receiver. Invokers can be parameterized with Commands, even dynamically at runtime. When commands support undo, they have an `undo()` method that mirrors the `execute()` method. Whatever `execute()` last did, `undo()` reverses. **Macro Commands** are a simple extension of Command that allow multiple commands to be invoked. Likewise, Macro Commands can easily support `undo()`. Commands may also be used to implement logging and transactional systems.
  * **Example:** A configurable remote control performing its actions using command objects
      1. [Without undo on invoker](src/command/RemoteLoader.kt)
      2. [With undo on invoker](src/command/RemoteLoaderWithUndo.kt)
      
* **Adapter Pattern: The Adapter Pattern converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.** This pattern allows us to use a client with an incompatible interface by creating an Adapter that does the conversion. This acts to decouple the client from the implemented interface, and if we expect the interface to change over time, the adapter encapsulates that change so that the client doesn't have to be modified each time it needs to operate against a different interface. The Adapter Pattern is full of good OO design principles. It makes use of object composition to wrap the **adaptee** with an altered interface. This approach has the added advantage that we can use an adapter with any subclass of the adaptee. The pattern binds the client to an interface, not an implementation; we could use several adapters, each converting a different backend set of classes. Or, we could add new implementations after the fact, as long as they adhere to the **Target interface.** Implementing an adapter may require little work or a great deal of work depending on the size and complexity of the target interface. There are two forms of the Adapter Pattern: **object** and **class adapters**. The example below is an example of **object adapter**. Class adapters require multiple inheritance and thus are not found in Kotlin (and Java).
  * **Example:** [Duck simulator using a Turkey in place of a duck using a `TurkeyAdapter`](src/adapter/ducksimulator)

* **Facade Pattern: The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.** To use the Facade Pattern, we create a class that simplifies and unifies a set of more complex classes that belong to some subsystem. Unlike a lot of patterns, Facade is fairly straightforward.
  * **Example:** [Home Theater system's interface simplified by using a Facade pattern](src/facade/hometheaterexample)
      
* **Template Method Pattern: The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.** This pattern is all about creating a template for an algorithm. A template is just a method that defines an algorithm as a set of steps. One or more of these steps is defined to be abstract and implemented by a subclass. This ensures the algorithm’s structure stays unchanged, while subclasses provide some part of the implementation. A hook is a method that is declared in the abstract class, but only given an empty or default implementation. This gives subclasses the ability to “hook into” the algorithm at various points, if they wish; a subclass is also free to ignore the hook. The Template Method Pattern gives us an important technique for code reuse. To prevent subclasses from changing the algorithm in the template method, declare the template method as final. The connection between the **Hollywood Principle** and the Template Method Pattern is probably somewhat apparent: when we design with the Template Method Pattern, we’re telling subclasses, “don’t call us, we’ll call you.”
  * **Example:** [Encapsulating Tea and Coffee preparation algorithms using Template method pattern](src/templatemethod/caffeinebeverage)  
      
* **Iterator Pattern: The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.** the pattern gives you a way to step through the elements of an aggregate without having to know how things are represented under the covers. once you have a uniform way of accessing the elements of all your aggregate objects, you can write polymorphic code that works with any of these aggregates — just like the printMenu() method, which doesn’t care if the menu items are held in an Array or ArrayList (or anything else that can create an Iterator), as long as it can get hold of an Iterator. The other important impact on your design is that the Iterator Pattern takes the responsibility of traversing elements and gives that responsibility to the iterator object, not the aggregate object. This not only keeps the aggregate interface and implementation simpler, it removes the responsibility for iteration from the aggregate and keeps the aggregate focused on the things it should be focused on (managing a collection of objects), not on iteration.
  * **Example:** Iterating over a diner menu using iterator pattern.
    1. [From scratch](src/iterator/dinermenu/scratch)
    2. [Using Kotlin's Iterator and Iterable](src/iterator/dinermenu/inbuilt)
      
* **Composite Pattern: The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.** The Composite Pattern allows us to build structures of objects in the form of trees that contain both compositions of objects and individual objects as nodes. Using a composite structure, we can apply the same operations over both composites and individual objects. In other words, in most cases we can ignore the differences between compositions of objects and individual objects. A composite contains **components**. Components come in two flavors: composites and leaf elements. Sound recursive? It is. A composite holds a set of children; those children may be other composites or leaf elements. When you organize data in this way you end up with a tree structure (actually an upside-down tree structure) with a composite at the root and branches of composites growing up to leaf nodes. There are many design tradeoffs in implementing Composite. You need to balance transparency and safety with your needs.
  * **Example:** [Printing diner menu example with submenus using Composite pattern combined with Iterator pattern](src/composite/dinermenu)
      
* **State Pattern: he State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.** Because the pattern encapsulates state into separate classes and delegates to the object representing the current state, we know that behavior changes along with the internal state. The [Gumball Machine](src/state/gumballmachine/context/GumballMachine.kt) provides a good example: when the gumball machine is in the [NoQuarterState](src/state/gumballmachine/state/NoQuarterState.kt) and you insert a quarter, you get different behavior (the machine accepts the quarter) than if you insert a quarter when it’s in the [HasQuarterState](src/state/gumballmachine/state/HasQuarterState.kt) (the machine rejects the quarter). What does it mean for an object to “appear to change its class”? Think about it from the perspective of a client: if an object you’re using can completely change its behavior, then it appears to you that the object is actually instantiated from another class. In reality, however, you know that we are using composition to give the appearance of a class change by simply referencing different state objects. With the State Pattern, we have a set of behaviors encapsulated in state objects; at any time the context is delegating to one of those states. Over time, the current state changes across the set of state objects to reflect the internal state of the context, so the context’s behavior changes over time as well. The client usually knows very little, if anything, about the state objects.
  * **Example:** [GumballMachine with its states implemented using State pattern](src/state/gumballmachine)
      
* **Proxy Pattern: The Proxy Pattern provides a surrogate or placeholder for another object to control access to it.** Use the Proxy Pattern to create a representative object that controls access to another object, which may be remote, expensive to create, or in need of securing. there are many variations of the Proxy Pattern, and the variations typically revolve around the way the proxy "controls access." First we have a [`Subject`](src/proxy/protectionproxy/commandexecutor/subject), which provides an interface for the [`RealSubject`](src/proxy/protectionproxy/commandexecutor/realsubject) and the [`Proxy`](src/proxy/protectionproxy/commandexecutor/proxy). By implementing the same interface, the Proxy can be substituted for the RealSubject anywhere it occurs. The RealSubject is the object that does the real work. It’s the object that the Proxy represents and controls access to. The Proxy holds a reference to the RealSubject. In some cases, the Proxy may be responsible for creating and destroying the RealSubject. Clients interact with the RealSubject through the Proxy. Because the Proxy and RealSubject implement the same interface (Subject), the Proxy can be substituted anywhere the subject can be used. The Proxy also controls access to the RealSubject; this control may be needed if the Subject is running on a remote machine, if the Subject is expensive to create in some way or if access to the subject needs to be protected in some way.

  * **Example:** [CommandExecutor example using a Protection + Virtual Proxy](src/proxy/protectionproxy/commandexecutor)

  There are many variations of the Proxy Pattern, and the variations typically revolve around the way the proxy **"controls access."**
    
    1. **Remote Proxy: Controls access to a remote object.** With Remote Proxy, the proxy acts as a local representative for an object that lives in a different JVM. A method call on the proxy results in the call being transferred over the wire, invoked remotely, and the result being returned back to the proxy and then to the Client.
    2. **Virtual Proxy: Controls access to a resource that is expensive to create.** Virtual Proxy acts as a representative for an object that may be expensive to create. The Virtual Proxy often defers the creation of the object until it is needed; the Virtual Proxy also acts as a surrogate for the object before and while it is being created. After that, the proxy delegates requests directly to the RealSubject.
    3. **Protection Proxy: Controls access to a resource based on access rights.** It’s a proxy that controls access to an object based on access rights. For instance, if we had an employee object, a Protection Proxy might allow the employee to call certain methods on the object, a manager to call additional methods (like setSalary()), and a human resources employee to call any method on the object.
    4. **Firewall Proxy: Controls access to a set of network resources, protecting the subject from "bad" clients.** Often seen in corporate firewall systems.
    5. **Smart Reference Proxy: Provides additional actions whenever a subject is referenced, such as counting the number of references to an object.**
    6. **Caching Proxy: Provides temporary storage for results of operations that are expensive. It can also allow multiple clients to share the results to reduce computation or network latency.** Often seen in web server proxies as well as content management and publishing systems.
    7. **Synchronization Proxy: Provides safe access to a subject from multiple threads.** Seen in JavaSpaces, where it controls synchronized access to an underlying set of objects in a distributed environment.
    8. **Complexity Hiding Proxy: Hides the complexity of and controls access to a complex set of classes.** This is sometimes called the Facade Proxy for obvious reasons. The Complexity Hiding Proxy differs from the Facade Pattern in that the proxy controls access, while the Facade just provides an alternative interface.
    9. **Copy-On-Write Proxy: Controls the copying of an object by deferring the copying of an object until it is required by a client.** This is a variant of the **Virtual Proxy**. Seen in Java's `CopyOnWriteArrayList`.
    
  Proxy is structurally similar to Decorator, but the two differ in their purpose. The Decorator Pattern adds behavior to an object, while a Proxy controls access. Like any wrapper, proxies will increase the number of classes and objects in your designs.
