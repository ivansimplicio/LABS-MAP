package principal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import adapter.ListMapAdapter;
import adapter.MapListAdapter;

public class Main {
	
	public static void main(String[] args) {
		
		Map<Object, String> mapAdapter = new ListMapAdapter<String>();
		Map<Object, String> mapAdapter2 = new ListMapAdapter<String>();
		mapAdapter.put(001, "Maria");
		mapAdapter2.put(001, "Maria");
		
		System.out.println("Utilizando Map com o adapter: "+mapAdapter.getClass().getName());
		System.out.println("\nMaps iguais? "+mapAdapter.equals(mapAdapter2));
		System.out.println("Nome adicionado: "+mapAdapter.put(002, "Ivan"));
		System.out.println("Contém o nome Ivan? "+mapAdapter.containsValue("Ivan"));
		System.out.println("Tamanho do Map: "+mapAdapter.size());
		System.out.println("Valores contidos: "+mapAdapter.values());
		mapAdapter.clear();
		System.out.println("Map vazia? "+mapAdapter.isEmpty());
		
		List<String> listAdapter = new MapListAdapter<String>();
		List<String> listAdapter2 = new MapListAdapter<String>();
		listAdapter.add("Maria");
		listAdapter.add("José");
		listAdapter2.add("Maria");
		listAdapter2.add("José");
		
		System.out.println("\n\nUtilizando List com o adapter: "+listAdapter.getClass().getName());
		System.out.println("\nListas iguais? "+listAdapter.equals(listAdapter));
		System.out.println("Ivan adicionado? "+listAdapter.add("Ivan"));
		System.out.println("Contém o nome Maria? "+listAdapter.contains("Maria"));
		System.out.println("Tamanho da List: "+listAdapter.size());
		System.out.println("José removido? "+listAdapter.remove("José"));
		System.out.println("toArray: "+Arrays.toString(listAdapter.toArray()));
		
		Iterator<String> it = listAdapter.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator::Nome: "+it.next());
		}
		listAdapter.clear();
		System.out.println("Lista vazia? "+listAdapter.isEmpty());		
	}
}