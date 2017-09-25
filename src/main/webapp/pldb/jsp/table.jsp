<%@ page import="java.util.List"%>

<%
	String[] tables = (String[]) request.getAttribute("tables");
	@SuppressWarnings("unchecked")
	List<String[]> lists = (List<String[]>) request
			.getAttribute("lists");
%>

<div
	class="row col-lg-12 panel panel-default panel-body dataTable_wrapper">
	<table class="table table-striped table-bordered table-hover"
		id="dataTables">
		<thead>
			<tr>
				<%
					for (int i = 0; i < tables.length; i++) {
				%>
				<th><%=tables[i]%></th>
				<%
					}
				%>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lists.size(); i++) {
			%>
			<tr>
				<%
					String[] list = lists.get(i);
						for (int j = 0; j < list.length; j++) {
				%>

				<td><%=list[j]%></td>

				<%
					}
				%>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</div>