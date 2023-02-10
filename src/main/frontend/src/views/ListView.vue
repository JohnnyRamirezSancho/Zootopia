<script setup>
import FilterFamily from "../components/FilterFamily.vue";
import FilterCountries from "../components/FilterCountries.vue";
import Table from "../components/Table.vue";
import headerComp from "../components/headerComp.vue";
import footerComp from "../components/footerComp.vue";
</script>

<template>
  <headerComp />
  <main>
    <div id="filter">
      <FilterFamily></FilterFamily>
      <FilterCountries></FilterCountries>
    </div>
    <Table></Table>
    
  </main>
  <footerComp />
</template>

<style lang="scss" scoped>
@font-face {
  font-family: Monts;
  src: url(../assets/fonts/MontserratAlternates-Regular.ttf);
}

main {
  padding: 0 50px;
  width: 100%;
  #filter {
    display: flex;
    justify-content: end;
    margin: 2rem auto;
  }
  
  #pagination {
    display: flex;
    justify-content: center;
    background-color: none;
    color: #d33c0c;
    margin: 2rem;
    
    #links {
      color: #d33c0c;
    }
  }
}
</style>
