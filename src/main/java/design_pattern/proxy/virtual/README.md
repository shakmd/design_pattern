# Virtual Proxy Pattern

Virtual Proxy acts as a representative for an object that may be expensive to create. The Virtual Proxy often defers the creation of the object until it is needed. The Virtual Proxy also acts as a surrogate for the object before and while it is being created. After that, the proxy delegates the requests directly to the RealSubject