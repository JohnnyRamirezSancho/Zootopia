<script setup>

import { useCountryStore } from '../../stores/storeCountries';
import { useSpecieStore } from '../../stores/storeSpecies';
import { useGenderStore } from '../../stores/storeGenders';
import { onBeforeMount } from 'vue';


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
  }

  const payload = JSON.stringify(this.specimen);
  const url = "http://localhost:8080/api/specimens";
  const R = await fetch(url, {
    mode: "no cors",
    method: "POST",
    body: payload,
    headers: { "Content-type": "aplicattion/Json" }
  })
  const response = R;
  if (response) {
    alert("Added " + specimen.name)
  }
  else {
    alert("Error")
  }
}


</script>
<template>
  <form class="row g-3">
    <div class="col-10">
      <label for="inputName" class="form-label ms-2">Nombre</label>
      <input v-model="specimen.name" type="text" class="form-control" id="inputName">
    </div>
    <div class="col-10">
      <label for="inputGender" class="form-label ms-2">Género</label>
      <select v-model="specimen.gender" id="inputState1" class="form-select">
        <option :value="gender.id" v-for="gender in storeGender.Genders" :key="gender">{{ gender.name }}</option>
      </select>
    </div>
    <div class="col-10">
      <label for="inputFamily" class="form-label ms-2">Familia</label>
      <select id="inputState2" class="form-select">
        <option selected></option>
        <option>Cánidos</option>
        <option>Reptiles</option>
        <option>Mustelids</option>
        <option>Leporidae</option>
      </select>
    </div>
    <div class="col-10">
      <label for="inputSpecie" class="form-label ms-2">Especie</label>
      <select v-model="specimen.id_specie" id="inputState3" class="form-select">
        <option :value="specie.id" v-for="specie in storeSpecie.Species" :key="specie">{{ specie.name }}</option>
      </select>
    </div>
    <div class="col-10">
      <label for="inputCountry" class="form-label ms-2">País de origen</label>
      <select v-model="specimen.id_country" id="inputState4" class="form-select">
        <option :value="country.id" v-for="country in store.Countries" :key="country">{{ country.name }}</option>
      </select>
    </div>
    <div class="col-10">
      <label for="inputDate" class="form-label ms-2">Fecha de ingreso</label>
      <input v-model="specimen.date" id="startDate" class="form-control" type="date" />
    </div>

    <div class="col-10 d-flex justify-content-end">
      <button type="reset" class="btn btn-warning" id="resetBtn">Reset</button>
      <button class="btn btn-success" id="addBtn" @click="save()">Add</button>
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