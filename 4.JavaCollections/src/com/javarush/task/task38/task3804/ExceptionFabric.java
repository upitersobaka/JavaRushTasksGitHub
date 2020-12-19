package com.javarush.task.task38.task3804;

public class ExceptionFabric {

    public static Throwable getException(Enum enm){
        if (enm == null) return new IllegalArgumentException();

        String msg = enm.toString().replace("_", " ").toLowerCase();
        msg = msg.substring(0,1).toUpperCase() + msg.substring(1);
        if (enm != null && enm instanceof ApplicationExceptionMessage) return new Exception(msg);
        if (enm != null && enm instanceof DatabaseExceptionMessage) return new RuntimeException(msg);
        if (enm != null && enm instanceof UserExceptionMessage) return new Error(msg);

        return new IllegalArgumentException();


    }
}
