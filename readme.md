@ExceptionHandler > controllerAdvice > @ResponseStatus

@ControllerAdvice is a specialization of the @Component annotation which allows to handle exceptions across the whole application in one global handling component. It can be viewed as an interceptor of exceptions thrown by methods annotated with @RequestMapping and similar.


@ResponseStatus allows us to modify the HTTP status of our response

