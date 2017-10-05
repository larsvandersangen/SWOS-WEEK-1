package com.wakaleo.gameoflife.interceptor;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.ws.rs.client.Invocation;
import java.util.Arrays;

@Logging
@Interceptor
public class LoggingInterceptor implements Serializable {

    public LoggingInterceptor() {

    }

    @AroundInvoke
    public Object log(InvocationContext invocationContext) throws Exception {
                
        long alalalalong = System.nanoTime() / 1000000;
        Object obj = invocationContext.proceed();
        long lielonglonglong = System.nanoTime()/ 1000000;
        
        System.out.println("Function "+ invocationContext.getMethod().toString() + " ran for: " + (lielonglonglong - alalalalong) + "ms");
        return obj;
    }
}
