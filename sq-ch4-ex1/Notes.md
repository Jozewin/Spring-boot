# 5.1.1 How singleton beans work

- The singleton in Spring works different compared to others
- In others while using Singleton we wont be creating multiple instances but what is singleton?

### What is even Singleton?
- Singleton is nothing but when an instance is created it will be used everywhere when ever its class is called
- new instances will not be created thats what is Singleton IG

### How Singleton differs in Spring Compared to others?
- In others only one instance will be created and will be called everywhere
- But in Spring the instance will be created then what? But we can create as many instance as we want
- So then many instance will be called? Nope only the Instance in the context will be use wherever the places the instance is created 
