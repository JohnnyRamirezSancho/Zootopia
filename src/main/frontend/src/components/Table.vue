<script setup>
import ButtonsList from './ButtonsList.vue';
</script>

<template>

<div id="bigDiv" class="container">
  <table>
    <thead>
      <tr id="titles">
        <th id="start" class="titles" scope="col">Nombre<br>Género</th>
        <th class="titles" scope="col">Especie<br>Familia</th>
        <th class="titles" scope="col">País de origen<br>Fecha de ingreso</th>
        <th id="end"></th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Félix<br>Macho</td>
        <td>Pantera negra<br>Felino</td>
        <td>España<br>01/01/2023</td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Flora<br>Hembra</td>
        <td>Tigre blanco<br>Felino</td>
        <td>Índia<br>02/01/2023</td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Félix<br>Macho</td>
        <td>Pantera negra<br>Felino</td>
        <td>España<br>01/01/2023</td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Flora<br>Hembra</td>
        <td>Tigre blanco<br>Felino</td>
        <td>Índia<br>02/01/2023 </td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Félix<br>Macho</td>
        <td>Pantera negra<br>Felino</td>
        <td>España<br>01/01/2023</td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Flora<br>Hembra</td>
        <td>Tigre blanco<br>Felino</td>
        <td>Índia<br>02/01/2023 </td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Félix<br>Macho</td>
        <td>Pantera negra<br>Felino</td>
        <td>España<br>01/01/2023</td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Flora<br>Hembra</td>
        <td>Tigre blanco<br>Felino</td>
        <td>Índia<br>02/01/2023 </td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Félix<br>Macho</td>
        <td>Pantera negra<br>Felino</td>
        <td>España<br>01/01/2023</td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
      <tr>
        <td>Flora<br>Hembra</td>
        <td>Tigre blanco<br>Felino</td>
        <td>Índia<br>02/01/2023 </td>
        <td><ButtonsList></ButtonsList></td>
      </tr>
    </tbody>
  </table>
</div>

</template>

<style lang="scss" scoped>
#bigDiv{
border:  1px solid #D33C0C;
border-radius: 10px;
width: 90vw;
padding: 0;

  table {
    border-collapse: collapse;
    width: 100%;

    #titles{
      border-radius: 10% 10% 0 0;
    }
    .titles {
      padding: 5px 10px ;
    }
    tbody tr:nth-child(odd) {
      background: #F9DABE;
      td{
        padding: 5px 10px ;
      }
    }
    tbody tr:nth-child(even) {
      background: #fff;
      td{
        padding: 5px 10px ;
      }
    }
    thead {
      background: #D33C0C;
      color: #fff;
      font-size: 18px;
      font-family: Mont;

      #start{
        border-top-left-radius: 5%;
      }

      #end{
        border-top-right-radius: 5%;
      }
    }

  }
}
</style>