<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="discount" method="get">
    <input type="text" name="mô tả" placeholder="Mô tả sản phẩm :"/>
    <input type="text" name="giá" placeholder="Giá niêm yết :"/>
    <input type="text" name="discount" placeholder="Tỷ lệ chiết khấu (%) :"/>
    <input type = "submit" id = "total" value = "Tính chiết khấu"/>
</form>
</body>
</html>