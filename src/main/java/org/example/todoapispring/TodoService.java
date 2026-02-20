package org.example.todoapispring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Component is the annonations which basically tells that spring will handle the
 * spring objects
 */
@Component
public interface TodoService {
    String something();
}

