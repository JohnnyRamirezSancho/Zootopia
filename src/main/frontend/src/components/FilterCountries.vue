<script setup> 

import { useCountryStore } from '../stores/storeCountries';
import { onBeforeMount } from 'vue';

const store = useCountryStore();

onBeforeMount(async () => {
  await store.fetchCountries();
})

</script>

<template>
<select class="form-select filter" aria-label="Default select example">
  <option value="all">All countries</option>
  <option :value="country.id" v-for="country in store.Countries" :key="country">{{ country.name }}</option>

</select>

</template>

<style lang="scss" scoped>
.filter{
    background-color: #FB8F6E;
    width: 15vw;
    font-family: Mont;
}


</style>