<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adaugare</title>
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
                <h5 class="m-0">Adaugare biserica</h5>
              </div>
              <div class="card-body">
              
<form:form action="${pageContext.request.contextPath}/adaugare-biserici-save.htm" method="post" modelAttribute="biserici">
<div class="form-group">	
<label for = "nume">Nume</label>
<form:input path="nume" class="form-control" data-hook="biserica_adaugaBisericaNume"/>
</div>

<div class="form-group">
<label for = "adresa">Adresa</label>
<form:input path="adresa" class="form-control" data-hook="biserica_adaugaBisericaAdresa"/>
</div>

<div class="form-group">
<label for = "localitate">Localitate</label>
<form:input path="localitate" class="form-control" data-hook="biserica_adaugaBisericaLocalitate"/>
</div>
<div class="form-group">
<label for = "telefon">Telefon</label>
<form:input path="telefon" class="form-control" data-hook="biserica_adaugaBisericaTelefon"/>
</div>
		<br ><br />
		<input type="submit"  value="Salveaza" class="btn btn-primary" data-hook="salveaza_adaugaBiserica_button"/>
		<br />
		
		</form:form>
		
	<br ><br />
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