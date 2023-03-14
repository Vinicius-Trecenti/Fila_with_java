public class fila {

    int tamanho = 2;
    int fila[] = new int [tamanho];
    int cabeca = -1;
    int cauda = -1;
    
    public static void main(String[] args) {
        // Atividade 05 - Filas
        // Implemente a classe Fila com os seguintes atributos e métodos:

        // - Atributos: int vet[], int N, int cabeca, int cauda

        //      - Métodos: void enfileirar(int), void desenfileirar(), int cabeca(), 
        //       int cauda(), boolean vazia(), boolean cheia(), int tamanho()

        // Teste sua classe e todas suas funcionalidades !
    }

    public void enfileirar(int numero) {
        if(cheia() == false){

            if(cauda+1 == 0){cabeca++;}

            cauda++;
            fila[cauda] = numero;
        }else{
            System.out.println("Fila cheia");
        }
    }

    public void desenfileirar() {
        if(vazia() == false){
            

            if(cauda+1 == tamanho){cauda = 0;}
            
            if(cabeca+1 == tamanho){
                cabeca = 0;
            }
            else{
                cabeca++;
            }

            if(cabeca == cauda){
                System.out.println("Pilha vazia");
                cabeca = -1;
                cauda = -1;
            }

        }else{
            System.out.println("Fila vazia");
        }
    }

    public int cabeca() {
        return fila[cabeca];
    }

    public int cauda() {
        return fila[cauda];
    }

    public boolean vazia() {

        if(cabeca == -1){
            return true;
        }else{
            return false;
        }
        
    }

    public boolean cheia() {

        //cauda+1 para não estourar o vetor
        if(cauda+1 == tamanho){
            return true;
        } else{
            return false;
        }
       
    }

    public int tamanho() {

        if(cauda == cabeca){
            return 1;

        }else if(cauda > cabeca){
            return tamanho - cabeca + cauda+1;
        }

        return 0;
    }
}
