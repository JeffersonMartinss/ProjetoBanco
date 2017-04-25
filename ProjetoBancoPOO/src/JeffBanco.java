import java.util.ArrayList;

public class JeffBanco {
	
	int num;
	String nome;
	
	ArrayList<Object> conta = new ArrayList<Object>();
	
	public Object Adicionar(Object x)
	{
		conta.add(x);
		return x;
	}
	public int getnum() 
	{
		return num;
	}

	public void setnum(int n)
	{
		num = n;
	}

	public String getnome() 
	{
		return nome;
	}

	public void setnome(String n)
	{
		nome = n;
	}

}
