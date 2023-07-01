package com.drevin.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

    private static Logger logger;

    private Logger() {
    }

    public static Logger getLogger() {

        if (logger == null){
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message){
        System.out.println(message);
    }

    public Object readResolve(){
        return logger;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
