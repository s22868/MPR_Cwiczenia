package pjatk.komputer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerRestController {
    @GetMapping("/example")
    public ResponseEntity<Computer> getExampleComputer(){
        Component ram = new Component(1, "Kingston", "model?", 50, 100, ComponentType.RAM);
		Component procesor = new Component(2, "Kingston", "model?", 100, 150, ComponentType.CPU);
		Component graficznaKarta = new Component(3, "Kingston", "model?", 150, 180, ComponentType.GPU);
		Component zasilacz = new Component(4, "Kingston", "model?", 250, 10, ComponentType.POWER);
		Component obudowa = new Component(5, "Kingston", "model?", 350, 20, ComponentType.CASE);
		Component plytaGlowna = new Component(6, "Kingston", "model?", 70, 60, ComponentType.MOTHERBOARD);
		Component dysk = new Component(7, "Kingston", "model?", 80, 50, ComponentType.DISK);

		List<Component> listaKomponentow = List.of(ram, procesor, graficznaKarta, zasilacz, obudowa, plytaGlowna, dysk);
		//LUB  -  listaKomponentow.add(ram);

		Computer komputer1 = new Computer(1, listaKomponentow, "Gamingowy komputer", 20);

		return ResponseEntity.ok(komputer1);
    }


    @GetMapping("/example2")
    public ResponseEntity<Computer> getSomeComputer(){
    	Computer komputer2 = new Computer(2,null,"name2",30);
    	return ResponseEntity.ok(komputer2);
	}
}
