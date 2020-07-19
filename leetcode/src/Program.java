public class Program {
	//used for testing purposes
	/*static Server a = new Server("a",1);
	static Server b = new Server("b",1);
	static Server c = new Server("c",1);
	static Server d = new Server("d",1);
	static Server[] list = new Server[] {a,b,c,d};*/

	public static void main(String[]args) {
		//used for testing purposes
		/*for(int i= 0; i<100; ++i) {
			System.out.println(distribution(list));
		}
		counter();*/
	}

	public static String distribution(Server[] s) {
		double total = 0;
		for(int i = 0; i<s.length; i++) {
			total += s[i].size;
		}

		int random = (int)((Math.random() * 100)+1);

		int perc = 0;
		for(int j = 0; j<s.length; j++) {			
			perc += (int)(((s[j].size)/total) * 100.0);
			
			if(random <= perc){
				return s[j].name;
			}
		}
		return "No server name found";
	}

	//used for testing purposes
	/*	public static int[] counter(){
		int[] array = new int[4];
		for(int i= 0; i<100; ++i) {
			String returned = distribution(list);
			if(returned.equals("a")) {
				array[0]+=1;
			}
			if(returned.equals("b")) {
				array[1]+=1;
			}if(returned.equals("c")) {
				array[2]+=1;
			}if(returned.equals("d")) {
				array[3]+=1;
			}
		}
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}*/
}
