<script setup>
function goInvisible(){
  document.getElementById("alert").classList.add("invisible")
}
</script>
<template>
  <div class="alert alert-warning alert-dismissible fade show invisible" role="alert" id="alert">
    <strong>Error</strong> User and/or password wrong. check your entries.
    <button
      type="button"
      class="btn-close"
      data-bs-dismiss="alert"
      aria-label="Close"
      @click="goInvisible()"
    ></button>
  </div>
</template>
<style>
.invisible{
  display: none;
}
</style>