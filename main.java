import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main{
public static void main(String[] args) {
    //capacidade dos jarros de shiek sendo no max 40
    int capacidadejarro1 , capacidadejarro2 , capacidadejarro3;
    int aguajarro1 , aguajarro2 , aguajarro3;
    int quantidadeaguadesejada1,quantidadeaguadesejada2,quantidadeaguadesejada3; 
    
    String casoteste = "casoteste.txt";

    try (BufferedReader br= new BufferedReader(new FileReader(casoteste))) {
        String line = br.readLine();
            String[] linha = line.split(" ");
            capacidadejarro1 = Integer.parseInt(linha[0]);
            capacidadejarro2 = Integer.parseInt(linha[1]);
            capacidadejarro3 = Integer.parseInt(linha[2]);
            System.out.println("linha1: "+line);
            line = br.readLine();
            System.out.println("linha2: "+line);
            linha = line.split(" ");
            aguajarro1 = Integer.parseInt(linha[0]);
            aguajarro2 = Integer.parseInt(linha[1]);
            aguajarro3 = Integer.parseInt(linha[2]);
            line = br.readLine();
            System.out.println("linha3: "+line);
            linha = line.split(" ");
            quantidadeaguadesejada1 = Integer.parseInt(linha[0]);
            quantidadeaguadesejada2 = Integer.parseInt(linha[1]);
            quantidadeaguadesejada3 = Integer.parseInt(linha[2]);

            //TODO:
            //se a quantidade que esta no vaso for menor que a desejada preencher com o que falta
            //se a quantidade colocada for maior do que a capacidade total retirar agua daquele jarro
            //se a soma de duas aguas forem menores que a capacidade do jarro e completar o que falta para 
            //a quantidade desejada, despejar agua do vazoA em vasoB 
            //so posso esvaziar o vazo ate a borda sem desperdiçar agua
            if(aguajarro1 < quantidadeaguadesejada2 && aguajarro1+ aguajarro2 < capacidadejarro2){
                aguajarro2 += aguajarro1; 
            }

    }
    catch(IOException e){
        System.out.println("Error:" + e.getMessage());
    }
}

}



