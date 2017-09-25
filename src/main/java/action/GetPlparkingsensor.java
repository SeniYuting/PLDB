package action;

import java.util.ArrayList;
import java.util.List;

import model.Plparkingsensor;
import service.AppService;

public class GetPlparkingsensor extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plparkingsensor");

		String[] tables = { "SId", "NodeNumber", "IP", "Identity" };
		request().setAttribute("tables", tables);

		List<Plparkingsensor> plparkingsensors = appService
				.getAllPlparkingsensors();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plparkingsensors.size(); i++) {
			Plparkingsensor plparkingsensor = plparkingsensors.get(i);
			String[] list = { plparkingsensor.getSid() + "",
					plparkingsensor.getNodenumber(), plparkingsensor.getIp(),
					plparkingsensor.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
