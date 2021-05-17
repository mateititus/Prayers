<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalii</title>
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
                <h5 class="m-0">Detalii participant</h5>
              </div>
              <div class="card-body">

<strong>Nume:</strong> <c:out value="${participanti.nume}"/><br/>
<strong>Prenume: </strong><c:out value="${participanti.prenume}"/><br/>
<strong>Varsta: </strong> <c:out value="${participanti.varsta}"/><br/>
<strong>Telefon: </strong> <c:out value="${participanti.telefon}"/><br/>

<br></br>
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