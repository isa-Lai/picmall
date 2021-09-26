<template>
  <div style="width: 100%; height: 100vh; overflow: hidden">
    <div style="width: 400px; margin: 40px auto">
      <div style="font-size: 30px; text-align: center; padding: 30px 0">Login</div>
      <el-form ref="form" :model="form" size="normal" :rules="rules">
        <el-form-item prop="username">
          <el-input prefix-icon="el-icon-user-solid" placeholder="User Name"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input prefix-icon="el-icon-lock"  show-password placeholder="Password"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button style="width: 100%" type="primary" @click="login">Log In</el-button>
        </el-form-item>
        <el-form-item><el-button type="text" @click="$router.push('/register')">New to PicMall? Go to Register >></el-button></el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  name: "Login"
}
</script>

<style scoped>

</style>