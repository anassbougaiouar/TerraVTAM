package com.example.terramodusvtam.repositories.devisSte;
import com.example.terramodusvtam.entities.devisSte.DevisSteDigital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisSteDigitalRepository extends JpaRepository<DevisSteDigital,Long> {

}
