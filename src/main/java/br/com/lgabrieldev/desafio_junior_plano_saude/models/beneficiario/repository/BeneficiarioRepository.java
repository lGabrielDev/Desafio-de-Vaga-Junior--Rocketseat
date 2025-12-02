package br.com.lgabrieldev.desafio_junior_plano_saude.models.beneficiario.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.lgabrieldev.desafio_junior_plano_saude.models.beneficiario.Beneficiario;


public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
     
}
