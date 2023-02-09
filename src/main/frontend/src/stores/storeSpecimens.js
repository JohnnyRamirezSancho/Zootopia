import { defineStore } from "pinia";

export const useSpecimenStore = defineStore({
  id: "Specimens",
  state: () => ({
    Specimens: [],
  }),
  actions: {
    async fetchSpecimens() {
      const response = await fetch(
        "http://localhost:8080/api/specimens"
      );
      const data = await response.json();

      this.Specimens = data;

     
    
    },
  },
});