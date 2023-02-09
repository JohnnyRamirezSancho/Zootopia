import { defineStore } from "pinia";

export const useGenderStore = defineStore({
  id: "Genders",
  state: () => ({
    Genders: [],
  }),
  actions: {
    async fetchGenders() {
      const response = await fetch(
        "http://localhost:8080/api/genders"
      );
      const data = await response.json();

      this.Genders = data;
    },
  },
});
