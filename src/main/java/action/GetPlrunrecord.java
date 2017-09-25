package action;

import java.util.ArrayList;
import java.util.List;

import model.Plrunrecord;
import service.AppService;

public class GetPlrunrecord extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plrunrecord");

		String[] tables = { "Id", "Time", "SpaceId", "Status", "Step",
				"Identity" };
		request().setAttribute("tables", tables);

		List<Plrunrecord> plrunrecords = appService.getAllPlrunrecords();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plrunrecords.size(); i++) {
			Plrunrecord plrunrecord = plrunrecords.get(i);
			String[] list = { plrunrecord.getId() + "",
					plrunrecord.getTime().toString(),
					plrunrecord.getSpaceid() + "",
					plrunrecord.getStatus() + "", plrunrecord.getStep() + "",
					plrunrecord.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
