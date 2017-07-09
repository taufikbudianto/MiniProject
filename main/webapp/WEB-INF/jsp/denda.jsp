<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- library bootstrap -->

<!-- library bootstrap -->
<%-- <script type="text/javascript"
	src="<c:url value="/resources/js/jquery-1.12.3.min.js"></c:url>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/bootstrap.min.js"></c:url>"></script>
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap-theme.min.css"></c:url>">
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css"></c:url>">
 --%>
<%-- <!-- library untuk datatables -->
<link rel="stylesheet"
	href="<c:url value="resources/css/dataTables.bootstrap.min.css"></c:url>">
<script type="text/javascript"
	src="<c:url value="resources/js/jquery.dataTables.min.js"></c:url>"></script>
<script type="text/javascript"
	src="<c:url value="resources/js/dataTables.bootstrap.min.js"></c:url>"></script>
 --%>
 
 <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.1.min.js"></script>
  <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.0/jquery.dataTables.min.js"></script>

 
 
<title>Form Pembayaran Denda</title>
</head>

<body>
<script type="text/javascript">
var date1=0;
$(function() {
	localStorage.clear();

	$(document).ready(function() {
		$('#search').val("Cari Denda Anggota.....");
		$('#nama').val(" ");
		$('#tanggalpinjam').val(" ");
		$('#tanggalkembali').val(" ");
		$('#tanggaldikembalikan').val(" ")
		$('#noreg').val(" ")
		Jumlah=$('#jum').val(" ")
		$('#data').dataTable();
	});
	
	
function setdata(namaAng) {
			element = $('#search').val(namaAng[2]);
			 $('#anggota').val(namaAng[6]);
			element1 = $('#nama').val(namaAng[1]);
			element1 = $('#tanggalpinjam').val(namaAng[3]);
			element2 = $('#tanggalkembali').val(namaAng[4]);
			data1 =namaAng[3];
			console.log(data1)
			/* var myDate = new Date();
    		var day1 = myDate.getDate();
    		var month1 = myDate.getMonth() + 1;
    		var year1 = myDate.getFullYear();
    		tanggaldikembalikan = $('#tanggaldikembalikan');
    		tanggaldikembalikan.val(year1 + "-" + month1 + "-" + day1);
    		var data2= $('#tanggaldikembalikan');
    		console.log(year1)  */
    		
    		 var kembaliAuto = new Date($("#tanggalpinjam").val());
            kembaliAuto.setDate(kembaliAuto.getDate());
            var tglkembaliauto =  kembaliAuto.getDate() + "-" +(kembaliAuto.getMonth()+1)+ "-" + kembaliAuto.getFullYear();
            $("#tanggalpinjam").val(tglkembaliauto);
            
            var kembaliAuto1 = new Date($("#tanggalkembali").val());
            kembaliAuto1.setDate(kembaliAuto1.getDate());
            var tglkembaliauto1 =  kembaliAuto1.getDate() + "-" +(kembaliAuto1.getMonth()+1)+ "-" + kembaliAuto1.getFullYear();
            $("#tanggalkembali").val(tglkembaliauto1);
            
            var kembali = new Date();
            kembali.setDate(kembali.getDate());
            var tglkembali =  kembali.getDate() + "-" +(kembali.getMonth()+1)+ "-" + kembali.getFullYear();
            $('#tanggaldikembalikan').val(tglkembali);
    
            var kali = (1000 * 3600 * 24)
            var selisih = Math.abs((kembali.getTime() - kembaliAuto1.getTime()) / kali);

            var bulatselisih = Math.round(selisih);
            console.log(bulatselisih)
            $(".denda").val(bulatselisih);
            date1=bulatselisih;
    	
	};
	
	
	$(document).on('click', '#pilihDenda', function(data) {
		var namaAng = new Array();
		var $row = $(this).closest("tr");
		var $tds = $row.find("td");
		$.each($tds, function() {
			namaAng.push($(this).text());
		});
		setdata(namaAng);
	});
});

var test = 0;
function Anggota(data){
    id = data;
    
    kembali=$('#tanggaldikembalikan').val();
    kem=$('#tanggalkembali').val();
    console.log('kembali'+kembali)
    console.log('kembali'+kem)
    console.log('jadi'+date1)
	
    test = data;
    $.ajax({
        type:'GET',
        url:'${pageContext.request.contextPath}/DendaAnggota/'+id,
        success:function(data){
        	console.log(data)
        	var jumlah=0;
        	var denda =(date1)*5000;
        	var tr;
        	$("#table").html("");
            for (var i = 0; i < data.length; i++) {
                tr = $("<tr/>");
                tr.append("<td>" + "<input id='dat' name='dat' type='hidden' value="+data[i].buku.id+">"+ data[i].buku.kode+ "</td>");
                tr.append("<td>" + data[i].buku.judulBuku + "</td>");
                tr.append("<td>" + date1 + "</td>");
                tr.append("<td>" + denda + "</td>");
               $("#table").append(tr);
               jumlah=jumlah+denda;
        }
           
            element = $('#jum').val(jumlah);	 
        },
        dataType: 'json'
    });
  }

