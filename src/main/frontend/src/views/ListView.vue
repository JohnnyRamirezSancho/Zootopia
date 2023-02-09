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
    <div class="conteiner" id="pagination">
      <nav>
        <ul class="pagination">
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
              <span id="links" aria-hidden="true">&laquo;</span>
            </a>
          </li>
          <li class="page-item">
            <a class="page-link" id="links" href="#">1</a>
          </li>
          <li class="page-item">
            <a class="page-link" id="links" href="#">2</a>
          </li>
          <li class="page-item">
            <a class="page-link" id="links" href="#">3</a>
          </li>
          <li class="page-item">
            <a class="page-link" id="links" href="#">4</a>
          </li>
          <li class="page-item">
            <a class="page-link" id="links" href="#">5</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
              <span id="links" aria-hidden="true">&raquo;</span>
            </a>
          </li>
        </ul>
      </nav>
    </div>
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
