<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="/jsp/common/head_imports.jsp"/>
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

	<jsp:include page="/jsp/common/sidebar.jsp"/>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
     <!-- Main content -->
    <div class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-lg-12">
            <div class="card card-primary card-outline">
              <div class="card-header">
                <h5 class="m-0">Modifica detaliile motivului</h5>
              </div>
              <div class="card-body">
  
<form:form action="${pageContext.request.contextPath}/editare-motive-save.htm" method="post" modelAttribute="motiveForm">

<div class="form-group">
	<label for="id">Id</label><br/>
	<form:input path="id" readonly="true" class="form-control"/>
</div>

<div class="form-group">
	<label for="motiv">Motiv</label><br/>
	<form:input path="motiv" class="form-control"/>
</div>
<div class="form-group">
	<label for="categorie">Categorie</label><br/>
	<form:input path="categorie" class="form-control"/>
</div>
<div class="form-group">
	<label for="raspuns">Raspuns</label><br/>
	<form:input path="raspuns" class="form-control"/>
</div>


<input type="submit" value="Salveaza" class="btn btn-primary"/><br/>

</form:form>
<br/><br/>


   </div>
            </div>
          </div>
          <!-- /.col-md-6 -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

	<jsp:include page="/jsp/common/footer.jsp"/>
  
</div>
<!-- ./wrapper -->

<jsp:include page="/jsp/common/bottom_imports.jsp"/>

</body>
</html>