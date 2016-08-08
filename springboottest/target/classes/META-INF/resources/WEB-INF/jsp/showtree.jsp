<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%
response.setHeader("Cache-Control","no-cache");
response.setHeader("Pragma","no-cache");
response.setHeader("Expires","0");
%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<script>
 $(document).ready(function(){
  $.ajax({
  method: "GET",
  url: "http://localhost:8080/getData",
  dataType : "json"
})
  .done(function( msg ) {
    $('#jsTreeDiv').on('changed.jstree', function (e, data) {
    var i, j, r = [];
    for(i = 0, j = data.selected.length; i < j; i++) {
      r.push(data.instance.get_node(data.selected[i]).text);
    }
    $('#txtData').text('You Have Selected ' + r.join(', ')+ ': detail description about this node will be same across all in this application!');
	$( "#dialog" ).dialog();
  }).jstree({ 'core' : {
    'data' : msg
} });
  }).fail(function(ex) {
    console.log( "error" +ex);
  });
  
 });
</script>
</head>
	<body>
		<div id="jsTreeDiv"></div>
		<div id="dialog" title="Detail Information">
        <p id="txtData"></p>
       </div>
	</body>
</html>
