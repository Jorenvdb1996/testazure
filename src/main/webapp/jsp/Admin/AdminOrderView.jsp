<%@ page import="be.thomasmore.graduaten.hellospring.entities.Order" %>
<%@ page import="java.util.List" %>
<%
    // int nrOfOpenOrders = (int) request.getAttribute("nrOfOpenOrders");
//  int nrOfOrdersReadyToPickUp = (int) request.getAttribute("nrOfOrdersReadyToPickUp");
//  int totalNrOfOrdersReady = (int)  request.getAttribute("totalNrOfOrdersReady");

<%
    List<Order> Orders = (List<Order>) request.getAttribute("allProducts");
%>
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<jsp:include page="../partials/head.jsp"/>
<body>
<div class="container-fluid">
    <jsp:include page="../partials/adminNav.jsp"/>
    <jsp:include page="../partials/dateAndTime.jsp"/>
    <%--<jsp:include page="../partials/orderButton.jsp" />--%>


</div>

<div class="container">
    <div class="row">
        <div class="col">
            <h2 class="display-2 text-center"><%=request.getAttribute("pageTitle")%>
            </h2>
            <div class="row mt-5">
                <div class="col">

                </div>
            </div>
            <div class="row mt-5">
                <div class="col">



                </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../partials/footer.jsp"/>

</body>
</html>