package boletin.pkg73;

public class Metodo {
    short num1;
    
    public Metodo(){
        
    }
    
    public void setNumero(short v1){
        num1=v1;
    }
    
    public short getNumero(){
        return num1;
    }
    
    public void Resultado(){
        
        if (num1>0){
            System.out.println("+");
        }
        
        else if(num1==0){
            System.out.println("0");    
        }
        else{
        System.out.println("-");
    }
    }

}
