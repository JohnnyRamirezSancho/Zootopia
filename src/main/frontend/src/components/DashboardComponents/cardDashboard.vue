<script setup>
</script>
<template>
<div class="card "  id="cardComponent">
  <div class="card-body p-0 overflow-auto">
    <table>
  <thead>
    <tr>
      <th id="family">Felinos</th>
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
#cardComponent{
  width: 20.625rem;
  height: 25.188rem;
  border-color: #D33C0C;
  border-width: 0.2em;
  border-radius: 1em;
}
#family{
  color: #D33C0C;
  font-size:2em;
  padding: 0.4em;
}
#recountNumb{
  background-color: #D33C0C;
  color: white;
  font-size: 1.5em;
  text-align: center;
  font-style: italic;
  border-top-right-radius: 10px;
}
table tbody tr:nth-child(odd) {
	background: #F9DABE;
}
table tbody tr:nth-child(even) {
	background: #ffffff;
}

table {
  border-collapse: collapse;
  width: 100%;
}
td{
  font-weight: bold;
  padding: 0.4em;
}
</style>