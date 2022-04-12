package ToolsQA;

public class Classifica {
    
    public String result(double x, double y) {
        String result = "";

        if((x == 0) && (y == 0)){
            result = ("Origem");

        }else if(x == 0){
            result = ("Eixo Y");

        }else if(y == 0){
            result = ("Eixo X");

        }else if((x > 0) && (y > 0)){
            result = ("Q1");

        }else if((x < 0) && (y > 0)){
            result = ("Q2");

        }else if((x < 0) && (y < 0)){
            result = ("Q3");
            
        }else if((x > 0) && (y < 0)){
            result = ("Q4");
        }    
        
        return result;
    }
}