package org.example.todoapispring;

import org.springframework.stereotype.Service;

@Service("another")
public class AnotherTodoService implements TodoService {
    @Override
    public String something(){
        return "something from anothertodoservice";
    }
}
