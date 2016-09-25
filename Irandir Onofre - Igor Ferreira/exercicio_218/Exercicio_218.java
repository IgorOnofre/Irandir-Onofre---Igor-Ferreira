package exercicio_218;

public class Exercicio_218 {
	//caixa
	public static String caixa(){
		return "**********\n" +  
			   "*        *\n" +
			   "*        *\n" +
			   "*        *\n" +
			   "*        *\n" +
			   "*        *\n" +
			   "**********";		
	}
	
	//oval
	public static String oval(){
		return "    **** \n" +  
			   "   *    *\n" +
			   "  *      *\n" +
			   "  *      *\n" +
			   "  *      *\n" +
			   "  *      *\n" +
			   "   *    *\n" +
			   "    ***";
	}
	
	//seta
	public static String seta(){
		return "    *    \n" +
			   "   ***   \n" +
			   "  *****  \n" +
			   "    *    \n" +
			   "    *    \n" +
			   "    *    \n" +
			   "    *    \n" +
			   "    *    \n";
	}
	//losango
	public static String losango(){
		return "    *    \n" +
			   "   * *   \n" +
			   "  *   *  \n" +
			   " *     *  \n" +
			   "*       *  \n" +
			   " *     *  \n" +
			   "  *   *  \n" +
			   "   * *  \n" +
			   "    *  \n";
	}
	
	
	//Método principal
	public static void main(String[] args) {
		System.out.print(caixa());
		System.out.print("\n\n\n" + oval());
		System.out.print("\n\n\n" + seta());
		System.out.print("\n\n" + losango());
		
	}
	
}
