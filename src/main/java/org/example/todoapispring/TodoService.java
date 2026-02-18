package org.example.todoapispring;

import org.springframework.stereotype.Service;

/**
 * @Component is the annonations which basically tells that spring will handle the
 * spring objects
 */
@Service
public interface TodoService {
    @Override
    public String something(){
        return "something";
    }
}
