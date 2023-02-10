<script setup>
import { useSpecimenStore } from "../stores/storeSpecimens";
import { useFamilyStore } from "../stores/storeFamilies";
import { useSpecieStore } from "../stores/storeSpecies";
import { useGenderStore } from "../stores/storeGenders";
import { useCountryStore } from "../stores/storeCountries";

import { onBeforeMount } from "vue";

const store = useSpecimenStore();
const storeFamily = useFamilyStore();
const storeSpecie = useSpecieStore();
const storeGender = useGenderStore();
const storeCountry = useCountryStore();

onBeforeMount(async () => {
  await store.fetchSpecimens();
  await storeFamily.fetchFamilies();
  await storeSpecie.fetchSpecies();
  await storeGender.fetchGenders();
  await storeCountry.fetchCountries();
});

function returnGenderName(idGender) {
  let gender = storeGender.Genders.filter(function (gender) {
    return gender.id == idGender;
  });
  let genderName = gender[0].name;
  return genderName;
}

function returnSpecieName(idSpecie) {
  let specie = storeSpecie.Species.filter(function (specie) {
    return specie.id == idSpecie;
  });
  let specieName = specie[0].name;
  return specieName;
}


function returnCountryName(idCountry) {
  let country = storeCountry.Countries.filter(function (country) {
    return country.id == idCountry;
  });
  let countryName = country[0].name;
  return countryName;
}

function returnFamilyName(idSpecie) {
  let specie = storeSpecie.Species.filter(function (specie) {
    return specie.id == idSpecie;
  });
  let familyId = specie[0].id_family;
  let family = storeFamily.Families.filter(function (family) {
    return family.id == familyId;
  });
  let familyName = family[0].name;
  return familyName;

  
}

</script>

<template>
  <div id="bigDiv">
    <table>
      <thead>
        <tr id="titles">
          <th id="start" class="titles" scope="col">
            <p>Name</p>
            <p>Specie</p>
            <p>Country</p>
            <p>Gender</p>
            <p>Family</p>
            <p>Date of Admission</p>
          </th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="specimen in store.Specimens" :key="specimen">
          <td>
            <p>{{ specimen.name }}</p>
            <p>{{ returnSpecieName(specimen.id_specie) }}</p>
            <p>{{ returnCountryName(specimen.id_country) }}</p>
            <p>{{ returnGenderName(specimen.id_gender) }}</p>
            <p>{{ returnFamilyName(specimen.id_specie) }}</p>
            <p>{{ specimen.date }}</p>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<style lang="scss" scoped>
#bigDiv {
  border: 1px solid #d33c0c;
  border-radius: 10px;
  padding: 0;
  width: 100%;
  margin: 0;

  table {
    border-collapse: collapse;
    width: 100%;

    #titles {
      border-radius: 10% 10% 0 0;
    }
    .titles {
      padding: 5px 10px;
    }
    tbody tr:nth-child(odd) {
      background: #f9dabe;
      transition: all 0.4s;
      border-radius: 10px;
      td {
        display: grid;
        column-gap: 10px;
        grid-template-columns: 1fr 1fr 1fr;
        padding: 5px 10px;
        border-radius: 10px;
        p {
          margin-bottom: 0;
        }
        p:nth-child(n + 4) {
          font-style: oblique;
        }
      }
    }
    tbody tr:nth-child(odd):hover {
      background: #ccc;
      transform: scale(1.05);
      font-weight: bold;
    }

    tbody tr:nth-child(even) {
      background: #fff;
      transition: all 0.4s;
      border-radius: 10px;
      td {
        display: grid;
        column-gap: 10px;
        grid-template-columns: 1fr 1fr 1fr;
        padding: 5px 10px;
        border-radius: 10px;
        p {
          margin-bottom: 0;
        }
        p:nth-child(n + 4) {
          font-style: oblique;
        }
      }
    }
    tbody tr:nth-child(even):hover {
      background: #ccc;
      transform: scale(1.05);
      font-weight: bold;
    }
    thead {
      background: #d33c0c;
      color: #fff;
      font-size: 18px;
      font-family: Mont;
      border-radius: 5%;
      th {
        display: grid;
        column-gap: 10px;
        grid-template-columns: 1fr 1fr 1fr;
        border-radius: 5%;
        p {
          margin-bottom: 0;
        }
        p:nth-child(n + 4) {
          font-style: oblique;
        }
      }
    }
  }
}
</style>
