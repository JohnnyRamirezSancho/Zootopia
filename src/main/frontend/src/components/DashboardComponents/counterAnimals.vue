<script setup>

const props = defineProps({
totalSpecimens: {
    type: String,
    default: null
  }
})
</script>
<template>
  <div class="card mb-5 mt-2" id="counter">
    <div class="card-body p-0">
      <table>
        <thead>
          <tr>
            <th id="title">TOTAL ANIMAL COUNT</th>
            <th id="number">{{ totalSpecimens }}</th>
          </tr>
        </thead>
      </table>
    </div>
  </div>
</template>
<style lang="scss" scoped>
#counter {
  border-color: #d33c0c;
  border-width: 0.1em;
}
#title {
  font-size: 2em;
  padding-right: 2em;
  padding-left: 2em;
  color: #d33c0c;
}
#number {
  font-size: 2em;
  font-style: italic;
  padding-left: 1em;
  padding-right: 1em;
  background-color: #d33c0c;
  color: white;
}
</style>
