package pjatk.komputer;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {
    private final ComputerRepo computerRepo;

    public ComputerService(ComputerRepo computerRepo){
        this.computerRepo = computerRepo;
    }

    public Computer getExampleComputer() {
        Component ram = new Component(null, "Kingston", "model?", 50, 100, ComponentType.RAM);
        Component procesor = new Component(null, "Kingston", "model?", 100, 150, ComponentType.CPU);
        Component graficznaKarta = new Component(null, "Kingston", "model?", 150, 180, ComponentType.GPU);
        Component zasilacz = new Component(null, "Kingston", "model?", 250, 10, ComponentType.POWER);
        Component obudowa = new Component(null, "Kingston", "model?", 350, 20, ComponentType.CASE);
        Component plytaGlowna = new Component(null, "Kingston", "model?", 70, 60, ComponentType.MOTHERBOARD);
        Component dysk = new Component(null, "Kingston", "model?", 80, 50, ComponentType.DISK);

        List<Component> listaKomponentow = List.of(ram, procesor, graficznaKarta, zasilacz, obudowa, plytaGlowna, dysk);
        //LUB  -  listaKomponentow.add(ram);

        return new Computer(1, null, "Gamingowy komputer", 20);
    }

    public Computer createComputer(String name){
        Component ram = new Component(null, "Kingston", "model?", 50, 100, ComponentType.RAM);
        Component procesor = new Component(null, "Kingston", "model?", 100, 150, ComponentType.CPU);
        Component graficznaKarta = new Component(null, "Kingston", "model?", 150, 180, ComponentType.GPU);
        Component zasilacz = new Component(null, "Kingston", "model?", 250, 10, ComponentType.POWER);
        Component obudowa = new Component(null, "Kingston", "model?", 350, 20, ComponentType.CASE);
        Component plytaGlowna = new Component(null, "Kingston", "model?", 70, 60, ComponentType.MOTHERBOARD);
        Component dysk = new Component(null, "Kingston", "model?", 80, 50, ComponentType.DISK);

        List<Component> listaKomponentow = List.of(ram, procesor, graficznaKarta, zasilacz, obudowa, plytaGlowna, dysk);

        return computerRepo.save(new Computer(null, listaKomponentow, name, 20));
    }
    public List<Computer> getAllComputers(){
        return computerRepo.findAll();
    }
    public Computer getSpecificComputer(Integer id) throws Exception {
        if(computerRepo.findById(id).isPresent()){
            return computerRepo.findById(id).get();
        }else{
            throw new Exception();
        }
    }
}
