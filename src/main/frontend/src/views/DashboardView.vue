<script setup>
import cardDashboard from "../components/DashboardComponents/cardDashboard.vue";
import counterAnimals from "../components/DashboardComponents/counterAnimals.vue";
import FooterComp from "../components/footerComp.vue";
import HeaderComp from "../components/headerComp.vue";
import { useSpecimenStore } from "../stores/storeSpecimens";
import { useFamilyStore } from "../stores/storeFamilies";

import { onBeforeMount } from "vue";

const store = useSpecimenStore();
const storeFamily = useFamilyStore();
onBeforeMount(async () => {
  await store.fetchSpecimens();
  await storeFamily.fetchFamilies();
});
function totalSpecimens() {
  return store.Specimens.length;
}
</script>
<template>
  <HeaderComp />
  <main class="container">
    <div class="d-flex justify-content-center">
    
      <counterAnimals :totalSpecimens="totalSpecimens()" />
    </div>
    <div class="d-flex justify-content-around flex-wrap gap-5">
   
     <cardDashboard v-for="family in storeFamily.Families" :key="family" :familyId="family.id"/>
    </div>
  </main>
  <FooterComp />
</template>
