import java.util.Map;
import java.util.TreeMap;

public class AddProdutos {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();

		map.put(1, "Sabonete");
		map.put(2, "Leite");
		map.put(3, "Vela");
		map.put(4, "Cebola");
		map.put(5, "Café");
		map.put(6, "Suco de laranja");
		map.put(7, "Detergente");
		map.put(8, "Biscoito");
		map.put(9, "Sal");
		map.put(10, "Feijão");
		map.put(11, "Arroz");
		map.put(12, "Iogurte");
		map.put(13, "Maçã");
		map.put(14, "Lanterna");
		map.put(15, "Carne de boi");
		map.put(16, "Azeite");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
	}

}
