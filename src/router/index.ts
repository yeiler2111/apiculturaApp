import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component:  () => import('@/views/login/layout.vue')

  },
  {
    path: '/administrator',
    name: 'dashboardAdmin',
    component:  () => import('@/views/dashboard/administrator/layout.vue')
  },
  {
    path: '/apicultor',
    name: 'dashboardApicultor',
    component:  () => import('@/views/dashboard/apicultor/layout.vue')
  },
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
