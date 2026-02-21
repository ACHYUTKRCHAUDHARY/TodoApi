package org.example.todoapispring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
/**
 * cause of this it is available on runtime
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeMonitor {

}
