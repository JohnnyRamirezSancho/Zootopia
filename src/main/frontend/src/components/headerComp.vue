<script setup>
import { RouterLink } from 'vue-router';
</script>
<template>
    <header>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="../assets/img/title1.png" alt="this is title">
    </a>
    </div>
    
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#opciones">
      <span class="navbar-toggler-icon"></span>
    </button>

<div class="collapse navbar-collapse" id="opciones">   
         <button class="m-4"><RouterLink to="/Dashboard">Dashboard</RouterLink></button>
          <button class="m-4"><RouterLink to="/ListView">LIST</RouterLink></button>
          <button class="m-4"><RouterLink to="/AddView"> NEW SPECIMEN</RouterLink></button>
    </div>
    
</nav>

</header>
</template>
<style lang="scss" scoped>
nav{
  background-image: url("../assets/img/header.jpg");
  background-size: cover;
  background-repeat:no-repeat;
  background-position: center center;
  padding: 0;
  a{
    background-color: rgba(211, 60, 12, 0.5);
  }
  div{
    padding: 0;
  }
  img{
    width: 20em;
  }
  button{
    font-size: 1.125em;
    width:14.813em;
    background-color: #FB8F6E;
    border-radius: 0.5em;
    border: none;
    font-family: Mont;
    color: #333333;
  }
}
</style>