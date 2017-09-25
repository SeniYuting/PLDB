package action;

import java.util.ArrayList;
import java.util.List;

import model.Plmalfunctionrecord;
import service.AppService;

public class GetPlmalfunctionrecord extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plmalfunctionrecord");

		String[] tables = { "Id", "Time", "Type", "Description", "Identity" };
		request().setAttribute("tables", tables);

		List<Plmalfunctionrecord> plmalfunctionrecords = appService
				.getAllPlmalfunctionrecords();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plmalfunctionrecords.size(); i++) {
			Plmalfunctionrecord plmalfunctionrecord = plmalfunctionrecords
					.get(i);
			String[] list = { plmalfunctionrecord.getId() + "",
					plmalfunctionrecord.getTime().toString(),
					plmalfunctionrecord.getType(),
					plmalfunctionrecord.getDescription(),
					plmalfunctionrecord.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
