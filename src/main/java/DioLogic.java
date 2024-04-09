import java.util.*;

public class DioLogic {
    public static void main(String[] args) {

    /*Simular um lancamento de dados. Lancar o dado 100 vezes e armazenar.
      Depois, mostrar quantas vezes cada valor foi inserido.*/

        List<Integer> numbers = new ArrayList<>();
        Random geradorRandom = new Random();
        for(int i = 0 ; i<100; i++){
            numbers.add(geradorRandom.nextInt(5) + 1);
        }
        System.out.println(numbers);
        Map<Integer, Integer> entradas = new HashMap<>();
        for(Integer result : numbers){
            if(entradas.containsKey(result)){
                entradas.put(result, (entradas.get(result) + 1));
            } else{
                entradas.put(result, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : entradas.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }
    }
}
