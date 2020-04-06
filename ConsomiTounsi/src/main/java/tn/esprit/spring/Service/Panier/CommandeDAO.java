package tn.esprit.spring.Service.Panier;



import java.beans.Transient;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Model.Commande;
import tn.esprit.spring.Model.LigneCommande;
import tn.esprit.spring.Model.lignecommandeproduit;
import tn.esprit.spring.Repository.CommandeRepository;
@Service
public class CommandeDAO {
	@Autowired
	CommandeRepository commandeRepository;
	public Commande save (Commande c)
	{
	ZoneId zid = ZoneId.of("Africa/Tunis");
		c.setDate(LocalDate.now(zid));
		return commandeRepository.save(c);
	}
	
    
	public List<Commande> CommandeparType(String type) {
		return commandeRepository.CommandeparType(type);

	}
	public List<Commande> CommandeparClient(int id) {
		return commandeRepository.CommandeparClient(id);

	}
	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}
	public void Delete(Commande c) {
		commandeRepository.delete(c);
	}

	public Commande findOne(Long id) {
		return commandeRepository.getOne(id);
	}
	public List< Commande> Commandeparcode( long code) {
		return commandeRepository.Commandeparcode(code);

	}
	public void PayerEnLigne(int idCommande)
	{
		commandeRepository.PayerEnLigne(idCommande);
	}
	public void PayerPorteaPorte(int idCommande)
	{
		commandeRepository.PayerPorteaPorte(idCommande);
	}
	

}
