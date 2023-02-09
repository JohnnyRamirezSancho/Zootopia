import { defineStore } from "pinia";

export const useFamilyStore = defineStore({
  id: "Families",
  state: () => ({
    Families: [],
  }),
  actions: {
    async fetchFamilies() {
      const response = await fetch(
        "http://localhost:8080/api/families"
      );
      const data = await response.json();

      this.Families = data;

     
    
    },
  },
});