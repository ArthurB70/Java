public class Main {
  
    public static int[] alimenta_vetor(int n)
    {
        int vetor[] = new int[n];
        System.out.println("VETOR");
        for(int i=0, j=2;i<n;i++, j*=2)
        {
          vetor[i] = j;
          System.out.print(vetor[i]+"-");
        }
      System.out.println();
      return vetor;
       
    }
    
    public static boolean pesquisa_binaria(int vetor[],int esq,int dir, int n)
    {
        boolean achou = false;
        if(esq <= dir)
        {
            int meio = (esq+dir)/2;
            if(vetor[meio] == n)
            {
                achou = true;
                return achou;
            }
            if(vetor[meio] < n)
            {
                esq = meio + 1;
                achou = pesquisa_binaria(vetor,esq,dir,n);
            }
            else
            {
                dir = meio - 1; 
                achou = pesquisa_binaria(vetor,esq,dir,n);
            }
        }
      return achou;
    }
    
    public static void main(String[] args) {
      
      int n=10;
      
      int vetor[] = new int[n];
    
      vetor = alimenta_vetor(n);

      for(int i = 0; i<35; i++){
        System.out.println();
        boolean resultado = pesquisa_binaria(vetor,0,vetor.length,i);
        
        if(resultado == true)
        {
            System.out.printf("Procurado: "+i+" ACHOU"); 
        }
        else
        {
          System.out.printf("Procurado: "+i+ " NAO ACHOU"); 
        }
      }

    }
}