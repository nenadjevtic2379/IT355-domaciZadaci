/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.it355.hibernate.DAO.HibernateDAO;
import com.it355.hibernate.entity.Proizvodi;
import com.it355.hibernate.entity.ProizvodiTip;
import com.it355.model.Proizvod;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Korisnik
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/CaoSvete-servlet.xml"})
public class CrudTestJUnit {

    @Autowired
    private HibernateDAO hibDao;


    public CrudTestJUnit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addCategoryTest() {
        ProizvodiTip cat = new ProizvodiTip();
        cat.setNaziv("Nova kategorija");
        ProizvodiTip newCat = hibDao.addTip(cat);
        hibDao.deleteCategory(newCat);
        Assert.assertNotNull(newCat);
    }

    @Test
    public void getCategoryByIdTest() {
        ProizvodiTip cat = new ProizvodiTip();
        cat.setNaziv("Nova kategorija");
        ProizvodiTip newCat = hibDao.addTip(cat);
        ProizvodiTip get
                = hibDao.getCategoryById(newCat.getId());
        hibDao.deleteCategory(newCat);
        Assert.assertNotNull(get);
    }

    @Test
    public void createProductTest() {
        Proizvodi pro = new Proizvodi();
        pro.setVrsta("vrsta");
        pro.setCena(100);
        pro.setProizvodnja(2016);
        pro.setZaauto("audi");
        Proizvodi newPro = hibDao.dodajProizvod(pro);
        hibDao.obrisiProizvod(newPro);
        Assert.assertNotNull(newPro);
    }

    @Test
    public void getProductByIdTest() {
        Proizvodi pro = new Proizvodi();
        pro.setVrsta("vrsta");
        pro.setCena(2000);
        
        Proizvodi newPro = hibDao.dodajProizvod(pro);
        Proizvodi get
                = hibDao.getProizvodById(newPro.getId_proizvod());
        hibDao.obrisiProizvod(newPro);
        Assert.assertNotNull(get);
    }

    @Test
    public void deleteProductTest() {
        Proizvodi pro = new Proizvodi();
        pro.setVrsta("vrsta");
        pro.setCena(2000);
        
        Proizvodi newPro = hibDao.dodajProizvod(pro);
        hibDao.obrisiProizvod(newPro);
        Proizvodi deletedProduct
                = hibDao.getProizvodById(newPro.getId_proizvod());
        Assert.assertNull(deletedProduct);
    }

}
