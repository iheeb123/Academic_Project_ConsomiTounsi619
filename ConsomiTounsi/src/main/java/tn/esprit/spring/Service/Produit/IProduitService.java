package tn.esprit.spring.Service.Produit;

import java.io.IOException;
import java.util.List;

import org.primefaces.model.file.UploadedFiles;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import tn.esprit.spring.Model.Produit.Produit;

public interface IProduitService {
	public Produit findOne(Long id);
	public List<Produit> findAll();
	public void Delete(Long id);
	public Produit Update(Long idproduit,Long idSsCategorie,String ProduitJson,List<MultipartFile> file) throws JsonMappingException, JsonProcessingException, IOException;
	public Produit Add(String ProduitJson,Long idSsCategorie,List<MultipartFile> file) throws JsonMappingException, JsonProcessingException, IOException;
	public List<Produit> findLikeName(String name);
	public List<Produit> findProduitSsCategorie(Long idSsCategorie);
	public List<Produit> findProduitSCategorie(Long idSCategorie);
	public List<Produit> findProduitCategorie(Long idCategorie);
	public void addProduitWithImage(Produit p, UploadedFiles files);
	public Long UpdateProduit(Produit produit);
	public List<Produit> findProduitByBarcode(String barcode);
	public List<Produit> MostPopularProductsOfMonth();
	public int QuantiteProduitdeMoisVendu(Long idProduit);
	public List<Produit> MostPopularCategorieProducts(Long idCategorie);
	public List<Produit> findProduitCategorieAndName(Long idCategorie,String Name);
	public List<Produit> findProduitSsCategorieAndName(Long idSsCategorie,String Name);
	public List<Produit> findProduitSCategorieAndName(Long idSCategorie,String Name);
}
