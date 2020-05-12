import java.util.LinkedList;

public class CountandSay {

	public static LinkedList<Node> list;
	static class Node { 
		  
        char data; 
        int count;
  
        // Constructor 
        Node(char d) 
        { 
            data = d; 
            count=1;
        } 
    } 
	
	
	
	
	public static StringBuilder sb = new StringBuilder("");
	public static String countAndSay(int n) {
        String s="1";
       
        for(int i=0;i<n;i++){
            s = findString(s);        
        }
        System.out.println(s);
        return s;
    }
	public static String findString(String s){
		sb= new StringBuilder("");
		list= new LinkedList<Node>();;
		int count=1;
		if(s.length()==1) {
			return "11";
		}else if(s.equals("11")) {
			return "21";
		}
		else {
			
			for(int i=0;i<s.length();i++) {

				Node n = new Node(s.charAt(i));
				
				if(list.isEmpty()) {
					list.add(i,n);
				}else {
					if(list.getLast().data==s.charAt(i)) {
						list.getLast().count+=1;
					} else {
						list.addLast(n);
					}
				}
				}
			}
			for(int i=0;i<list.size();i++) {
				sb.append(list.get(i).count);
				sb.append(list.get(i).data);
				
			}
			
			
		return sb.toString();
		}
	public static void main(String args[]) {
		
		countAndSay(8);
	
	}
	
}
