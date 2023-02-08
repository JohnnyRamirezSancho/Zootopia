<script setup>
import cardDashboard from "../components/DashboardComponents/cardDashboard.vue";
import counterAnimals from "../components/DashboardComponents/counterAnimals.vue";
import FooterComp from "../components/footerComp.vue";
import HeaderComp from "../components/headerComp.vue";
</script>
<template>
  <HeaderComp />
  <main class="container">
    <div class="d-flex justify-content-center">
      <counterAnimals :totalSpecimens="14" />
    </div>
    <div class="d-flex justify-content-around flex-wrap gap-5">
      <cardDashboard />
      <cardDashboard />
      <cardDashboard />
      <cardDashboard />
      <cardDashboard />
    </div>
  </main>
  <FooterComp />
</template>
