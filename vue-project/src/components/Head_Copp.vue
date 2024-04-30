<template>
    <div class="header">
      <div class="logo">
        <!-- <img src="../vue-project/public/favicon.ico" alt="Logo"> -->
      </div>
      <ul class="menu">
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </div>
  </template>
  
  <script>
  
  export default {
    
  }
  </script>
  
  <style scoped>
  .header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 10px 20px;
    background-color: #333;
    color: white;
  }
  
  .logo img {
    height: 50px;
  }
  
  .menu {
    list-style-type: none;
    display: flex;
  }
  
  .menu li {
    margin-right: 20px;
  }
  
  .menu a {
    color: white;
    text-decoration: none;
  }
  </style>