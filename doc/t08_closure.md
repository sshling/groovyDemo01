
closure, a powerful way of representing blocks of executable code.
- are objects, they can be passed around as method parameters.
- closure are code block,they can also be executed when required.
- like methods,closures can be defined in terms of one or more parameters.


8.1 closures
The syntax of defining a closure is:

    {comma-separated-formal-parameter-list -> statement-list }  

If no formal parameters are required,then the parameter List and the -> separator are omitted.


8.2 closure,collection and string
several List,Map,String methods accept a closure as an argument.

    void each(Closure closure)









