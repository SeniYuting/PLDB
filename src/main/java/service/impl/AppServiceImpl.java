package service.impl;

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
import service.AppService;
import dao.AppDao;

public class AppServiceImpl implements AppService {

	private AppDao appDao;

	public void setAppDao(AppDao appDao) {
		this.appDao = appDao;
	}

	public List<Plblacklist> getAllPlblacklists() {
		return appDao.getAllPlblacklists();
	}

	public List<Pldealrecord> getAllPldealrecords() {
		return appDao.getAllPldealrecords();
	}

	public List<Plmalfunctionrecord> getAllPlmalfunctionrecords() {
		return appDao.getAllPlmalfunctionrecords();
	}

	public List<Plparkingcar> getAllPlparkingcars() {
		return appDao.getAllPlparkingcars();
	}

	public List<Plparkingrecord> getAllPlparkingrecords() {
		return appDao.getAllPlparkingrecords();
	}

	public List<Plparkingsensor> getAllPlparkingsensors() {
		return appDao.getAllPlparkingsensors();
	}

	public List<Plparkingspace> getAllPlparkingspaces() {
		return appDao.getAllPlparkingspaces();
	}

	public List<Plreserveparkinguser> getAllPlreserveparkingusers() {
		return appDao.getAllPlreserveparkingusers();
	}

	public List<Plrunrecord> getAllPlrunrecords() {
		return appDao.getAllPlrunrecords();
	}

	public List<Plsysuser> getAllPlsysusers() {
		return appDao.getAllPlsysusers();
	}

}
