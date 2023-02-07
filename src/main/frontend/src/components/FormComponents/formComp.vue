<script setup>

</script>
<template>
<form class="row g-3">
  <div class="col-10">
    <label for="inputName" class="form-label ms-2">Nombre</label>
    <input type="text" class="form-control" id="inputName">
  </div>
  <div class="col-10">
    <label for="inputGender" class="form-label ms-2">Género</label>
    <select id="inputState1" class="form-select">
      <option selected></option>
      <option>Mujer</option>
      <option>No definido</option>
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
    <select id="inputState3" class="form-select">
      <option selected></option>
      <option>Zorro</option>
      <option>Serpientes</option>
      <option>Iguanas</option>
      <option>Conejos</option>
      <option>Liebres</option>
      <option>Chacales</option>
    </select>
  </div>
  <div class="col-10">
    <label for="inputCountry" class="form-label ms-2">País de origen</label>
    <select id="inputState4" class="form-select">
      <option selected></option>
      <option>España</option>
      <option>Canada</option>
      <option>Australia</option>
      <option>India</option>
    </select>
  </div>
  <div class="col-10">
    <label for="inputDate" class="form-label ms-2">Fecha de ingreso</label>
    <input id="startDate" class="form-control" type="date" />
  </div>
 
  <div class="col-10 d-flex justify-content-end">
    <button type="reset" class="btn btn-warning" id="resetBtn">Reset</button>
    <button type="submit" class="btn btn-success" id="addBtn">Add</button>
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
form{
    font-family: Mont;
    margin-left: 50px;
}
#resetBtn, #addBtn{
margin-left: 4%;
width: 8em;
}
input, select {
  border-color: #D33C0C ;
}

</style>