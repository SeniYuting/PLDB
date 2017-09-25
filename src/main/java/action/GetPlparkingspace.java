package action;

import java.util.ArrayList;
import java.util.List;

import model.Plparkingspace;
import service.AppService;

public class GetPlparkingspace extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plparkingspace");

		String[] tables = { "PSpaceId", "ResStatus", "CarType", "Ps_sid",
				"Pc_tid", "Identity" };
		request().setAttribute("tables", tables);

		List<Plparkingspace> plparkingspaces = appService
				.getAllPlparkingspaces();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plparkingspaces.size(); i++) {
			Plparkingspace plparkingspace = plparkingspaces.get(i);
			String[] list = { plparkingspace.getPspaceid() + "",
					plparkingspace.getResstatus(), plparkingspace.getCartype(),
					plparkingspace.getPs_sid() + "",
					plparkingspace.getPc_tid() + "",
					plparkingspace.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
