package singletonandprototype.prototype;

public class PlasticTree extends Tree{

    public PlasticTree(int mass, int height) {
        super(mass, height);
        System.out.println("Class affected is: " + PlasticTree.class);
    }

    @Override
    public Tree copy(){
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }

//    This pattern is handy when our new object is only slightly different from our existing one. In some cases, instances may have only a few combinations of state in a class. So instead of creating new instances, we may create the instances with the appropriate state beforehand and then clone them whenever we want.
//
//Sometimes, we might encounter subclasses that differ only in their state. We can eliminate those subclasses by creating prototypes with the initial state and then cloning them.
//
//Prototype pattern, just like every other design pattern, should be used only when it's appropriate. Since we are cloning the objects, the process could get complex when there are many classes, thereby resulting in a mess. Additionally, it's difficult to clone classes that have circular references.



//    Prototype scope = A new object is created each time it is injected/looked up. It will use new SomeClass() each time.
//
//Singleton scope = (Default) The same object is returned each time it is injected/looked up. Here it will instantiate one instance of SomeClass and then return it each time.

//    @Component
//@Scope("singleton")

    //https://stackoverflow.com/questions/16058365/what-is-difference-between-singleton-and-prototype-bean



    //TODO - Learn the scopes
    // 5 Bean scopes

//Singleton: Only one instance will be created for a single bean definition per Spring IoC container and the same object will be shared for each request made for that bean.
//Prototype: A new instance will be created for a single bean definition every time a request is made for that bean.
//Request: A new instance will be created for a single bean definition every time an HTTP request is made for that bean. But Only valid in the context of a web-aware Spring ApplicationContext.
//Session: Scopes a single bean definition to the lifecycle of an HTTP Session. But Only valid in the context of a web-aware Spring ApplicationContext.
//Global-Session: Scopes a single bean definition to the lifecycle of a global HTTP Session. It is also only valid in the context of a web-aware Spring ApplicationContext.

    //https://www.geeksforgeeks.org/singleton-and-prototype-bean-scopes-in-java-spring/


    //stateless vs stateful

    ///singleton = stateless---> is destroyed after the remote method terminates (and returns a result). Those bean are "stateless".
    //prototype = stateful  ---> add fields and attributes to the bean so that a client can "create" this instance on the server and use it for more then one operation. Those beans are "stateful" (and should be avoided).

    //Prototype scope: A new object is created each time it is injected.
    //Singleton scope: The same object is returned each time it is injected.
    //
    //Prototype scope is used for all beans that are stateful, while the singleton scope should be used for stateless beans. Let me explain with my example. Please copy and run it by yourself to get a clear understanding. Consider an interface Coach.

}
