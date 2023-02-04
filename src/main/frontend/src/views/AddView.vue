<script setup>
import formComp from '../components/FormComponents/formComp.vue';
</script>
<template>
<main class="container">
    <h1>Add new specimen</h1>
    <div class="d-flex">
        <img src="../assets/img/bunny.jpg" class="img-fluid p-5">
        <formComp/>
    </div>
</main>
</template>
<style lang="scss" scoped>
img{
    width: 20%;
    height: 20%;
}
</style>
