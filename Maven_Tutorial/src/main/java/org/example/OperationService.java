package org.example;

public class OperationService {
    public double process(String status, double a,double b){
        if(status == null){
            throw new OperationException("Status cannot be null");
        }
        if(status.startsWith("error")){
            throw new OperationException("Operation failed");
        }
        if(status.startsWith("success")){
            return a+b;
        }
        throw new OperationException("Invalid status type");
    }
}
