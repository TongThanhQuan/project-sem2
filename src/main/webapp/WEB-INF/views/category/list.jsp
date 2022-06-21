<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spt" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../layout/header.jsp"></jsp:include>
<spt:url value="/" var="rootPath"></spt:url>

<div class="content-body" style="min-height: 732px;">
	<div class="container-fluid">
		<a href="${rootPath}category/init-add">Add</a>
		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-responsive-sm">
								<thead>
									<tr>
										<th>Id</th>
										<th>Name</th>
										<th>Status</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${lstCat}" var="cat">
										<tr>
											<td>${cat.id_cat}</td>
											<td>${cat.name_cat}</td>
											<td>${cat.status}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../layout/footer.jsp"></jsp:include>