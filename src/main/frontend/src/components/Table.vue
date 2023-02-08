<script setup>
import { useSpecimenStore } from '../stores/storeSpecimens';

import { onBeforeMount } from 'vue';

const store = useSpecimenStore();

onBeforeMount(async () => {
  await store.fetchSpecimens();
  console.log(store.Specimens);
})
</script>

<template>

<div id="bigDiv" class="container">
  <table>
    <thead>
      <tr id="titles">
        <th id="start" class="titles" scope="col"><p>name</p><p>Specie</p><p>Country</p><p>Gender</p><p>Family</p><p>Date of Admission</p></th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="specimen in store.Specimens" :key="specimen">
      <td><p>{{ specimen.name }}</p>
        <p>{{ specimen.specie }}</p>
        <p>{{ specimen.id_country }}</p>
        <p>{{ specimen.id_gender }}</p>
        <p>family</p>
        <p>{{ specimen.date }}</p>
      </td>
      </tr>
    </tbody>
  </table>
</div>

</template>

<style lang="scss" scoped>
#bigDiv{
border:  1px solid #D33C0C;
border-radius: 10px;
width: 90vw;
padding: 0;

  table {
    border-collapse: collapse;
    width: 100%;

    #titles{
      border-radius: 10% 10% 0 0;
    }
    .titles {
      padding: 5px 10px ;
    }
    tbody tr:nth-child(odd) {
      background: #F9DABE;
      td{
        display: grid;
        grid-column: 1fr 1fr 1fr;
        padding: 5px 10px ;
      }
    }
    tbody tr:nth-child(even) {
      background: #fff;
      td{
        padding: 5px 10px ;
      }
    }
    thead {
      background: #D33C0C;
      color: #fff;
      font-size: 18px;
      font-family: Mont;

      #start{
        border-top-left-radius: 5%;
      }

      #end{
        border-top-right-radius: 5%;
      }
    }

  }
}
</style>