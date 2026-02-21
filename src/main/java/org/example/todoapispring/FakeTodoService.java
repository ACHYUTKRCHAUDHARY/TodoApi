package org.example.todoapispring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("fake")
public class FakeTodoService implements TodoService {
    @TimeMonitor
    public String something(){
        return "something";
    }
}
