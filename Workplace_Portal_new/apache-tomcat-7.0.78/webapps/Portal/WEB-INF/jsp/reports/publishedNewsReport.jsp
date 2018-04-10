
<%@ page language="java" import="java.util.*"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<!--<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		-->
		<base href="<%=basePath%>">
		<!--
		 <meta charset="UTF-8">
		-->
		<link
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
		<link
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" />
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
		<!-- start: MAIN CSS -->
		<link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet"
			href="vendor/fontawesome/css/font-awesome.min.css">
		<link rel="stylesheet"
			href="vendor/themify-icons/themify-icons.min.css">
		<link href="vendor/animate.css/animate.min.css" rel="stylesheet"
			media="screen">
		<link href="vendor/perfect-scrollbar/perfect-scrollbar.min.css"
			rel="stylesheet" media="screen">
		<link href="vendor/switchery/switchery.min.css" rel="stylesheet"
			media="screen">
		<!-- end: MAIN CSS -->
		<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
		<link
			href="vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.css"
			rel="stylesheet" media="screen">
		<link href="vendor/select2/select2.min.css" rel="stylesheet"
			media="screen">
		<link
			href="vendor/bootstrap-datepicker/bootstrap-datepicker3.standalone.min.css"
			rel="stylesheet" media="screen">
		<link href="vendor/bootstrap-timepicker/bootstrap-timepicker.min.css"
			rel="stylesheet" media="screen">
		<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
		<!-- start: CLIP-TWO CSS -->
		<link rel="stylesheet" href="assets/css/styles.css">
		<link rel="stylesheet" href="assets/css/plugins.css">
		<link rel="stylesheet" href="assets/css/themes/theme-1.css"
			id="skin_color" />
		<link rel="stylesheet"
			href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.5/css/bootstrap-select.min.css">
		<!-- end: CLIP-TWO CSS -->
<style>

</style>
	</head>

	<body>
	
	   
	<!--
	style="float:inherit;padding-right:250px ;padding-left:250px ; margin-bottom:10px;margin-right:20px;width:700px"   -->
						<div >
					<label>Type Of News</label>
							<select id="dropdown_change" onchange="showDiv(this)">
								<option value="0" >Select</option>
								<option value="LatNews" >Latest News</option>
								<option value="EntNews" >Entertainment News </option>
								<option value="SpoNews">Sports News </option>
								<option value="BusNews">Business News </option>
								<option value="EduNews">Education/Employment News </option>
								<option value="FamNews">Family/Health News </option>
							</select> 							
				</div>	
				
			<!--  	latest_news_table_div		-->
					
		<div  id="latest_news_table_div" class="table-responsive"  style="display:none;">
			<table class="table table-bordered table-hover" id="latest_news_table">
				<thead>
					<tr >
						<th>
							SNO
						</th>
						<th>
							ARTICLE NAME
						</th>
						<th>
							PUBLISHED DATE
						</th>
						<th>
							ACTION
						</th>
					</tr>
				</thead>
				<tbody id="latest_news_table_body">

				</tbody>
			</table>
		</div>
		
		<!--  entertainment_news_table_div		-->
		
		<div id="entertainment_news_table_div" class="table-responsive"  style="display:none;">

			<table class="table table-bordered table-hover" id="entertainment_news_table">
				<thead>
					<tr>
						<th>
							SNO
						</th>
						<th>
							ARTICLE NAME
						</th>
						<th>
							PUBLISHED DATE
						</th>
						<th>
							ACTION
						</th>
					</tr>
				</thead>
				<tbody id="entertainment_news_table_body">

				</tbody>
			</table>
		</div>
		
		<!--  	sports_news_table_div		-->
		
		<div id="sports_news_table_div" class="table-responsive"  style="display:none;">

			<table class="table table-bordered table-hover" id="sports_news_table">
				<thead>
					<tr>
						<th>
							SNO
						</th>
						<th>
							ARTICLE NAME
						</th>
						<th>
							PUBLISHED DATE
						</th>
						<th>
							ACTION
						</th>
					</tr>
				</thead>
				<tbody id="sports_news_table_body">

				</tbody>
			</table>
		</div>
		
		<!--  	business_news_table_div		-->
		
		<div id="business_news_table_div" class="table-responsive"  style="display:none;">

			<table class="table table-bordered table-hover" id="business_news_table">
				<thead>
					<tr>
						<th>
							SNO
						</th>
						<th>
							ARTICLE NAME
						</th>
						<th>
							PUBLISHED DATE
						</th>
						<th>
							ACTION
						</th>
					</tr>
				</thead>
				<tbody id="business_news_table_body">

				</tbody>
			</table>
		</div>
		
		<!--  	eduemp_news_table_div		-->
		
		<div id="eduemp_news_table_div" class="table-responsive"  style="display:none;">

			<table class="table table-bordered table-hover" id="eduemp_news_table">
				<thead>
					<tr>
						<th>
							SNO
						</th>
						<th>
							ARTICLE NAME
						</th>
						<th>
							PUBLISHED DATE
						</th>
						<th>
							ACTION
						</th>
					</tr>
				</thead>
				<tbody id="eduemp_news_table_body">

				</tbody>
			</table>
		</div>
		
		<!--  	family_health_news_table_div		-->
		
		<div id="family_health_news_table_div" class="table-responsive"  style="display:none;">

			<table class="table table-bordered table-hover" id="family_health_news_table">
				<thead>
					<tr>
						<th>
							SNO
						</th>
						<th>
							ARTICLE NAME
						</th>
						<th>
							PUBLISHED DATE
						</th>
						<th>
							ACTION
						</th>
					</tr>
				</thead>
				<tbody id="family_health_table_body">

				</tbody>
			</table>
		</div>
    <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading"><span class="blocking"></span> Delete Artical </h4>
      </div>
          <div class="modal-body bg-white">
       
       <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span>
        Are you sure you want to delete ?</div>
       
       
      </div>
        <div class="modal-footer ">
        <a id="delateUrl"><button type="button" class="btn btn-success" data-dismiss="modal"><span class="glyphicon glyphicon-ok-sign"></span> Yes</button></a>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
      </div>
        </div>
     
  </div>
       
    </div>		

	</body>

	<script>
