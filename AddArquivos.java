import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AddArquivos {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s;
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		s = new Scanner(new File("c:\\teste/Cat01.txt"));
        while (s.hasNextLine()){
            map.put(1, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }

        s = new Scanner(new File("c:\\teste/Cat02.txt"));
        while (s.hasNextLine()){
            map.put(2, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
        s = new Scanner(new File("c:\\teste/Cat03.txt"));
        while (s.hasNextLine()){
            map.put(3, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
        s = new Scanner(new File("c:\\teste/Cat04.txt"));
        while (s.hasNextLine()){
            map.put(4, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
        s = new Scanner(new File("c:\\teste/Cat05.txt"));
        while (s.hasNextLine()){
            map.put(5, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
        s = new Scanner(new File("c:\\teste/Cat06.txt"));
        while (s.hasNextLine()){
            map.put(6, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
        s = new Scanner(new File("c:\\teste/Cat07.txt"));
        while (s.hasNextLine()){
            map.put(7, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
        s = new Scanner(new File("c:\\teste/Cat08.txt"));
        while (s.hasNextLine()){
            map.put(8, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
        s = new Scanner(new File("c:\\teste/Cat09.txt"));
        while (s.hasNextLine()){
            map.put(9, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
        s = new Scanner(new File("c:\\teste/Cat10.txt"));
        while (s.hasNextLine()){
            map.put(10, s.nextLine());
            
            for(Map.Entry m:map.entrySet()) {
    			System.out.println(m.getKey()+"  "+m.getValue());
    		}
        }
        
	}

}

