
public class JeffContas {
	JeffClientes cliente;
	JeffAgencia agencia;
	JeffBanco banco;
	double Saldo;

	public JeffClientes getcliente() 
	{
		return cliente;
	}

	public void setcliente(JeffClientes cliente) 
	{
		this.cliente = cliente;
	}

	public JeffAgencia getagencia() 
	{
		return agencia;
	}

	public void setagencia(JeffAgencia agencia) 
	{
		this.agencia = agencia;
	}

	public JeffBanco getbanco() 
	{
		return banco;
	}

	public void setbanco(JeffBanco banco) 
	{
		this.banco = banco;
	}

	public double getSaldo() 
	{
		return Saldo;
	}

	public void setSaldo(double saldo) 
	{
		Saldo = saldo;
	}

	public int Saque(int x) 
	{
		Saldo -= x;
		return x;
	}

	public int Deposito(int x)
	{
		Saldo += x;
		return x;
	}

	public void Transferencia(int x1, JeffContas x2)
	{
		Saldo -= x1;
		x2.Deposito(x1);
		
	}
	public void Extrato()
	{
		System.out.println("Cliente: "+((this.cliente).nome));
		System.out.println("Agencia: "+((this.agencia).num));
		System.out.println("Banco: "+((this.banco).num));
		System.out.println("Saldo: "+Saldo);
		System.out.println("");
		
	}

}
