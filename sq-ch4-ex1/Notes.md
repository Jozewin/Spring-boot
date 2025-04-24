# Choosing what to auto-wire from multiple implementations of an abstraction
- Where there are two implementation of a interface and they both are being used as @Component.
- It will coz error to find spring to check which one to use

## To solve this there are two annotations
- @Qualifier()
- @Primary

#### @Primary
- If there are two implementation the spring will take the one implementation with the Primary tag

### @Qualifier("Name")
- Using this we can declare name to the implementations and when calling the object in somewhere will mention @Qualifier("And the name")