# Devops
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Event Registration</title>
<style>
body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f9; }
.container { width: 50%; margin: 50px auto; background: white; padding: 20px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); }
h2 { text-align: center; }
.form-group { margin-bottom: 15px; }
label, input, select, button { display: block; width: 100%; margin-bottom: 5px; padding: 10px; border-radius: 5px; }
input, select { border: 1px solid #ccc; }
button { background: #4CAF50; color: white; border: none; cursor: pointer; }
button:hover { background: #45a049; }
.error { color: red; font-size: 0.9em; }
</style>
</head>
<body>
<div class="container">
<h2>Event Registration</h2>
<form id="registrationForm">
  <div class="form-group"><label>Full Name:<input type="text" id="name" required></label><span class="error" id="nameError"></span></div>
  <div class="form-group"><label>Email:<input type="email" id="email" required></label><span class="error" id="emailError"></span></div>
  <div class="form-group"><label>Phone:<input type="tel" id="phone" required></label><span class="error" id="phoneError"></span></div>
  <div class="form-group"><label>Event:<select id="event" required><option value="">-- Select --</option><option value="coding">Coding</option><option value="art">Art</option><option value="music">Music</option></select></label><span class="error" id="eventError"></span></div>
  <button type="button" onclick="validateForm()">Register</button>
</form>
</div>
<script>
function validateForm() {
  let isValid = true;
  const fields = ['name', 'email', 'phone', 'event'];
  fields.forEach(f => {
    const el = document.getElementById(f);
    const errorEl = document.getElementById(f + 'Error');
    errorEl.innerText = '';
    if (!el.value.trim() || (f === 'email' && !/\S+@\S+\.\S+/.test(el.value)) || (f === 'phone' && !/^\d{10}$/.test(el.value))) {
      errorEl.innerText = f === 'phone' ? 'Invalid phone number.' : Invalid ${f}.;
      isValid = false;
    }
  });
  if (isValid) {
    alert('Registration successful!');
    document.getElementById('registrationForm').reset();
  }
}
</script>
</body>
</html>
