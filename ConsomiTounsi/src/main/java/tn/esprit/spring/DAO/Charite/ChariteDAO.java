package tn.esprit.spring.DAO.Charite;

import java.util.List;

import tn.esprit.spring.Model.Charite.Charite;

public interface ChariteDAO {
	boolean saveCharit(Charite Charite);
	List<Charite> getAllChariteList();
	Charite saveCharite(Charite Charite);

	
}
