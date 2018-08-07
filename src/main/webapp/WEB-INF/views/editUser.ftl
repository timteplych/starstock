<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
    <form name="user" action="/addUser" method="post">
        <label>Name</label>
        <input type="text" title="Name" name = "name">
        <label>Email</label>
        <input type="text" title="Email" name="email">
        <label>Age</label>
        <input type="text" title="age" name="age">
        <input type="submit" value="Create">
    </form>
</body>
</html>