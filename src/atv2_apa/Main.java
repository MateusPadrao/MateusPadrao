package atv2_apa;

//MATEUS ROSA PADRÃO - 161151177SS

public class Main {

    public static void selection_sort(int[] num, int tam) {
              int i, j, min, aux;
/*T1*/        for (i = 0; i < (tam-1); i++) {
/*T2*/            min = i;
/*T3*/            for (j = (i+1); j < tam; j++) {
/*T4*/                if(num[j] < num[min])
/*T5*/                    min = j;
                   }
/*T6*/             if (i != min) {
/*T7*/                  aux = num[i];
/*T8*/                  num[i] = num[min];
/*T9*/                  num[min] = aux;
                   }
                }
    }

    public static void main(String[] args) {
	    int[] vet = new int[10];
	    int size = 10;

	    for (int i = 0; i < size; i ++) {
	        vet[i] = size - i;
            System.out.println(vet[i]);
        }

        System.out.println("\n");

	    selection_sort(vet, size);

        for (int i = 0; i < size; i ++) {
            System.out.println(vet[i]);
        }
    }
}