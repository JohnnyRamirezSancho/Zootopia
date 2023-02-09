<script setup>
import formComp from '../components/FormComponents/formAddComp.vue';
import headerComp from '../components/headerComp.vue';
import footerComp from '../components/footerComp.vue';
</script>
<template>
<headerComp/>
<main class="container">
    <h1>Add new specimen</h1>
    <div class="d-flex">
        <div>
            <img src="../assets/img/bunny.jpg" class="">
        </div>
        <formComp/>
    </div>
</main>
<footerComp/>
</template>
<style lang="scss" scoped>
img{
   width: 15em;
   background-size: cover;
}
</style>
