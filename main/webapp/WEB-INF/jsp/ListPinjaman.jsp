<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.1.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.0/jquery.dataTables.min.js"></script>

<title>Data Peminjam Buku</title>
<script type="text/javascript">
$(document).ready(function(){
	$('#Anggota').dataTable();
})

var  kembali=0;
function List(data){
	id=data;
 	console.log(data)
    $.ajax({
        type:'GET',
        url:'${pageContext.request.contextPath}/ListPinjaman/'+id,
        success:function(data){
        	console.log(data)
        	var tr; 
            kembali=$('#date').val();
            console.log('kembali'+kembali)
            var kembali = new Date();
             var kembaliAuto1 = new Date($("#date").val());   
             var kali = (1000 * 3600 * 24)
             var selisih = Math.abs((kembali.getTime() - kembaliAuto1.getTime()) / kali);
             var bulatselisih = Math.round(selisih);
             $(".denda").val(bulatselisih);
             console.log(bulatselisih)
             $("#table").html("");
            for (var i = 0; i < data.length; i++) {
                tr = $("<tr/>");
                tr.append("<td>" + data[i].buku.id + "</td>");
                tr.append("<td>" + data[i].buku.kode + "</td>");
                tr.append("<td>" + data[i].buku.judulBuku + "</td>");
                tr.append("<td>"+ "<input id='date' name='date' type='hidden' value="+ data[i].brwheader.tanggalKembali+">"+ bulatselisih + "</td>");
                tr.append("<td>" + bulatselisih*5000 + "</td>"); 
               $("#table").append(tr);
               
        		}

        },
        dataType: 'json'
    });


  }

</script>

</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="table-responsive">
				<table id="Anggota" class="table table-stripped">
					<thead>
						<tr>
							<th>No Registrasi</th>
							<th>Nama Anggota</th>
							<th>TanggalPinjam</th>
							<th>TanggalKembali</th>
							<th>Jumlah</th>
							<th>View Detail</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listData}" var="data">
							<tr>
								<td>${data.id}</td>
								<td>${data.anggota.nama}</td>
								<td>${data.tanggalPinjam}</td>
								<td>${data.tanggalKembali}</td>
								<td>
									<c:set var="count" value="0"></c:set>
									<c:forEach items="${data.brwDetails}">
      								<c:set var="count" value="${count + 1}"></c:set>
   									</c:forEach>
									<c:out value="${count}" ></c:out>
   								</td>
								<td> 
								<a data-dismiss="modal" href="#" onClick='List(${data.id})' class="btn btn-primary" 
									type="button" data-toggle="modal" data-target="#NoReferensi">
									<span class="glyphicon glyphicon-search"></span>
										</a>
								</td>
							</tr>
						</c:forEach>  
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<!--Modal-->
	<div class="modal fade" id="NoReferensi" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Daftar Denda</h4>
				</div>
				<div class="modal-body">
				<div class="table-responsive">
					<table id ="data" class="table table-stripped">
						<thead>
							<tr>
								<th>ID</th>
								<th>Kode Buku</th>
								<th>Judul Buku</th>
								<th>Terlambat (Hari)</th>
								<th>Denda (Rp)</th>								
							</tr>
						</thead>
						<tbody id="table"></tbody>
					</table>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">Kembalikan</button>
					<button type="button" class="btn btn-danger" data-dismiss="modal">Tutup</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>