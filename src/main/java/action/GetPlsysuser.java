package action;

import java.util.ArrayList;
import java.util.List;

import model.Plsysuser;
import service.AppService;

public class GetPlsysuser extends BaseAction {

	private static final long serialVersionUID = 1L;

	private AppService appService;

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@Override
	public String execute() throws Exception {

		request().setAttribute("table", "Plsysuser");

		String[] tables = { "Acct", "Passw", "Type", "Name", "Phone",
				"Identity" };
		request().setAttribute("tables", tables);

		List<Plsysuser> plsysusers = appService.getAllPlsysusers();
		List<String[]> lists = new ArrayList<String[]>();
		for (int i = 0; i < plsysusers.size(); i++) {
			Plsysuser plsysuser = plsysusers.get(i);
			String[] list = { plsysuser.getAcct(), plsysuser.getPassw(),
					plsysuser.getType(), plsysuser.getName(),
					plsysuser.getPhone(), plsysuser.getIdentity() + "" };
			lists.add(list);
		}
		request().setAttribute("lists", lists);

		return SUCCESS;
	}
}
