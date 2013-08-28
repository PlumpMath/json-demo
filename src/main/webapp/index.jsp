<html xmlns="http://www.w3.org/1999/xhtml" lang="zh_CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jqGrid Demos</title>

<link rel="stylesheet" type="text/css" media="screen"
	href="http://trirand.com/blog/jqgrid/themes/redmond/jquery-ui-custom.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="http://trirand.com/blog/jqgrid/themes/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="http://trirand.com/blog/jqgrid/themes/ui.multiselect.css" />	
</head>
<body>
<table id="jsonmap"></table>
<div id="pjmap"></div>
</body>
<script src="http://trirand.com/blog/jqgrid/js/jquery.js" type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery-ui-custom.min.js" type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery.layout.js" type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/i18n/grid.locale-en.js" type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/ui.multiselect.js" type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery.jqGrid.js" type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery.tablednd.js" type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery.contextmenu.js" type="text/javascript"></script>
<script type="text/javascript">
		$(document).ready(function(){
			jQuery("#jsonmap").jqGrid({        
			   	url:'getjson',
				datatype: "json",
			   	colNames:['Inv No','Date', 'Client', 'Amount','Tax','Total','Notes'],
			   	colModel:[
			   		{name:'id',index:'id', width:55},
			   		{name:'invdate',index:'invdate', width:90, jsonmap:"invdate"},
			   		{name:'name',index:'name asc, invdate', width:100},
			   		{name:'amount',index:'amount', width:80, align:"right"},
			   		{name:'tax',index:'tax', width:80, align:"right"},		
			   		{name:'total',index:'total', width:80,align:"right"},		
			   		{name:'note',index:'note', width:150, sortable:false}		
			   	],
			   	rowNum:10,
			   	rowList:[10,20,30],
			   	pager: '#pjmap',
			   	sortname: 'id',
			    viewrecords: true,
			    sortorder: "desc",
				jsonReader: {
					repeatitems : false,
					id: "0"
				},
				caption: "JSON Mapping",
				height: '100%'
			});
			jQuery("#jsonmap").jqGrid('navGrid','#pjmap',{edit:false,add:false,del:false});
		});
	</script>
</html>