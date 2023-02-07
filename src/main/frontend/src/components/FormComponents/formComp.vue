<script setup>
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
      <option selected></option>
      <option>Mujer</option>
      <option>No definido</option>
    </select>
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label">Familia</label>
    <select id="inputState" class="form-select">
      <option selected></option>
      <option>Cánidos</option>
      <option>Reptiles</option>
      <option>Mustelids</option>
      <option>Leporidae</option>
    </select>
  </div>
  <div class="col-12">
    <label for="inputAddress2" class="form-label">Especie</label>
    <select id="inputState" class="form-select">
      <option selected></option>
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
    <select id="inputState" class="form-select">
      <option selected></option>
      <option>España</option>
      <option>Canada</option>
      <option>Australia</option>
      <option>India</option>
    </select>
  </div>
  <div class="col-12">
    <label for="inputState" class="form-label">Fecha de ingreso</label>
    <input id="startDate" class="form-control" type="date" />
  </div>
 
  <div class="col-12 d-flex justify-content-end">
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
}
#resetBtn, #addBtn{
margin-left: 4%;
width: 8em;
}
input, select {
  border-color: #D33C0C ;
}

</style>