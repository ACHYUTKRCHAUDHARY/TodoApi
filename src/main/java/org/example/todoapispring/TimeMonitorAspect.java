package org.example.todoapispring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class  TimeMonitorAspect {
    @Around("@annotation(TimeMonitor)")
    public void logtime(ProceedingJoinPoint joinPoint){
        System.out.println("Logging time");
        long start=System.currentTimeMillis();//start time of code

        try{
            joinPoint.proceed();
        }catch(Throwable e){
            System.out.println("Something went wrong");
        }
        finally {

//        execute the joint point --

            long end=System.currentTimeMillis();
            long totalExecutionTime=end-start;
            System.out.println("Total execution time: "+totalExecutionTime);
        }

    }
}
