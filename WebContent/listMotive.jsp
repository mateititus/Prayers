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
                <h5 class="m-0" data-hook="lista_motive_header">Lista motive</h5>
                
              </div>
              <div class="card-body">

	<table class="table table-head-fixed text-nowrap">
		<tr>
			<td><b>Motiv</b></td>
			<td><b>Categorie</b></td>
			<td><b>Raspuns</b></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach var="mo" items="${motive}">
			<tr data-hook="motiv_${mo.id}">
				<td data-hook="motivRugaciune_${mo.motiv}"><c:out value="${mo.motiv}" /></td>
				<td data-hook="categorie_${mo.categorie}"><c:out value="${mo.categorie}" /></td>
				<td data-hook="raspuns_${mo.raspuns}"><c:out value="${mo.raspuns}" /></td>
				
				<td><a class="btn btn-info" href="<c:url value="/detaliiMotive.htm?id=${mo.id}"/>"><i class="fas fa-info-circle"></i>  Detalii</a></td>
				<td><a class="btn btn-success" href="<c:url value="/editare-motive.htm?id=${mo.id}"/>"><i class="fas fa-edit"></i>  Edit</a></td>
				<td><a class="btn btn-danger" href="<c:url value="/deleteMotive.htm?id=${mo.id}"/>"><i class="fas fa-trash"></i>  Delete</a></td>

				</tr>
		</c:forEach>
	</table>
	<br></br>
	<a class="btn btn-primary" href="<c:url value="/adaugare-motive.htm"/>"><i class="fas fa-plus-square" data-hook="adauga_motiv_button"></i>  <b>Adauga</b></i></a>
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