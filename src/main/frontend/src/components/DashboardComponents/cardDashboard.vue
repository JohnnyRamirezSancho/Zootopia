<script setup>
// import { useFamilyStore } from "../../stores/storeFamilies";
// // import { onBeforeMount } from "vue";

// const storeFamily = useFamilyStore();

// onBeforeMount(async () => {
//   await storeFamily.fetchFamilies();
// });

// const props = defineProps({
//   familyId: {
//     type: Number,
//     default: 1
//   }
// })

// function returnFamilyName(idFamily) {
//   let family = storeFamily.Families.filter(function (family) {
//     return family.id == idFamily;
//   });
//   let familyName = family[0].name;
//   return familyName;
// }
</script>

<template>
  <div class="card">
    <div class="card-body p-0 overflow-auto">
      <table>
        <thead>
          <tr>
            <th id="family">X</th>
            <th id="recountNumb">14</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td class="ps-4">Gatos</td>
            <td class="text-end pe-4">12</td>
          </tr>
          <tr>
            <td class="ps-4">Leopardos</td>
            <td class="text-end pe-4">6</td>
          </tr>
          <tr>
            <td class="ps-4">Leones</td>
            <td class="text-end pe-4">7</td>
          </tr>
          <tr>
            <td class="ps-4">Linces</td>
            <td class="text-end pe-4">9</td>
          </tr>
          <tr>
            <td class="ps-4">Jaguares</td>
            <td class="text-end pe-4">30</td>
          </tr>
          <tr>
            <td class="ps-4">Pumas</td>
            <td class="text-end pe-4">17</td>
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
