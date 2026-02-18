package ie.atu.efsem2lab3.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
public int add(int a, int b){
    return a+b;
}
public int divide(int a, int b){
    return a/b;

}
}
