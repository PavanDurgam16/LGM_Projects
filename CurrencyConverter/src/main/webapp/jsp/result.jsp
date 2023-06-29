<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.task.source.CurrencyConversionDAO"%>
<!DOCTYPE html>
<html>
<head>
<title>Currency Conversion Result</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/style2.css">
<link rel="stylesheet" type="text/css" href="./css/animations.css">
</head>
<body>
	<h1>Currency Conversion Result</h1>

	<table>
		<tr>
			<th>Base Currency</th>
			<th>Target Currency</th>
			<th>Conversion Rate</th>
			<th>Converted Amount</th>
		</tr>
		<tr>
			<td><%=((CurrencyConversionDAO) request.getAttribute("currencyConversion")).getBaseCode()%></td>
			<td><%=((CurrencyConversionDAO) request.getAttribute("currencyConversion")).getTargetCode()%></td>
			<td><%=((CurrencyConversionDAO) request.getAttribute("currencyConversion")).getConversionRate()%></td>
			<td><%=((CurrencyConversionDAO) request.getAttribute("currencyConversion")).getConversionResult()%></td>

		</tr>
	</table>

	<br>
	<a href="index.html">Convert another currency</a>
</body>
</html>