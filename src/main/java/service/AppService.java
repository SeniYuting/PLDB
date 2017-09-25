package service;

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

public interface AppService {

	public List<Plblacklist> getAllPlblacklists();

	public List<Pldealrecord> getAllPldealrecords();

	public List<Plmalfunctionrecord> getAllPlmalfunctionrecords();

	public List<Plparkingcar> getAllPlparkingcars();

	public List<Plparkingrecord> getAllPlparkingrecords();
	
	public List<Plparkingsensor> getAllPlparkingsensors();
	
	public List<Plparkingspace> getAllPlparkingspaces();
	
	public List<Plreserveparkinguser> getAllPlreserveparkingusers();
	
	public List<Plrunrecord> getAllPlrunrecords();
	
	public List<Plsysuser> getAllPlsysusers();

}
