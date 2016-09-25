package exercicio_2;

public class Fatorial {
	
	public int fatorial(int a){
		if(a<= 1){
			return 1;
		}else{
			return a*fatorial(a-1);
		}
	}
	
	public static void main(String[] args) {
		Fatorial x = new Fatorial();
		System.out.println(x.fatorial(6));
		
	}
}
