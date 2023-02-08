<script setup>
import {useFamilyStore} from '../stores/storeFamilies';
import { onBeforeMount } from 'vue';

const store = useFamilyStore();

onBeforeMount(async () => {
  await store.fetchFamilies();
})
</script>

<template>
<select class="form-select filterFamily" aria-label="Default select example">
  <option value="all">All familes</option>
  <option :value="family.id" v-for="family in store.Families" :key="family">{{ family.name }}</option>

</select>


</template>

<style lang="scss" scoped>
.filterFamily{
    background-color: #FB8F6E;
    width: 15vw;
    font-family: Mont;

}


</style>