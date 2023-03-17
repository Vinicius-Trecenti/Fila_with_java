import javax.swing.JOptionPane;

public class fila {

    static int tamanho = 2;
    static int fila[] = new int [tamanho];
    static int cabeca = -1;
    static int cauda = -1;
    
    public static void main(String[] args) {
        // Atividade 05 - Filas
        // Implemente a classe Fila com os seguintes atributos e métodos:

        // - Atributos: int vet[], int N, int cabeca, int cauda

        //      - Métodos: void enfileirar(int), void desenfileirar(), int cabeca(), 
        //       int cauda(), boolean vazia(), boolean cheia(), int tamanho()

        // Teste sua classe e todas suas funcionalidades !

        String escolha[] = {"Enfileirar", "Desenfileirar", "CANCELAR"};
        int retorno = 0;
        

        do{
            retorno = JOptionPane.showOptionDialog(
            null, "Escolha se deseja enfileirar ou desenfileirar", 
            "Escolha", JOptionPane.DEFAULT_OPTION, 
            JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);

            if(retorno == 0){
                int num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que deseja inserir:")); 
                enfileirar(num);
                
    
            }else if(retorno == 1){
                desenfileirar();
                
            }else if(retorno == 2){
                JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO");
                if(cabeca == -1 && cauda == -1){
                    System.out.println("Fila vazia");
                }

                System.out.println("Tamanho: "+ tamanho());
                System.out.println("Cabeça: "+ cabeca());
                System.out.println("Cauda: "+ cauda());
                
            }
        }while(retorno != 2);


    }

    public static void enfileirar(int numero) {
        if(cheia() == false){

            if(cauda == -1){
                cauda = cabeca = 0;
                fila[cauda] = numero;
            }else
                if(cauda == (tamanho-1)){
                    cauda = 0;
                    fila[cauda] = numero;
                }else
                    fila[++cauda] = numero;
            
        }else
            JOptionPane.showMessageDialog(null, "Fila cheia");

        //     if(cauda+1 == 0){
        //         cabeca++;
        //     }

        //     cauda++;
        //     fila[cauda] = numero;
        // }else{
        //     System.out.println("Fila cheia");
        // }
    }

    public static void desenfileirar() {
        if(vazia() == false){

            if(cabeca == cauda)
                cabeca = cauda = -1;
            else
                if(cabeca == (tamanho-1))
                    cabeca = 0;
                else
                    cabeca++;

            // if(cauda+1 == tamanho){}
            
            // if(cabeca+1 == tamanho){
            //     cabeca = 0;
            // }
            // else{
            //     cabeca++;
            // }

            // if(cabeca == cauda){
            //     System.out.println("Fila vazia");
            //     cabeca = -1;
            //     cauda = -1;
            // }

        }else{
            JOptionPane.showMessageDialog(null, "Fila vazia");
        }
    }

    public static int cabeca() {
        return fila[cabeca];
    }

    public static int cauda() {
        return fila[cauda];
    }

    public static boolean vazia() {

        if(cabeca == -1){
            return true;
        }else{
            return false;
        }
        
    }

    public static boolean cheia() {

        //cauda+1 para não estourar o vetor
        if(cauda+1 == tamanho){
            return true;
        } else{
            return false;
        }
       
    }

    public static int tamanho() {
        if(cauda == -1 && cabeca == -1){
            return 0;
        }

        if(cauda == cabeca){
            return 1;

        }
        if(cabeca > cauda){
            return tamanho - cauda +1;
        }else if (cauda > cabeca){
            return tamanho - cauda + cabeca+1;
        } else{
            return 20;
        }
    }
}
