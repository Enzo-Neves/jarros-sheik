import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main{
public static void main(String[] args) {
    //capacidade dos jarros de shiek sendo no max 40
    Double capacidadejarro1 , capacidadejarro2 , capacidadejarro3;
    Double aguajarro1 , aguajarro2 , aguajarro3;
    Double quantidadeaguadesejada1,quantidadeaguadesejada2,quantidadeaguadesejada3; 
    Double cont = 0.0;
    String casoteste = "casoteste.txt";
    String casotesteB = "casotesteB.txt";
    String casoteste1M= "Casos1m.txt";
    String casogrande= "CasosMtgrande.txt";//casos mt grandes também não estão a funcionar corretamente;
    //aprincipio eles estouram os limites de inteiros. 
    String casotesteC = "casotesteC.txt"; //caso C não esta funcionando 
    //aprincipio não funciona quando precisa voltar de um JarroB para um jarroA 
    //motivo não tem função para.

    // TODO resolver casos que o processamento é diferente dos casos de teste e colocar para todos os casos

    try (BufferedReader br= new BufferedReader(new FileReader("casosjb\\caso1"))) {
            String line = br.readLine();
            String[] linha = line.split(" ");
            capacidadejarro1 = Double.parseDouble(linha[0]);
            capacidadejarro2 = Double.parseDouble(linha[1]);
            capacidadejarro3 = Double.parseDouble(linha[2]);
            line = br.readLine();
            linha = line.split(" ");
            aguajarro1 = Double.parseDouble(linha[0]);
            aguajarro2 = Double.parseDouble(linha[1]);
            aguajarro3 = Double.parseDouble(linha[2]);
            line = br.readLine();
            linha = line.split(" ");
            quantidadeaguadesejada1 = Double.parseDouble(linha[0]);
            quantidadeaguadesejada2 = Double.parseDouble(linha[1]);
            quantidadeaguadesejada3 = Double.parseDouble(linha[2]);
            //JA
            double[] jarro1 = new double[3];
            double[] jarro2 = new double[3];
            double[] jarro3 = new double[3];
            jarro1[0] = capacidadejarro1;
            jarro1[1] = aguajarro1;
            jarro1[2] = quantidadeaguadesejada1;
            //JB
            jarro2[0] = capacidadejarro2;
            jarro2[1] = aguajarro2;
            jarro2[2] = quantidadeaguadesejada2;
            //JC
            jarro3[0] = capacidadejarro3;
            jarro3[1] = aguajarro3;
            jarro3[2] = quantidadeaguadesejada3;
            //TODO:
            //se a quantidade que esta no vaso for menor que a desejada preencher com o que falta
            //se a quantidade colocada for maior do que a capacidade total retirar agua daquele jarro
            //se a soma de duas aguas forem menores que a capacidade do jarro e completar o que falta para 
            //a quantidade desejada, despejar agua do vazoA em vasoB 
            //so posso esvaziar o vazo ate a borda sem desperdiçar agua
            //ex: 
            // 6 10 15
            // 5 7 8
            // 0 5 15
            //==============  JB -> JC,  JA -> JB
            // 6 10 15
            // 0 5  15
            // 0 5  15
            while(true){
            if(jarro1[1] == jarro1[2])
                    break;
        
            if(jarro1[1] <= jarro2[2] && jarro2[1]+ jarro1[1] <= jarro2[0]){
                jarro2[1] += jarro1[1];
                jarro1[1] -= jarro1[1]; 
                cont += 1;
            }
            else if(jarro2[1] <= jarro3[2] && jarro3[1]+ jarro2[1] <= jarro3[0]){ 
                jarro3[1] += jarro2[1];
                jarro2[1] -= jarro2[1]; 
                cont += 1;

            }
        }
        System.out.println("Jarro1: \n" + "Quantidade total: " + jarro1[0] + "\n quanto tem no jarro: "+ jarro1[1]+ "\nQuantidade desejada: "+ jarro1[2]);
        System.out.println("\nJarro2: \n" + "Quantidade total: " + jarro2[0] + "\n quanto tem no jarro: "+ jarro2[1]+ "\nQuantidade desejada: "+ jarro2[2]);
        System.out.println("\nJarro3: \n" + "Quantidade total: " + jarro3[0] + "\n quanto tem no jarro: "+ jarro3[1]+ "\nQuantidade desejada: "+ jarro3[2]);
        System.out.print("=======\n A quantidade de movimentos realizada foi: "+cont);
    }
    catch(IOException e){
        System.out.println("Error:" + e.getMessage());
    }
}

}



