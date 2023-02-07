<script setup>
</script>
<template>
<div class="card mb-3 mt-2"  id="cardComponent">
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
      <td>Gatos</td>
      <td>12</td>
    </tr>
    <tr>
      <td>Centro comercial</td>
      <td>Francisco Chang</td>
    </tr>
    <tr>
      <td>Ernst Handel</td>
      <td>Roland Mendel</td>
    </tr>
    <tr>
      <td>Island Trading</td>
      <td>Helen Bennett</td>
    </tr>
    <tr>
      <td>Laughing Bacchus</td>
      <td>Yoshi Tannamuri</td>
    </tr>
    <tr>
      <td>Magazzini Alimentari</td>
      <td>Giovanni Rovelli</td>
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
}
#recountNumb{
  background-color: #D33C0C;
  color: white;
  font-size: 1.5em;
  text-align: center;
  font-style: italic;
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
</style>