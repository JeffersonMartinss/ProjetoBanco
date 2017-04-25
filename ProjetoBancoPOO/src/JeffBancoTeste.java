
public class JeffBancoTeste {
	
public void Transferir(int valor, Object Valor1){
		
	}
	public static void main(String[] args) {

		JeffBanco banco = new JeffBanco();
		JeffBanco banco2 = new JeffBanco();
		
		banco.setnum(7630);
		banco.setnome("Santander");		
		banco2.setnum(2250);
		banco2.setnome("Banco do Brasil");

		JeffClientes cliente = new JeffClientes();
		JeffClientes cliente2 = new JeffClientes();
		
		cliente.setCPF("1546823456");
		cliente.setnome("Josefina");		
		cliente2.setCPF("5674895216");
		cliente2.setnome("Pepelidiano");

		JeffAgencia agencia = new JeffAgencia();
		JeffAgencia agencia2 = new JeffAgencia();
		
		agencia.setnum(5684);
		agencia.setnome("Eclipse");		
		agencia2.setnum(2384);
		agencia2.setnome("void main");

		JeffContas conta1 = new JeffContas();
		JeffContas conta2 = new JeffContas();
		
		conta1.setcliente(cliente);
		conta1.setagencia(agencia);
		conta1.setbanco(banco);
		conta1.setSaldo(2000.00);		
		conta2.setcliente(cliente2);
		conta2.setagencia(agencia2);
		conta2.setbanco(banco2);
		conta2.setSaldo(10050.00);
		
		banco.Adicionar(conta1);
		banco.Adicionar(conta2);
		
		conta1.Deposito(10000);
		conta1.Saque(400);
		conta2.Deposito(3100);
		conta2.Transferencia(450,conta1);
		conta1.Extrato();
		conta2.Extrato();
		
		
	}

}
