<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>主页面</title>
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/ueditor/ueditor.config.js">
		
	</script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/ueditor/ueditor.all.min.js">
		
	</script>
</head>
<body style="margin: 1px;" id="ff">
	<table id="dg" title="查询表格" class="easyui-datagrid"
		pagination="true" rownumbers="true" fit="true"
		data-options="pageSize:10"
		url="${pageContext.request.contextPath}/poi/list" toolbar="#tb">
		<thead data-options="frozen:true">
			<tr>
				<th field="cb" checkbox="true" align="center"></th>
				<th field="id" width="10%" align="center" hidden="true">id</th>
				<th field="city" width="150" align="center">city</th>
				<th field="date" width="150" align="center">date</th>
				<th field="protocol" width="150" align="center">protocol</th>
				<th field="bcpnum" width="150" align="center">bcpnum</th>
				<th field="loadrecord" width="150" align="center">loadrecord</th>
				<th field="saverecord" width="150" align="center">saverecord</th>
			</tr>
		</thead>
	</table>
	
</body>
</html>