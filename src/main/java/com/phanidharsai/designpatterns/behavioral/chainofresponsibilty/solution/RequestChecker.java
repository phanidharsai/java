package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.solution;

public interface RequestChecker {
     void nextStep(RequestHandler requestHAndler,String request);
}
