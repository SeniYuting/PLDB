package action;

import java.util.ArrayList;
import java.util.List;

import model.Plparkingcar;
import service.AppService;

public class GetPlparkingcar extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plparkingcar");

		String[] tables = { "Tid", "CarLicence", "CarType", "CarColor",
				"ITime", "Code", "PickCount", "Identity" };
		request().setAttribute("tables", tables);

		List<Plparkingcar> plparkingcars = appService.getAllPlparkingcars();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plparkingcars.size(); i++) {
			Plparkingcar plparkingcar = plparkingcars.get(i);
			String[] list = { plparkingcar.getTid() + "",
					plparkingcar.getCarlicence(), plparkingcar.getCartype(),
					plparkingcar.getCarcolor(),
					plparkingcar.getItime().toString(), plparkingcar.getCode(),
					plparkingcar.getPickcount() + "",
					plparkingcar.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
