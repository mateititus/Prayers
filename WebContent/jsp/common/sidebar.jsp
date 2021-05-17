<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-hamburger"></i></a>
      </li>
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="#" class="brand-link">
      <span class="brand-text font-weight-light"><strong>Praying...</strong></span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          
            <li class="nav-item">
            <a href="<c:url value="/index.html"/>" class="nav-link">
              <i class="fas fa-home"></i>
              <p>
             Home
              </p>
            </a>
            </li>
          <li class="nav-item">
            <a href="<c:url value="/listParticipanti.htm"/>" class="nav-link">
              <i class="fas fa-users"></i>
              <p>
             People
              </p>
            </a>
            </li>
            <li class="nav-item">
            <a href="<c:url value="/listBiserici.htm"/>" class="nav-link">
             <i class="fas fa-church"></i>
              <p>
              Churches
              </p>
            </a>
            </li>
             </li>
            <li class="nav-item">
            <a href="<c:url value="/listMotive.htm"/>" class="nav-link">
              <i class="fas fa-praying-hands"></i>
              <p>
              Reasons
              </p>
            </a>
            </li>
            
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>