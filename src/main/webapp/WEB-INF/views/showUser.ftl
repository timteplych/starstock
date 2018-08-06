<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>show Users</h1>
    <h1>${user.id}</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>${user.id}</td>
        </tr>
        <tr>
            <td>Username</td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${user.age}</td>
        </tr>
    </table>
    <br>
    <a href="/users">back to users</a>
</body>
</html>