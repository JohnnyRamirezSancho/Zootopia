<script setup>

import { useCountryStore } from '../../stores/storeCountries';
import { useSpecieStore } from '../../stores/storeSpecies';
import { useGenderStore } from '../../stores/storeGenders';
import { onMounted, onBeforeMount } from 'vue';


const store = useCountryStore();
const storeSpecie = useSpecieStore();
const storeGender = useGenderStore();
onBeforeMount(async () => {
  await store.fetchCountries();
  await storeSpecie.fetchSpecies();
  await storeGender.fetchGenders();
})


let specimen = {
  name: "",
  id_gender: "",
  id_country: "",
  id_specie: "",
  date: "",
}

async function save() {

  if (
    specimen.name == "") {
    alert("Name is needed")
    return
  }
  if (
    specimen.date == "") {
    alert("Date is needed")
    return
  }
  if (
    specimen.id_specie == "") {
    alert("Specie is needed")
    return
  }
  if (
    specimen.id_country == "") {
    alert("Country is needed")
    return
  }
  if (
    specimen.id_gender == "") {
    alert("Gender is needed")
    return
  }

  const payload = JSON.stringify(this.specimen);
  const url = "http://localhost:8080/api/specimens";
  const r = await fetch(url, {
    method: "POST",
    body: payload,
    headers: {
      "Content-type": "application/json",
    }
  });
  const response = r;
  if (response) {
    alert("Added " + specimen.name);
    resetForm();
  } else {
    alert("An error has occurred.\nPlease try again after a few minutes.");
  }
}

function resetForm(){
  document.getElementById("addSpecimen").reset();
}

</script>
<template>
  <form class="row g-3" id="addSpecimen">
    <div class="col-10">
      <label for="inputName" class="form-label ms-2">Nombre</label>
      <input v-model="specimen.name" type="text" class="form-control" id="inputName">
    </div>
    <!-- <div class="col-10">
      <label for="inputFamily" class="form-label ms-2">Familia</label>
      <select id="inputState2" class="form-select">
        <option selected></option>
        <option>Cánidos</option>
        <option>Reptiles</option>
        <option>Mustelids</option>
        <option>Leporidae</option>
      </select>
    </div> -->
    <div class="col-10">
      <label for="inputGender" class="form-label ms-2">Género</label>
      <select v-model="specimen.id_gender" id="inputGender" class="form-select">
        <option selected value="">Select a gender</option>
        <option :value="gender.id" v-for="gender in storeGender.Genders" :key="gender">{{ gender.name }}</option>
      </select>
    </div>
    <div class="col-10">
      <label for="inputSpecie" class="form-label ms-2">Especie</label>
      <select v-model="specimen.id_specie" id="inputSpecie" class="form-select">
        <option selected value="">Select a specie</option>
        <option :value="specie.id" v-for="specie in storeSpecie.Species" :key="specie">{{ specie.name }}</option>
      </select>
    </div>
    <div class="col-10">
      <label for="inputCountry" class="form-label ms-2">País de origen</label>
      <select v-model="specimen.id_country" id="inputCountry" class="form-select">
        <option selected value="">Select a country</option>
        <option :value="country.id" v-for="country in store.Countries" :key="country">{{ country.name }}</option>
      </select>
    </div>
    <div class="col-10">
      <label for="inputDate" class="form-label ms-2">Fecha de ingreso</label>
      <input v-model="specimen.date" id="startDate" class="form-control" type="date" />
    </div>

    <div class="col-10 d-flex justify-content-end">
      <button type="reset" class="btn btn-warning" id="resetBtn">Reset</button>
      <button type="button" class="btn btn-success" id="addBtn" @click="save()">Add</button>
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

  font-family: Mont;
  src: url(../../assets/fonts/MontserratAlternates-Bold.ttf);
}

form {
  font-family: Mont;
  margin-left: 50px;
}

#resetBtn,
#addBtn {
  margin-left: 4%;
  width: 8em;
}

input,
select {
  border-color: #D33C0C;

}

form {
  font-family: Mont;
}
</style>