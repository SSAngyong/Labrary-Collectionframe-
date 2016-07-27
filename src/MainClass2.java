
import java.util.*;
public class MainClass2 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("박봉팔");
		list.add("하륜");
		list.add("이방원");
		list.add("어떻게");	
		list.add(1,"A");	
		
		list.add(1,"정도전");
		list.add(3,"이성계");
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size() ; i++){
			String name=list.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("----------3번삭제----------");
		list.remove(3);
		System.out.println(list.size());
		for(int i=0; i<list.size() ; i++){
			String name=list.get(i);
			System.out.println(name);
		}
		
System.out.println();
		
		System.out.println("----------2번수정----------");
		list.set(2, "이연");
		System.out.println(list.size());
		for(int i=0; i<list.size() ; i++){
			String name=list.get(i);
			System.out.println(name);
		}
		
System.out.println();
		
		System.out.println("----------클리어----------");
		list.clear();
		System.out.println(list.size());
		for(int i=0; i<list.size() ; i++){
			String name=list.get(i);
			System.out.println(name);
		}
	}

}
