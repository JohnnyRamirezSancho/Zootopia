<script setup>
import { useCountryStore } from '../../stores/storeCountries';
import { onBeforeMount } from 'vue';

const store = useCountryStore();
onBeforeMount(async () => {
  await store.fetchCountries();
})
</script>
<template>
  <form class="row g-3">
    <div class="col-12">
      <label for="inputEmail4" class="form-label">Nombre</label>
      <input type="email" class="form-control" id="inputEmail4">
    </div>
    <div class="col-12">
      <label for="inputPassword4" class="form-label">Género</label>
      <select id="inputState" class="form-select">
        <option selected>Hombre</option>
        <option>Mujer</option>
        <option>No definido</option>
      </select>
    </div>
    <div class="col-12">
      <label for="inputAddress" class="form-label">Familia</label>
      <select id="inputState" class="form-select">
        <option selected>Félidos</option>
        <option>Cánidos</option>
        <option>Reptiles</option>
        <option>Mustelids</option>
        <option>Leporidae</option>
      </select>
    </div>
    <div class="col-12">
      <label for="inputAddress2" class="form-label">Especie</label>
      <select id="inputState" class="form-select">
        <option>Leon</option>
        <option>Zorro</option>
        <option>Serpientes</option>
        <option>Iguanas</option>
        <option>Conejos</option>
        <option>Liebres</option>
        <option>Chacales</option>
      </select>
    </div>
    <div class="col-12">
      <label for="inputCity" class="form-label">País de origen</label>
      <select id="inputState" class="form-select" >
        <option value="" v-for="country in store.Countries.results" :key="country"></option>
      </select>
    </div>
    <div class="col-12">
      <label for="inputState" class="form-label">Fecha de ingreso</label>
      <select id="inputState" class="form-select">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>

    <div class="col-12">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </form>
</template>
<style lang="scss" scoped>
@font-face {
  font-family: Title;
  src: url(../../assets/fonts/Zootopia\ JPosters.com.ar.otf);
}

@font-face {
  font-family: Mont;
  src: url(../../assets/fonts/MontserratAlternates-Bold.ttf);
}

form {
  font-family: Mont;
}
</style>