package br.com.lgabrieldev.desafio_junior_plano_saude.models.beneficiario.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.lgabrieldev.desafio_junior_plano_saude.models.beneficiario.Beneficiario;
import br.com.lgabrieldev.desafio_junior_plano_saude.models.beneficiario.DTOs.BeneficiarioCreateDto;
import br.com.lgabrieldev.desafio_junior_plano_saude.models.beneficiario.DTOs.BeneficiarioFullDto;
import br.com.lgabrieldev.desafio_junior_plano_saude.models.mapper.BeneficiarioMapper;


@RestController
@RequestMapping("/beneficiario")
public class BeneficiarioController {
     

     @PostMapping("")
     public  ResponseEntity<BeneficiarioFullDto> cadastrarBeneficiario(@RequestBody BeneficiarioCreateDto beneficiarioCreateDto){

          Beneficiario beneficiario = BeneficiarioMapper.converterDTOParaBeneficiario(beneficiarioCreateDto);

          BeneficiarioFullDto beneficiarioFullDto = BeneficiarioMapper.converterBeneficiarioParaFullDTO(beneficiario);

          return ResponseEntity
               .status(HttpStatus.CREATED)
               .body(beneficiarioFullDto);
 
     }

}
