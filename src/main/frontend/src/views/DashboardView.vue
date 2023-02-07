<script setup>
import cardDashboard from "../components/DashboardComponents/cardDashboard.vue";
import counterAnimals from "../components/DashboardComponents/counterAnimals.vue";
</script>
<template>
<main class="container">
    <div class="d-flex justify-content-center"><counterAnimals/></div>
    <div class="d-flex justify-content-around flex-wrap">
<cardDashboard/>
<cardDashboard/>
<cardDashboard/>
<cardDashboard/>
<cardDashboard/>
</div>
</main>
</template>