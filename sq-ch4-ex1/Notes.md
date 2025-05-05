# 6 Using aspects with Spring AOP
- Since we have worked @Autowired annotation we know how inject works by now.
- When we use @Autowired annotation the spring will inject the object which we requested.
- There is not only DI available. Using spring we can also intercept method calls and alter execution of the method when we want


### When designing an aspect there are three important parts to be covered:
- What code you want Spring to execute when you call specific methods. This is called **Aspect**
- When the app should execute this logic of the aspect. This is named **Advice**
- Which methods the framework need to intercept and execute the aspect for them. This is called **PointCut**
    - Another aspect terminology is **Join Point** -> defines the event that triggers the execution of an aspect.
  