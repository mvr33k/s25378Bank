package org.example.s25378Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S25378BankApplication {
	private final TransakcjaService transakcjaService;
	private final KlientStorage klientStorage;

	public S25378BankApplication(TransakcjaService transakcjaService, KlientStorage klientStorage){
		this.transakcjaService=transakcjaService;
		this.klientStorage=klientStorage;

		execProcess();
	}
	public static void main(String[] args) {
		SpringApplication.run(S25378BankApplication.class, args);
	}

	public void execProcess(){
		Klient klient=new Klient(1200.00); 	// rejestracja nowego klienta;
		klientStorage.add(klient);					// oraz dodanie go do bazy klientów
		Klient klient2=new Klient(1200.00);
		Klient klient3=new Klient(12.00);
		System.out.println(klient3.getId());
		System.out.println(klient2.getId());
		System.out.println(klient.getId());
		transakcjaService.zlecPrzelew(2,200.00);
	}
}
