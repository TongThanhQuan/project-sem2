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
		<div class="card-body">
			<div class="form-validation">
			<spf:form action="${rootPath}category/add" method="POST"
		modelAttribute="cat" enctype="multipart/form-data">
					<div class="row">
						<div class="col-xl-6">
							<div class="form-group row">
								<label class="col-lg-4 col-form-label" for="name_cat">Danh mục
									<span class="text-danger">*</span>
								</label>
								<div class="col-lg-6">
									<input type="text" class="form-control" id="name_cat"
										name="name_cat" placeholder="Nhập danh mục">
								</div>
							</div>
						</div>
						<div class="col-xl-6">
							<div class="form-group row">
								<label class="col-lg-4 col-form-label">Trạng thái </label>
								<div class="col-lg-8">
									<label class="css-control css-control-primary css-checkbox"
										for="val-terms"> <input type="checkbox"
										class="css-control-input mr-2" id="val-terms" name="val-terms"
										value="1"> <span class="css-control-indicator"></span>

									</label>
								</div>
							</div>
							</div>
							<div class="form-group row">
								<div class="col-lg-8 ml-auto">
									<button type="submit" class="btn btn-primary">Submit</button>
								</div>
							</div>
						</div>
					</div>
				</spf:form>
			</div>
		</div>
	</div>
<jsp:include page="../layout/footer.jsp"></jsp:include>