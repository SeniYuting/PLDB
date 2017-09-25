package action;

import java.util.ArrayList;
import java.util.List;

import model.Plreserveparkinguser;
import service.AppService;

public class GetPlreserveparkinguser extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plreserveparkinguser");

		String[] tables = { "UserId", "Name", "Phone", "CarLicence", "CarType",
				"Validity", "Plreserveparkinguser_pSpaceId", "Identity" };
		request().setAttribute("tables", tables);

		List<Plreserveparkinguser> plreserveparkingusers = appService
				.getAllPlreserveparkingusers();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plreserveparkingusers.size(); i++) {
			Plreserveparkinguser plreserveparkinguser = plreserveparkingusers
					.get(i);
			String[] list = { plreserveparkinguser.getUserid() + "",
					plreserveparkinguser.getName(),
					plreserveparkinguser.getPhone(),
					plreserveparkinguser.getCarlicence(),
					plreserveparkinguser.getCartype(),
					plreserveparkinguser.getValidity().toString(),
					plreserveparkinguser.getPlparkingspace_pspaceid() + "",
					plreserveparkinguser.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
