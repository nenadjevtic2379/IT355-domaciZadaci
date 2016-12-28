/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernate.impl;

import com.it355.hibernate.DAO.HibernateDAO;
import com.it355.hibernate.entity.Forum;
import com.it355.hibernate.entity.Kontakt;
import com.it355.hibernate.entity.Odgovori;
import com.it355.hibernate.entity.Proizvodi;
import com.it355.hibernate.entity.ProizvodiTip;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository("hibernateDAO")
@Service
public class HibernateDAOImpl implements HibernateDAO {

    @SuppressWarnings("unused")
    private final Log logger = LogFactory.getLog(getClass());

    //Instanciramo sesiju
    @Autowired
    private SessionFactory sessionFactory;

    //kreiramo seter za sesiju
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //kreiramo geter za sesiju
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    @Override
    //potrebno je da sve metode koje pozivaju sesiju i rade nešto nad bazom imaju anotaciju @Transactional
    //to hibernate-u stavlja do znanja da treba da 'gleda' te metode i da one kreiraju transakciju neke vrste
    @Transactional
    public List<ProizvodiTip> getCategories() {
        List<ProizvodiTip> results = (List<ProizvodiTip>) getSession().createCriteria(ProizvodiTip.class).list();
        return results;
    }
    
    @Override
    @Transactional
    public ProizvodiTip getCategoryById(int id) {
        ProizvodiTip category = (ProizvodiTip) getSession().createCriteria(ProizvodiTip.class).add(Restrictions.eq("id", id))
                .uniqueResult();
        return category;
    }

    @Override
    @Transactional
    public void deleteCategory(ProizvodiTip category) {
        getSession().delete(category);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Proizvodi> getProizvodi() {
        
        List<Proizvodi> lista = (List<Proizvodi>) getSession().createCriteria(Proizvodi.class).list();
        return lista;
    }

    @Override
    @Transactional
    public Proizvodi getProizvodById(int id) {
        Proizvodi p = (Proizvodi) getSession().createCriteria(Proizvodi.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        
        return p;
    }
    
    @Override
    @Transactional
    public void obrisiProizvod(Proizvodi category) {
        getSession().delete(category);
    }

    @Override
    @Transactional
    public Proizvodi dodajProizvod(Proizvodi p) {
        return (Proizvodi)getSession().merge(p);
    }
    
    @Override
    @Transactional
    public void editProizvod(Proizvodi proizvodi) {
        getSession().saveOrUpdate(proizvodi);
    }

    @Override
    @Transactional
    public Kontakt dodajKontakt(Kontakt k) {
          return (Kontakt)getSession().merge(k);
    }

    @Override
    @Transactional
    public Forum dodajKomentar(Forum f) {
        return (Forum) getSession().merge(f);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Forum> getKomentari() {
        List<Forum> komentari = (List<Forum>) getSession().createCriteria(Forum.class).list();
        
        return komentari;
    }

    @Override
    @Transactional
    public Forum getKomentarById(Integer id) {
      
            Forum f = (Forum) getSession().createCriteria(Forum.class).add(Restrictions.eq("id", id)).uniqueResult();
        
        return f;
    }

    @Override
    @Transactional
    public void odgovoriNaKomentar(Forum forum) {
        getSession().saveOrUpdate(forum);
    }

    
    @Override
    @Transactional
    public Odgovori addOdgovor(Odgovori o) {
        
       
         return (Odgovori) getSession().merge(o);
    }

    @Override
    @Transactional
    public List<Odgovori> getOdgovori() {
        
        
        List<Odgovori> odgovori = (List<Odgovori>) getSession().createCriteria(Odgovori.class).list();
        
        return odgovori;
    }
    
}