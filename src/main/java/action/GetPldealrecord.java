package action;

import java.util.ArrayList;
import java.util.List;

import model.Pldealrecord;
import service.AppService;

public class GetPldealrecord extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Pldealrecord");

		String[] tables = { "Id", "Time", "Type", "Description", "OpName",
				"Identity" };
		request().setAttribute("tables", tables);

		List<Pldealrecord> pldealrecords = appService.getAllPldealrecords();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < pldealrecords.size(); i++) {
			Pldealrecord pldealrecord = pldealrecords.get(i);
			String[] list = { pldealrecord.getId() + "",
					pldealrecord.getTime().toString(), pldealrecord.getType(),
					pldealrecord.getDescription(), pldealrecord.getOpname(),
					pldealrecord.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
