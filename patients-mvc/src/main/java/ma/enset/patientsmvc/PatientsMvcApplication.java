package ma.enset.patientsmvc;

import ma.enset.patientsmvc.entities.Patient;
import ma.enset.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);

    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(
                    new Patient(0,"Hassan",new Date(),false,12));
            patientRepository.save(
                    new Patient(0,"hanane",new Date(),true,15));
            patientRepository.save(
                    new Patient(0,"yassine",new Date(),false,18));
            patientRepository.save(
                    new Patient(0,"hanae",new Date(),true,12));
            patientRepository.findAll().forEach(p->{
             System.out.println(p.getNom());            });
        };
    }

}

