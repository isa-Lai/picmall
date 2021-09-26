<template>
  <el-menu
      default-active="2"
      class="el-menu-vertical-demo"
      style="height: calc(100vh - 60px - 50px)"
  >
    <el-menu-item index="1" @click="$router.push('/dashboard/overview')">
      <i class="el-icon-location"></i>
      <span>Overview</span>
    </el-menu-item>
    <el-sub-menu index="2">
      <template #title>
        <i class="el-icon-menu"></i>
        <span>Your Picture</span>
      </template>
      <el-menu-item-group title="Archive">
        <el-menu-item index="2-1" @click="$router.push('/dashboard/addnew')">Add New</el-menu-item>
        <el-menu-item index="2-2" @click="$router.push('/dashboard/query')">Manage</el-menu-item>
      </el-menu-item-group>
    </el-sub-menu>-
    <el-menu-item index="3" @click="$router.push('/dashboard/order')">
      <i class="el-icon-document"></i>
      <span>Your Orders</span>
    </el-menu-item>
    <el-menu-item index="4" @click="$router.push('/dashboard/setting')">
      <i class="el-icon-setting"></i>
      <span>Account Setting</span>
    </el-menu-item>
  </el-menu>
</template>

<script>
export default {
  name: "Aside"
}
</script>

<style scoped>

</style>