function showDiv(select){
   if(select.value=="LatNews"){
   
   	var link = '${pageContext.request.contextPath}/getLatestNews.htm';
		$("#latest_news_table_body").empty();
	$.get(link, function(data) {
	
		   $('#latest_news_table_div').show();
		   $('#entertainment_news_table_div').hide();
		   $('#sports_news_table_div').hide();
		   $('#business_news_table_div').hide();
		   $('#eduemp_news_table_div').hide();
		   $('#family_health_news_table_div').hide();

		var output = JSON.parse(data);
		console.log(output);
		
		$('#latest_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
			var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callLatestNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;
				
			$("#latest_news_table").append(row);
			
		});
		
	})
   }

   else if(select.value=="EntNews"){
    
   	var link = '${pageContext.request.contextPath}/getEntertainmentNews.htm';
		$("#entertainment_news_table_body").empty();
	$.get(link, function(data) {
	
   $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').show();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').hide();
		var output = JSON.parse(data);
		console.log(output);
		
		$('#entertainment_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
			var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callEntertainmentNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;

					
			$("#entertainment_news_table").append(row);
			
		});
		
	})
   
   } 
   else if(select.value=="SpoNews"){
   
var link = '${pageContext.request.contextPath}/getSportsNews.htm';
		$("#sports_news_table_body").empty();
	$.get(link, function(data) {
	
     $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').show();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').hide();
		var output = JSON.parse(data);
		console.log(output);
		
		$('#sports_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
			var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callSportsNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;

					
			$("#sports_news_table").append(row);
			
		});
		
	})
   }
   else if(select.value=="BusNews"){
var link = '${pageContext.request.contextPath}/getBusinessNews.htm';
		$("#business_news_table_body").empty();
	$.get(link, function(data) {
	
    $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').show();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').hide();
  
		var output = JSON.parse(data);
		console.log(output);
		
		$('#business_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
			var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callBusinessNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;
					
			$("#business_news_table").append(row);
			
		});
		})
	}
   else if(select.value=="EduNews"){
var link = '${pageContext.request.contextPath}/getEducationEmploymentNews.htm';
		$("#eduemp_news_table_body").empty();
	$.get(link, function(data) {
	
    $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').show();
   $('#family_health_news_table_div').hide();
 
		var output = JSON.parse(data);
		console.log(output);
		
		$('#eduemp_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
			var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callEduEmpNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;
					
			$("#eduemp_news_table").append(row);
			
		});
		
	} )
	}
   else{
var link = '${pageContext.request.contextPath}/getFamilyHealthNews.htm';
		$("#family_health_table_body").empty();
	$.get(link, function(data) {
	
   $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').show();
		var output = JSON.parse(data);
		console.log(output);
		
		$('#family_health_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
			var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callFamHeaNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;

					
			$("#family_health_news_table").append(row);
			
		});
		
	})
} 
}

				function callLatestNewsDeleteRequest(id){			
				
				$("#delateUrl").attr("onClick", "getLatestNewsToDelete("+id+")");
				
			}
							function callEntertainmentNewsDeleteRequest(id){			
				
				$("#delateUrl").attr("onClick", "getEntertainmentNewsToDelete("+id+")");
				
			}
							function callSportsNewsDeleteRequest(id){			
				
				$("#delateUrl").attr("onClick", "getSportsNewsToDelete("+id+")");
				
			}
							function callBusinessNewsDeleteRequest(id){			
				
				$("#delateUrl").attr("onClick", "getBusinessNewsToDelete("+id+")");
				
			}
							function callEduEmpNewsDeleteRequest(id){			
				
				$("#delateUrl").attr("onClick", "getEduEmpNewsToDelete("+id+")");
				
			}
							function callFamHeaNewsDeleteRequest(id){			
				
				$("#delateUrl").attr("onClick", "getFamHeaNewsToDelete("+id+")");
				
			}
