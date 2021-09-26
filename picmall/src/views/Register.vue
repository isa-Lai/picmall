<template>
  <div style="width: 100%; height: 100vh; overflow: hidden">
    <div style="width: 400px; margin: 40px auto">
      <div style="font-size: 30px; text-align: center; padding: 30px 0">Register</div>
      <el-form ref="form" :model="form" size="normal" :rules="rules">
        <el-form-item prop="username">
          <el-input prefix-icon="el-icon-user-solid" placeholder="User Name"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input prefix-icon="el-icon-lock"  show-password placeholder="Password"></el-input>
        </el-form-item>
        <el-form-item prop="repeat_password">
          <el-input prefix-icon="el-icon-lock"  show-password placeholder="Repeat Password"></el-input>
        </el-form-item>
        <el-form-item prop="referral_code">
          <el-input prefix-icon="el-icon-lock"  show-password placeholder="Referral Code"></el-input>
        </el-form-item>
        <el-form-item prop="info">
          This demo is currently not open for free registration, see
          <el-popover
              placement="top-start"
              title="Code"
              :width="100"
              trigger="hover"
              content="1234"
          >
            <template #reference>
              <el-button>referral code</el-button>
            </template>
          </el-popover>
          here for a 3-day test account.
        </el-form-item>
        <el-form-item>
          <el-popover
          placement="top-start"
          title="Note"
          :width="350"
          trigger="hover"
          content="New account is only for demo,it will be unavailable in 3 days after registration."
          >
          <template #reference>
            <el-button style="width: 100%" type="primary" @click="register">Register</el-button>
          </template>
          </el-popover>
        </el-form-item>
        <el-form-item><el-button type="text" @click="$router.push('/login')">Already have an account? Go to Login>></el-button></el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  name: "Register"
}
</script>

<style scoped>

</style>