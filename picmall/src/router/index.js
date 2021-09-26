import { createRouter, createWebHistory } from 'vue-router';
import Layout from '../layout/Layout.vue';

const routes = [
  {
    path: '/',
    name: 'Layout',
    component: Layout,
    redirect: "/home",
    children: [
      {
        path: 'home',
        name: 'Home',
        component: () => import("@/views/Home"),
      },
      {
        path: 'about',
        name: 'About',
        component: () => import("@/views/About"),
      },
      {
        path: 'login',
        name: 'Login',
        component: () => import("@/views/Login"),
      },
      {
        path: 'register',
        name: 'Register',
        component: () => import("@/views/Register"),
      },
      {
        path: '/dashboard/',
        name: 'Dashboard',
        component: () => import("@/views/Dashboard"),
        redirect: "/dashboard/overview",
        children: [
          {
            path: 'overview',
            name: 'Overview',
            component: () => import("@/views/manage/Overview"),
          },
          {
            path: 'order',
            name: 'Order',
            component: () => import("@/views/manage/Order"),
          },
          {
            path: 'query',
            name: 'Query',
            component: () => import("@/views/manage/Query"),
          },
          {
            path: 'addnew',
            name: 'AddNew',
            component: () => import("@/views/manage/AddNew"),
          },
          {
            path: 'setting',
            name: 'Setting',
            component: () => import("@/views/manage/Setting"),
          },
        ]

      },
    ]
  },

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
