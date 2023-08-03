package com.st.examples.util;

public class OracleDBConn {

    private static OracleDBConn oracleDBConn;
    public final String message = "Hi Hello";
    static {
        if(oracleDBConn == null){
            oracleDBConn = new OracleDBConn();
        }
    }

    public static OracleDBConn getOracleDBConn(){
        return oracleDBConn;
    }
}
