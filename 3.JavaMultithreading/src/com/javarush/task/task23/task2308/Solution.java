package com.javarush.task.task23.task2308;

/* 
Рефакторинг, вложенные классы
*/
public class Solution {
    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super(new Constants().SERVER_IS_CURRENTLY_NOT_ACCESSIBLE);
        }

        public ServerNotAccessibleException(Throwable cause) {
            super(new Constants().SERVER_IS_CURRENTLY_NOT_ACCESSIBLE, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(new Constants().USER_IS_NOT_AUTHORIZED);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(new Constants().USER_IS_NOT_AUTHORIZED, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(new Constants().USER_IS_BANNED);
        }

        public BannedUserException(Throwable cause) {
            super(new Constants().USER_IS_BANNED, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(new Constants().ACCESS_IS_DENIED);
        }

        public RestrictionException(Throwable cause) {
            super(new Constants().ACCESS_IS_DENIED, cause);
        }
    }

    public final static class  Constants {
        public final static String SERVER_IS_CURRENTLY_NOT_ACCESSIBLE = "The server is not currently accessible.";
        public final static String USER_IS_NOT_AUTHORIZED = "The user is not authorized.";
        public final static String USER_IS_BANNED = "The user is banned.";
        public final static String ACCESS_IS_DENIED = "Access is denied.";
    }

    public static void main(String[] args) {

    }
}
