package tn.esprit.spring.Controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tn.esprit.spring.Model.reclamation;
import tn.esprit.spring.Service.Panier.CommandeImpl;
import tn.esprit.spring.Service.Reclamation.ReclamationService;


@Controller(value = "ContactController")
@ELBeanName(value = "ContactController")
@Join(path = "/Contact", to = "/Contact.jsf")
public class ContactController {
	@Autowired
	ReclamationService ReclamationService;
	@Autowired
	CommandeImpl CommandeDAO;
	
	public String titre;
	public String description;
	private reclamation rec;
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public  String  addreclamation() {
		String navigateTo = "/acceuil.xhtml";
		reclamation rec= new reclamation (titre,description);
		System.out.println(rec);
		ReclamationService.save1(rec);
		return navigateTo; 
	}

	public reclamation getRec() {
		return rec;
	}

	public void setRec(reclamation rec) {
		this.rec = rec;
	}
		
	}
	
	


