<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista</title>

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
                <h5 class="m-0" data-hook="lista_biserici_header">Lista biserici</h5>
                
              </div>
              <div class="card-body">

	<table class="table table-head-fixed text-nowrap">
		<tr>
			<td><b>Nume</b></td>
			<td><b>Adresa</b></td>
			<td><b>Localitate</b></td>
			<td><b>Telefon</b></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach var="bi" items="${biserici}">
			<tr data-hook="biserica_${bi.id}"> 
				<td data-hook="bisericaNume_${bi.nume}"><c:out value="${bi.nume}" /></td>
				<td data-hook="biserica_${bi.adresa}"><c:out value="${bi.adresa}" /></td>
				<td data-hook="biserica_${bi.localitate}"><c:out value="${bi.localitate}" /></td>
				<td data-hook="biserica_${bi.telefon}"><c:out value="${bi.telefon}" /></td>
				<td><a class="btn btn-info" href="<c:url value="/detaliiBiserici.htm?id=${bi.id}"/>"><i class="fas fa-info-circle"></i>  Detalii</a></td>
				<td><a class="btn btn-success" href="<c:url value="/editare-biserici.htm?id=${bi.id}"/>"><i class="fas fa-edit"></i>  Edit</a></td>
				<td><a class="btn btn-danger" href="<c:url value="/deleteBiserici.htm?id=${bi.id}"/>"><i class="fas fa-trash"></i>  Delete</a></td>
				

			</tr>
		</c:forEach>
	</table>
	<br></br>
	<a class="btn btn-primary" href="<c:url value="/adaugare-biserici.htm"/>"><i class="fas fa-plus-square" data-hook="adauga_biserica_button"></i>  <b>Adauga</b></i></a>
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

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
    <div class="p-3">
      <h5>Title</h5>
      <p>Sidebar content</p>
    </div>
  </aside>
  <!-- /.control-sidebar -->

  <jsp:include page="/jsp/common/footer.jsp"/>
  
</div>
<!-- ./wrapper -->

<jsp:include page="/jsp/common/bottom_imports.jsp"/>

</body>
</html>