import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
// import VueRouter from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/Dashboard',
      name: 'dashboard',
      component: () => import('../views/DashboardView.vue')
    },
    {
      path: '/AddView',
      name: 'addview',
      component: () => import('../views/AddView.vue')
    },
    {
      path: '/ListView',
      name: 'listview',
      component: () => import('../views/ListView.vue')
    },
    {
      path: '/ModifyView',
      name: 'modifyview',
      component: ()=>import('../views/ModifyView.vue')
    }
  ]
})

// const router2 = new VueRouter({
//   routes: [
//     {path: '/', redirect:{name: 'dashboard'}}
//   ]
// })

export default router
