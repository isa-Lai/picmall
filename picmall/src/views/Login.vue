<template>
  <div style="width: 100%; height: 100vh; overflow: hidden">
    <div style="width: 400px; margin: 40px auto">
      <div style="font-size: 30px; text-align: center; padding: 30px 0">Login</div>
      <el-form ref="form" :model="form" size="normal" :rules="rules">
        <el-form-item prop="username">
          <el-input v-model="form.username" prefix-icon="el-icon-user-solid" placeholder="User Name"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input v-model="form.password" prefix-icon="el-icon-lock"  show-password placeholder="Password"></el-input>
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
import request from "@/utils/request";

export default {
  name: "Login",
  data() {
    return {
      form: {
        username: '',
        password: '',
      },
      rules: {
        username: [
          {
            required: true,
            message: 'Please input name',
            trigger: 'blur',
          },
        ],
        password: [
          {
            required: true,
            message: 'Please input password',
            trigger: 'blur',
          },
        ],
      },
    }
  },
  method:{
    login(){
      //post login request
      request.post("/api/user/login", this.form).then(res => {
        if (res.code === '0') {
          this.$router.push('/home')
        }
      })
    }
  },
}
</script>

<style scoped>

</style>