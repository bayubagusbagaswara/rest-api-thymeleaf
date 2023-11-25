# REST API Thymeleaf

<!-- src/main/resources/templates/generalData.html -->
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<body>
    <h1 th:text="${message}"></h1>
</body>
</html>


<!-- src/main/resources/templates/personData.html -->
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<body>
    <h1 th:text="${firstName + ' ' + lastName + ', Age: ' + age}"></h1>
</body>
</html>

# IF DATA OBJECT AS RETURN VALUE
<!-- src/main/resources/templates/personData.html -->
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<body>
    <h1 th:text="${dataObject.firstName + ' ' + dataObject.lastName + ', Age: ' + dataObject.age}"></h1>
</body>
</html>