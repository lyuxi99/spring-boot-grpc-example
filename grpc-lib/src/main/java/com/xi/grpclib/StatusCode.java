package com.xi.grpclib;

/**
 * The status codes for the `statusCode` field in rpc responses
 */
public class StatusCode {
    public static long OK = 0;
    public static long CANCELLED = 1;
    public static long UNKNOWN = 2;
    public static long INVALID_ARGUMENT = 3;
    public static long DEADLINE_EXCEEDED = 4;
    public static long NOT_FOUND = 5;
    public static long ALREADY_EXISTS = 6;
    public static long PERMISSION_DENIED = 7;
    public static long RESOURCE_EXHAUSTED = 8;
    public static long FAILED_PRECONDITION = 9;
    public static long ABORTED = 10;
    public static long OUT_OF_RANGE = 11;
    public static long UNIMPLEMENTED = 12;
    public static long INTERNAL = 13;
    public static long UNAVAILABLE = 14;
    public static long DATA_LOSS = 15;
    public static long UNAUTHENTICATED = 16;
}
