package dao.impl;

import java.util.List;

import model.Plblacklist;
import model.Pldealrecord;
import model.Plmalfunctionrecord;
import model.Plparkingcar;
import model.Plparkingrecord;
import model.Plparkingsensor;
import model.Plparkingspace;
import model.Plreserveparkinguser;
import model.Plrunrecord;
import model.Plsysuser;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.AppDao;

public class AppDaoImpl extends HibernateDaoSupport implements AppDao {

	public List<Plblacklist> getAllPlblacklists() {
		@SuppressWarnings("unchecked")
		List<Plblacklist> plblacklists = (List<Plblacklist>) getHibernateTemplate()
				.find("from Plblacklist");
		return plblacklists;
	}

	public List<Pldealrecord> getAllPldealrecords() {
		@SuppressWarnings("unchecked")
		List<Pldealrecord> pldealrecords = (List<Pldealrecord>) getHibernateTemplate()
				.find("from Pldealrecord");
		return pldealrecords;
	}

	public List<Plmalfunctionrecord> getAllPlmalfunctionrecords() {
		@SuppressWarnings("unchecked")
		List<Plmalfunctionrecord> plmalfunctionrecords = (List<Plmalfunctionrecord>) getHibernateTemplate()
				.find("from Plmalfunctionrecord");
		return plmalfunctionrecords;
	}

	public List<Plparkingcar> getAllPlparkingcars() {
		@SuppressWarnings("unchecked")
		List<Plparkingcar> plparkingcars = (List<Plparkingcar>) getHibernateTemplate()
				.find("from Plparkingcar");
		return plparkingcars;
	}

	public List<Plparkingrecord> getAllPlparkingrecords() {
		@SuppressWarnings("unchecked")
		List<Plparkingrecord> plparkingrecords = (List<Plparkingrecord>) getHibernateTemplate()
				.find("from Plparkingrecord");
		return plparkingrecords;
	}

	public List<Plparkingsensor> getAllPlparkingsensors() {
		@SuppressWarnings("unchecked")
		List<Plparkingsensor> plparkingsensors = (List<Plparkingsensor>) getHibernateTemplate()
				.find("from Plparkingsensor");
		return plparkingsensors;
	}

	public List<Plparkingspace> getAllPlparkingspaces() {
		@SuppressWarnings("unchecked")
		List<Plparkingspace> plparkingspaces = (List<Plparkingspace>) getHibernateTemplate()
				.find("from Plparkingspace");
		return plparkingspaces;
	}

	public List<Plreserveparkinguser> getAllPlreserveparkingusers() {
		@SuppressWarnings("unchecked")
		List<Plreserveparkinguser> plreserveparkingusers = (List<Plreserveparkinguser>) getHibernateTemplate()
				.find("from Plreserveparkinguser");
		return plreserveparkingusers;
	}

	public List<Plrunrecord> getAllPlrunrecords() {
		@SuppressWarnings("unchecked")
		List<Plrunrecord> plrunrecords = (List<Plrunrecord>) getHibernateTemplate()
				.find("from Plrunrecord");
		return plrunrecords;
	}

	public List<Plsysuser> getAllPlsysusers() {
		@SuppressWarnings("unchecked")
		List<Plsysuser> plsysusers = (List<Plsysuser>) getHibernateTemplate()
				.find("from Plsysuser");
		return plsysusers;
	}

}
