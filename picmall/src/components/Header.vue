<template>
  <div class="header_link">
    <el-link type="primary" href="/home" >PicMall</el-link>
    <el-link href="/category" >
      <el-dropdown>
    <span class="el-dropdown-link">
      Categories
    </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item>Photo</el-dropdown-item>
            <el-dropdown-item>Drawing</el-dropdown-item>
            <el-dropdown-item>Design</el-dropdown-item>
            <el-dropdown-item divided>More Categories</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </el-link>
    <el-link href="/dashboard" >Sell Your Pic</el-link>
    <el-link href="/about" >About</el-link>
  </div>
  <div class="user_info">
    <el-link href="/register" >Register</el-link>
    <el-link href="/login" >Log in</el-link>
  <el-dropdown>
    <span class="el-dropdown-link">
      Menu<i class="el-icon-arrow-down el-icon--right"></i>
    </span>
    <template #dropdown>
      <el-dropdown-menu>
        <el-dropdown-item @click="$router.push('/dashboard/setting')">Profile</el-dropdown-item>
        <el-dropdown-item @click="$router.push('/dashboard/overview')">Dashboard</el-dropdown-item>
        <el-dropdown-item>Logout</el-dropdown-item>
      </el-dropdown-menu>
    </template>
  </el-dropdown>
  </div>
</template>

<script>
import { ElMessageBox, ElMessage } from 'element-plus'
export default {
  name: "Header",

}

</script>

<style scoped>
.el-link{
  margin-right: 25px;
  font-size: 20px;
}
.el-dropdown-link{
  font-size: 20px;
}
.header_link{
  display: inline;
}
.user_info{
  float:right;
  padding: 0;
}
</style>