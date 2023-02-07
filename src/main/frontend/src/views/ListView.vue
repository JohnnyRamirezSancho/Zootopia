<script setup>
import FilterFamily from '../components/FilterFamily.vue';
import FilterCountries from '../components/FilterCountries.vue'
import Table from '../components/Table.vue';
</script>

<template>
<div id="filter">
    <FilterFamily></FilterFamily>
    <FilterCountries></FilterCountries>
</div>

<Table></Table>

<div class="conteiner" id="pagination">
  <nav >
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
</div>

</template>

<style lang="scss" scoped>
@font-face {
    font-family: Monts;
    src: url(../assets/fonts/MontserratAlternates-Regular.ttf);
}

#filter{
 display: flex;
 justify-content: end;
 margin: 1rem;

}

#pagination{
  display: flex;
  justify-content: center;
  background-color: none;
  color: #D33C0C;
}


</style>