<script setup>
import FilterFamily from '../components/FilterFamily.vue';
import FilterCountries from '../components/FilterCountries.vue'
</script>

<template>
<div id="filter">
    <FilterFamily></FilterFamily>
    <FilterCountries></FilterCountries>
</div>

<table class="table" id="table">
  <thead>
    <tr id="titles">
      <th scope="col">Nombre<br>Género</th>
      <th scope="col">Especie<br>Familia</th>
      <th scope="col">País de origen<br>Fecha de ingreso</th>
    </tr>
  </thead>
  <tbody>
    <tr id="orenge">
      <td>Félix<br>Macho</td>
      <td>Pantera negra<br>Felino</td>
      <td>España<br>01/01/2023</td>
    </tr>
    <tr id="white">
      <td>Flora<br>Hembra</td>
      <td>Tigre blanco<br>Felino</td>
      <td>Índia<br>02/01/2023</td>
    </tr>
    <tr id="orange">
      <td>Félix<br>Macho</td>
      <td>Pantera negra<br>Felino</td>
      <td>España<br>01/01/2023</td>
    </tr>
    <tr id="white">
      <td>Flora<br>Hembra</td>
      <td>Tigre blanco<br>Felino</td>
      <td>Índia<br>02/01/2023 </td>
    </tr>
  </tbody>
</table>
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
#table{

thead{
    background-color: #D33C0C;
    font-family: Mont;
}

#orenge{
    background-color: #F9DABE;

}

}

</style>