package br.com.thiago.spring_example;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExampleApplication implements CommandLineRunner {

	
	private final ClientRepository clientRepository;

	public SpringExampleApplication(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clientRepository.save(new Client("Malu", 7));
		var client1 = clientRepository.findById(1L);
		var client2 = clientRepository.findById(2L);

		
		if (client1.isPresent()) {
			System.out.println("Cliente 1: " + client1.get());
		}
		
		if (!client2.isPresent()) {
			System.out.println("Cliente 2 não encontrado");
		}

		client1.get().setName("Maria Luiza");
		clientRepository.save(client1.get());

		clientRepository.delete(client1.get());
	}

}
