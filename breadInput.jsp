<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>パンアンケート</title>
</head>
<body>
    <h2>名前と好きなパンを選んでください</h2>

    <!-- form の action, method, input の name がポイント -->
    <form action="breadSurvey" method="post">
        名前：
        <input type="text" name="customerName"><br><br>

        好きなパン：
        <label><input type="radio" name="breadType" value="フランスパン"> F</label>
        <label><input type="radio" name="breadType" value="ホットドッグ"> H</label>
        <label><input type="radio" name="breadType" value="その他"> O</label>
        <br><br>

        <input type="submit" value="送信">
    </form>
</body>
</html>
