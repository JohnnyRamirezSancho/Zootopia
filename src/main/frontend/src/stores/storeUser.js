import { defineStore } from "pinia";

export const useUserStore = defineStore({
  id: "Users",
  state: () => ({
    Users: [],
  }),
  actions: {
    async fetchUsers() {
      const response = await fetch(
        "http://localhost:8080/api/users"
      );
      const data = await response.json();

      this.Users = data;
    },
  },
});