/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */
public class Conversiones {
    private double valor, resultado_conversion;
    private int divisa, divisa2;

    public double getResultado_conversion() {
        return resultado_conversion;
    }

    public void setResultado_conversion(double resultado_conversion) {
        this.resultado_conversion = resultado_conversion;
    }
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }

    public Conversiones() {
    }
    
    public double convertido()
    {
        if(divisa==0 && divisa2==1)//quetzales a dolares
        {
            resultado_conversion = valor*0.13;
        }
        else if(divisa==0 && divisa2==0)
        {
            resultado_conversion = valor;
        }
        else if(divisa==0 && divisa2==2)//quetzales a euros
        {
            resultado_conversion = valor*0.12;
        }
        else if(divisa==0 && divisa2==3)//quetzales a pesos
        {
            resultado_conversion = valor*2.63;
        }
        else if(divisa==1 && divisa2==0)//dolares a quetzales
        {
            resultado_conversion = valor*7.67;
        }
        else if(divisa==1 && divisa2==2)
        {
            resultado_conversion = valor*0.95;
        }
        else if(divisa==1 && divisa2==3)
        {
            resultado_conversion = valor*20.18;
        }
        else if(divisa==1 && divisa2==1)
        {
            resultado_conversion = valor;
        }
        else if(divisa==2 && divisa2==0)//euros a quetzales
        {
            resultado_conversion = valor*8.08;
        }
        else if(divisa==2 && divisa2==1)// euros a dolares
        {
            resultado_conversion = valor*1.05;
        }
        else if(divisa==2 && divisa2==3)
        {
            resultado_conversion = valor*21.26;
        }
        else if(divisa==2 && divisa2==2)
        {
            resultado_conversion = valor;
        }
        else if(divisa==3 && divisa2==0)
        {
            resultado_conversion = valor*0.38;
        }
        else if(divisa==3 && divisa2==1)
        {
            resultado_conversion = valor*0.050;
        }
        else if(divisa==3 && divisa2==2)
        {
            resultado_conversion = valor*0.047;
        }
        else if(divisa==3 && divisa2==3)
        {
            resultado_conversion = valor;
        }
        return resultado_conversion;
    }
}
