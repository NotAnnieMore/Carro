/**
 * A classe Carro cont�m m�todos para realizar as seguintes fun��es:
 * 
 * <ul>
 * 	<li> Specs do carro </li>
 * 	<li> Mostrar consumo do carro </li>
 * 	<li> Mostrar a Quantidade de Combustivel do carro </li>
 * 	<li> Mostrar a Capacidade de Combustivel do carro </li>
 * 	<li> Atestar Combustivel do carro </li>
 * 	<li> Verificar se tem combustivel para a distancia que se pretende andar  </li>
 * 	<li> Parar </li>
 * 	<li> Autonomia do carro </li>
 * </ul>
 * 
 * @author Ivo Camacho
 *
 */
public class Carro {
	
	static private final double consumo=5.5; // litros por 100 klm
	
	private double quantidadeCombustivel;
	private double capacidadeDeposito;
	/**
	 * 
	 * @param Carro
	 * @return mostra specs do carro
	 * 
	 */
	// Construtor por defeito 
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 
	/**
	 * 
	 * @param 
	 * @return mostra consumo do carro
	 * 
	 */
	public static double getConsumo() {
		return consumo;
	}
	/**
	 * 
	 * @param 
	 * @return mostra a Quantidade de Combustivel do carro
	 * 
	 */
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	/**
	 * 
	 * @param 
	 * @return mostra a Capacidade de Combustivel do carro
	 * 
	 */
	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// M�todos 
	/**
	 * 
	 * @param quantidade
	 * @return Atesta Combustivel do carro
	 * 
	 */
	public void meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o dep�sito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	
	// atestar o dep�sito
	/**
	 * 
	 * @param 
	 * @return Atestar Combustivel do carro
	 * 
	 */
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	
	// distancia em klm
	/**
	 * 
	 * @param distancia
	 * @return Anda com o carro
	 * 
	 */
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente n�o percorre qualquer distancia 
			// ou anda at� parar porque fica sem combust�vel 
			return false;
		}
			
			
	}
	/**
	 * 
	 * @param 
	 * @return Anda com o carro
	 * 
	 */
	public boolean parar() {
		
		// se estiver a andar p�ra 
		// falta a flag que indica se o carro est� em andamento
		return true;
	}
	/**
	 * 
	 * @param 
	 * @return Autonomia do carro
	 * 
	 */
	// kmCombustivel( )    
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
