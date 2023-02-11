<script setup>
import { useFamilyStore } from "../../stores/storeFamilies";
import { useSpecieStore } from "../../stores/storeSpecies"
import { useSpecimenStore } from "../../stores/storeSpecimens"
import { onBeforeMount } from "vue";

const store = useSpecimenStore();
const storeFamily = useFamilyStore();
const storeSpecie = useSpecieStore();
onBeforeMount(async () => {
  await store.fetchSpecimens();
  await storeFamily.fetchFamilies();
  await storeSpecie.fetchSpecies();
});

const props = defineProps({
  familyId: {
    type: Number,
    default: 1
  }
})

function returnFamilyName(familyId) {
  let family = storeFamily.Families.filter(function (family) {
    return family.id == familyId;
  });
  let familyName = family[0].name;
  return familyName;
}

function returnFamilyCount(familyId) {
  let specie = storeSpecie.Species.filter(function (specie) {
    return specie.id_family == familyId;
  });
  
  let count = 0;
  specie.forEach(specieItem => {
    let specimenBySpecie = store.Specimens.filter(function (specimenBySpecie) {
      return specimenBySpecie.id_specie == specieItem.id;
    });
    let specimensItems = specimenBySpecie.length;
    console.log(specimensItems);
    count += specimensItems;
  });
  return count;
  };

function returnSpecieByFamily(familyId) {
  let specieByFamily = storeSpecie.Species.filter(function (specieByFamily) {
    return specieByFamily.id_family == familyId;
  });
  return specieByFamily;
}

function returnSpecieCount(specieId) {
  let specimenBySpecie = store.Specimens.filter(function (specimenBySpecie) {
    return specimenBySpecie.id_specie == specieId;
  });
  let specieCount = specimenBySpecie.length;
  return specieCount;
}


</script>

<template>
  <div class="card">
    <div class="card-body p-0 overflow-auto">
      <table>
        <thead>
          <tr>
            <th id="family">{{ returnFamilyName(familyId) }}</th>
            <th id="recountNumb">{{ returnFamilyCount(familyId) }}</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="specie in returnSpecieByFamily(familyId)">
            <td class="ps-4">{{ specie.name }}</td>
            <td class="text-end pe-4">{{ returnSpecieCount(specie.id) }}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.card {
  width: 20vw;
  height: 25.188rem;
  border-color: #d33c0c;
  border-width: 0.2em;
  border-radius: 1em;
}
#family {
  color: #d33c0c;
  font-size: 2em;
  padding: 0.4em;
}
#recountNumb {
  background-color: #d33c0c;
  color: white;
  font-size: 1.5em;
  text-align: center;
  font-style: italic;
  border-top-right-radius: 10px;
}
table tbody tr:nth-child(odd) {
  background: #f9dabe;
}
table tbody tr:nth-child(even) {
  background: #ffffff;
}

table {
  border-collapse: collapse;
  width: 100%;
}
td {
  font-weight: bold;
  padding: 0.4em;
}

@media (max-width:1440px) {
  .card {
    width: 25vw;
  }
}
@media (max-width:1200px) {
  .card {
    width: 30vw;
  }
}
@media (max-width:900px) {
  .card {
    width: 100%;
  }
}
</style>
