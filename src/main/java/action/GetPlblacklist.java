package action;

import java.util.ArrayList;
import java.util.List;

import model.Plblacklist;
import service.AppService;

public class GetPlblacklist extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plblacklist");

		String[] tables = { "Blid", "CarLicence", "Reason", "Type", "Identity" };
		request().setAttribute("tables", tables);

		List<Plblacklist> plblacklists = appService.getAllPlblacklists();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plblacklists.size(); i++) {
			Plblacklist plblacklist = plblacklists.get(i);
			String[] list = { plblacklist.getBlid() + "",
					plblacklist.getCarlicence(), plblacklist.getReason(),
					plblacklist.getType(), plblacklist.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