function save(){
	var data = []
	 var i =0;
	datahead = test;
	console.log(test)
	Numb = $('#search').val()
	console.log(Numb)
	number= $('#anggota').val()
	console.log(number)
	Jumlah=$('#jum').val()
	console.log(Jumlah)
	 		$('form :input:hidden').each(function(){
        			 	data[i] = this.value;
        				i++;
        		});
	console.log(data)
	  $.ajax({
		 	type: "POST",
	 	 	//contentType: "application/json",
			 	url: "${pageContext.request.contextPath}/DendaAnggota/",
		 	data: {id:datahead, idang:number,buk:data, total:Jumlah, noref:Numb},
		 	dataType: 'json',
			 	success: function (id) {

			 		alert('berhasil')
			 		noreg = $("#noreg");
			 		noreg.val(id[0]);
			 		console.log(noreg)
			 		$('#savee').prop('disabled', true);
			 		$('#btnCancel').prop('disabled', true);
       			 
					
			 	}
			});			
	
}
	
</script>
<input class="hidden" type ="text" id="anggota" name="anggota" class="form-control" readonly="readonly">
<div class="container">
	<div class="container">
		<div class="row-fluid">
			<legend>Denda</legend>
				<div class="col-sm-12">
					<form class="form-horizontal" method="post">
						<div class="form-group">
						<label class="control-label col-sm-3">No. Referensi : </label>
							<div class="col-sm-6">
								<div class="input-group">
								<input type ="text" id="search" name="search" class="form-control" readonly="readonly">
									<span class="input-group-btn">
										<button class="btn btn-default" type="button"
										data-toggle="modal" data-target="#NoReferensi">
											<span class="glyphicon glyphicon-search">			
											</span>
											<span class="badge badge-notify" style ="top: -10px;background:#964e33;left: -0px;">${count}</span>
										
										</button>
									</span>
								</div>
							</div>
						</div>
					<div class="form-group">
					<label class="control-label col-sm-3" for="disabledTextInput">No.Registrasi : </label>
						<div class="col-sm-6">
							<input type ="text" id="noreg" name="noreg" class="form-control" readonly="readonly">
						</div>
					</div>
				<div class="form-group">
					<label class="control-label col-sm-3" for="NamaAnggota">Nama Anggota : </label>
						<div class="col-sm-6">

						<input type ="text" id="nama" name="nama" class="form-control" readonly="readonly">
						</div>
					</div>
				<div class="form-group">
					<label class="control-label col-sm-3" for="NamaAnggota">Tanggal Pinjam : </label>
						<div class="col-sm-6">
							<input type ="text" id="tanggalpinjam" name="tanggalpinjam" class="form-control" readonly="readonly">
						</div>
					</div>
						<div class="form-group">
						<label class="control-label col-sm-3" for="NamaAnggota">Tanggal Kembali : </label>
							<div class="col-sm-6">
								<input type ="text" id="tanggalkembali" name="tanggalkembali" class="form-control" readonly="readonly"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3" for="NamaAnggota">Tanggal
								Dikembalikan : </label>
							<div class="col-sm-6">
								<input type ="text" id="tanggaldikembalikan" name="tanggaldikembalikan" class="form-control" readonly="readonly">
							</div>
						</div>
						<div class="container-fluid">
							<table class="table table-bordered"  style="">
								<thead>
									<tr>
										<th>Kode Buku</th>
										<th>Judul Buku</th>
										<th>Terlambat (Hari)</th>
										<th>Denda (Rp.)</th>
									</tr>
							
								</thead>
								<tbody>
								<tbody id="table"></tbody>
									<tr>
										<th></th>
										<th>Jumlah</th>
										<th></th>
										
										<th ><input type ="text" id="jum" name="jum" class="form-control" readonly="readonly"></th>

									</tr>
								</tbody>
							</table>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-10">
								<button type="button" class="btn btn-primary" onClick="save()" id="savee">Save</button>
								<button type="button" class="btn btn-primary" id="btnCancel">Cancel</button>
							
							</div>
						</div>

					</form>
				</div>
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
								<th class="hidden">ID</th>
								<th>Nama</th>
								<th >No Referensi</th>
								<th class="hidden">Tanggal Pinjam</th>
								<th class="hidden">Tanggal Kembali</th>					
								<th>Action</th>
								<th class="hidden">Nama</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach var="data" items="${data}">
								<tr>
									<td class="hidden">${data.ID}</td>
							 		<td >${data.anggota.nama}</td>
									<td>${data.NORegistrasi}</td>
									<td class="hidden">${data.tanggalPinjam}</td>
									<td class="hidden">${data.tanggalKembali}</td>
									<td><a data-dismiss="modal" href="#"
										onClick="Anggota(${data.ID})" class="btn btn-primary"
										id="pilihDenda">Pilih</a></td>
									<td class="hidden">${data.anggota.ID}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
	 
</body>
</html>