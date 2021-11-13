package pjatk.komputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerRestController {
	private ComputerService computerService;

	private ComputerRestController(ComputerService computerService){
	    this.computerService = computerService;
    }

    @GetMapping("/example")
    public ResponseEntity<Computer> getComputer() {
    	return ResponseEntity.ok(computerService.getExampleComputer());
    }
    @GetMapping("/add/{name}")
    public ResponseEntity<Computer> createComputer(@PathVariable("name") String name){
	    return ResponseEntity.ok(computerService.createComputer(name));
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Computer>> getAllComputers(){
	    return ResponseEntity.ok(computerService.getAllComputers());
    }
    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Computer> getSpecificComputer(@PathVariable("id") Integer id){
        return ResponseEntity.ok(computerService.getSpecificComputer(id));
    }
}
