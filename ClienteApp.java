package udemy;

public class ClienteApp {
	
	public static void main(String[] args) {
		
		ClientePF clientepf = new ClientePF("Joaozinho","Jardim America","432.213.455-43");
		ClientePF clientepf1 = new ClientePF("Daiane","Jardim Alvorada","123.432.567-89");
		ClientePF clientepf2 = new ClientePF("Rafaela","Jardim Santa Rosa","987.456.321-01");
		
		System.out.println("Cliente Fisico é " + clientepf.getNome() + "| Endereço " 
		+ clientepf.getEndereco() + "| CPF " + clientepf.getCpf());
		
		System.out.println("Cliente Fisico é " + clientepf1.getNome() + "| Endereço "
		+ clientepf1.getEndereco() + "| CPF " + clientepf1.getCpf());
		
		System.out.println("Cliente Fisico é " + clientepf2.getNome() + "| Endereço "
		+ clientepf2.getEndereco() + "| CPF " + clientepf2.getCpf());
		
		System.out.println("");
		
		ClientePJ clientepj = new ClientePJ("Antonio","Jardim Primavera","44.789.468/0001-82");
		ClientePJ clientepj1 = new ClientePJ("Barata","Jardim Maria Luiza 1","23.763.508/0001-47");
		ClientePJ clientepj2 = new ClientePJ("Cristina","Jardim Campo Belo","12.044.401/0001-22");
		
		System.out.println("Clinte Juridico é " + clientepj.getNome() + "| Endereço " 
		+ clientepj.getEndereco() + "| CNPJ " + clientepj.getCnpj());
		
		System.out.println("Clinte Juridico é " + clientepj1.getNome() + "| Endereço " 
		+ clientepj1.getEndereco() + "| CNPJ " + clientepj1.getCnpj());
		
		System.out.println("Clinte Juridico é " + clientepj2.getNome() + "| Endereço " 
		+ clientepj2.getEndereco() + "| CNPJ " + clientepj2.getCnpj());
		
	}

}