function getLatestNewsToDelete(Id) {

	var link = '${pageContext.request.contextPath}/getLatestNewsToDelete/' + Id + '.htm';
	$("#latest_news_table_body").empty();
		$.get(link, function(data) {
	
   $('#latest_news_table_div').show();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').hide();

		var output = JSON.parse(data);
		console.log(output);
		
		$('#latest_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
			var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callLatestNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;				
			$("#latest_news_table").append(row);
			
		});		
	})
}
function getEntertainmentNewsToDelete(Id) {

   var link = '${pageContext.request.contextPath}/getEntertainmentNewsToDelete/' + Id + '.htm';
		$("#entertainment_news_table_body").empty();
	$.get(link, function(data) {
	
   $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').show();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').hide();
		var output = JSON.parse(data);
		console.log(output);
		
		$('#entertainment_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
			var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callEntertainmentNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;
					
			$("#entertainment_news_table").append(row);
			
		});
		
	})
}
function getSportsNewsToDelete(Id) {

var link = '${pageContext.request.contextPath}/getSportsNewsToDelete/' + Id + '.htm';
		$("#sports_news_table_body").empty();
	$.get(link, function(data) {
	
     $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').show();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').hide();
		var output = JSON.parse(data);
		console.log(output);
		
		$('#sports_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
						var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callSportsNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;
					
			$("#sports_news_table").append(row);
			
		});
		
	})
}
function getBusinessNewsToDelete(Id) {

var link = '${pageContext.request.contextPath}/getBusinessNewsToDelete/' + Id + '.htm';
		$("#business_news_table_body").empty();
	$.get(link, function(data) {
	
    $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').show();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').hide();
  
		var output = JSON.parse(data);
		console.log(output);
		
		$('#business_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
						var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callBusinessNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;
					
			$("#business_news_table").append(row);
			
		});
		})
}
function getEduEmpNewsToDelete(Id) {

var link = '${pageContext.request.contextPath}/getEduEmpNewsToDelete/' + Id + '.htm';
		$("#eduemp_news_table_body").empty();
	$.get(link, function(data) {
	
    $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').show();
   $('#family_health_news_table_div').hide();
 
		var output = JSON.parse(data);
		console.log(output);
		
		$('#eduemp_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
						var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callEduEmpNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;
					
			$("#eduemp_news_table").append(row);
			
		});
		
	} )
}
function getFamHeaNewsToDelete(Id) {

var link = '${pageContext.request.contextPath}/getFamHeaNewsToDelete/' + Id + '.htm';
		$("#family_health_table_body").empty();
	$.get(link, function(data) {
	
   $('#latest_news_table_div').hide();
   $('#entertainment_news_table_div').hide();
   $('#sports_news_table_div').hide();
   $('#business_news_table_div').hide();
   $('#eduemp_news_table_div').hide();
   $('#family_health_news_table_div').show();
		var output = JSON.parse(data);
		console.log(output);
		
		$('#family_health_news_table_div').show();
		$.each(output, function(index, value) {
		var currentTime = new Date(value.CREATED_DATE)
		var month = currentTime.getMonth() + 1
		var day = currentTime.getDate()
		var year = currentTime.getFullYear()
		var date = day + "/" + month + "/" + year
		
						var row = $("<tr><td>" + value.SRNO +"</td><td>" + value.NEWS_HEADLINE +"</td><td>" + date +"</td> +"
	+ "<td ><a  onclick='callFamHeaNewsDeleteRequest("+value.NEWS_ID+")' data-title='Delete' data-toggle='modal' data-target='#delete'>DELETE</a></td></tr>") ;
					
			$("#family_health_news_table").append(row);
			
		});
		
	})
}
</script>
	<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
	<script src="vendor/maskedinput/jquery.maskedinput.min.js">
</script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-dateFormat/1.0/jquery.dateFormat.js">
</script>

	<script
		src="vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.js">
</script>
	<script src="vendor/autosize/autosize.min.js">
</script>
	<script src="vendor/selectFx/classie.js">
</script>
	<script src="vendor/selectFx/selectFx.js">
</script>
	<script src="vendor/select2/select2.min.js">
</script>
	<script src="vendor/bootstrap-datepicker/bootstrap-datepicker.min.js">
</script>
	<script src="vendor/bootstrap-timepicker/bootstrap-timepicker.min.js">
</script>
	<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
	<!-- start: CLIP-TWO JAVASCRIPTS -->
	<script src="assets/js/main.js">
</script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.5/js/bootstrap-select.min.js">
</script>
	<!-- start: JavaScript Event Handlers for this page -->
	<script src="assets/js/form-elements.js">
</script>





</html>
