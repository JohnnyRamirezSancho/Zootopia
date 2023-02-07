<script setup>
import ListView from './views/ListView.vue';
import { RouterLink, RouterView } from 'vue-router'
import AddView from './views/AddView.vue';
</script>

<template>

  <ListView></ListView>
  <header>
    <div class="wrapper">
    </div>
  </header>
  <AddView/>
  <RouterView />
</template>

<style scoped>
</style>
