package action;

import java.util.ArrayList;
import java.util.List;

import model.Plparkingrecord;
import service.AppService;

public class GetPlparkingrecord extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plparkingrecord");

		String[] tables = { "Id", "CarLicense", "CarType", "CarColor",
				"ITime", "OTime", "Code", "Cost", "Payway", "Identity" };
		request().setAttribute("tables", tables);

		List<Plparkingrecord> plparkingrecords = appService
				.getAllPlparkingrecords();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plparkingrecords.size(); i++) {
			Plparkingrecord plparkingrecord = plparkingrecords.get(i);
			String[] list = { plparkingrecord.getId() + "",
					plparkingrecord.getCarlicense(),
					plparkingrecord.getCartype(),
					plparkingrecord.getCarcolor(),
					plparkingrecord.getItime().toString(),
					plparkingrecord.getOtime().toString(),
					plparkingrecord.getCode(), plparkingrecord.getCost() + "",
					plparkingrecord.getPayway(),
					plparkingrecord.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
