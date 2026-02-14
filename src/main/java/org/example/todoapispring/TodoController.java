package org.example.todoapispring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * adding the rest controller it is the starting point in the web application.
 * rest controller basically collecting the request.
 * whatever value going to be returned in the functions, it directly goin to be returned
 * in the response body of https request life cycle
 * it automatically going to do the tast of serialisation accordingly.
 * if we are returning any java objects , its task is to do directly convert in the actual
 *  data type in which it is needed basically means response data type , like json type .
  */
@RestController
public class TodoController {
    private static List<Todo> todos;
    public TodoController() {
        todos = new ArrayList<>();
        todos.add(new Todo(1,false,"Todo 1",1));
        todos.add(new Todo(2,true,"Todo 2",2));
    }

    /**
     * what getmapping annotations does , whenever there is get request on the particular routes
     * it going to perform the get request
     * its used to read the todos
     * @GetMapping("/todos")
     *     public List<Todo>  getTodos() {
     *         return todos;
     *     }
     */

    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> getTodo(){
        return ResponseEntity.ok(todos);
    }
    /**
     * it is used to do add information in the todo
     * as we can see that there is sensitive data in the todo as like userid therefore we have to
     * send the data in the body json format
     * post -> body -> raw(paste the json format)
     * @Requestbody tells that whatever the incoming body in the https request put it into the
     * or it should accessible inside the function
     * in java to get accessible inside the function we have to pass the parameter and
     * requestbody is telling the springboot the parameter is holding some data.
     * and it is the rest api convention to return something
     * if we are doing thorugh void function still is true , but it will not following rest
     * conventation.
     */
    @PostMapping("/todos")
    /**
     * first way
     *  @ResponseStatus(HttpStatus.CREATED)
     *     public Todo createTodo(@RequestBody Todo newTodo){
     *         todos.add(newTodo);
     *         return newTodo;
     *     }
     */

    public ResponseEntity<Todo> createTodo(@RequestBody Todo newTodo){
        todos.add(newTodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }


}
