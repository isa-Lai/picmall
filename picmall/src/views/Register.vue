<template>
  <div style="width: 100%; height: 100vh; overflow: hidden">
    <div style="width: 400px; margin: 40px auto">
      <div style="font-size: 30px; text-align: center; padding: 30px 0">Register</div>
      <el-form ref="form" :model="form" size="normal" :rules="rules">
        <el-form-item prop="username">
          <el-input v-model="form.username" prefix-icon="el-icon-user-solid" placeholder="User Name"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input v-model="form.password" prefix-icon="el-icon-lock"  show-password placeholder="Password"></el-input>
        </el-form-item>
        <el-form-item prop="repeatPassword">
          <el-input v-model="form.repeatPassword" prefix-icon="el-icon-lock"  show-password placeholder="Repeat Password"></el-input>
        </el-form-item>
        <el-form-item prop="referralCode">
          <el-input v-model="form.referralCode" prefix-icon="el-icon-lock"  show-password placeholder="Referral Code"></el-input>
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
  <div>
    <el-dialog
        v-model="dialogVisible"
        title="Tips"
        width="30%"
    >
      <span>Create Account Success, Go to log in.</span>
      <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogVisible = false">Later</el-button>
        <el-button type="primary" @click="$router.push('/login')"
        >Log In</el-button
        >
      </span>
      </template>
    </el-dialog>
  </div>
</template>

<script>
import request from "@/utils/request";

export default {
  name: "Register",
  data() {
    //check password
    const validatePass = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('Please input the password'))
      } else {
        if (this.form.repeatPassword !== '') {
          this.$refs.ruleForm.validateField('checkPass')
        }
        callback()
      }
    }
    //check repeating password
    const validatePass2 = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('Please input the password again'))
      } else if (value !== this.form.password) {
        callback(new Error("Two inputs don't match!"))
      } else {
        callback()
      }
    }
    //check referral code
    const checkCode = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('Please input the referral code'))
      } else if (value !== '1234') {
        callback(new Error("Referral Code Wrong"))
      } else {
        callback()
      }
    }
    return {
      dialogVisible : false,
      form: {
        username: '',
        password: '',
        repeatPassword: '',
        referralCode: '',
      },
      rules: {
        username: [
          {
            required: true,
            message: 'Please input name',
            trigger: 'blur',
          },
        ],
        password: [{ validator: validatePass, trigger: 'blur' }],
        repeatPassword: [{ validator: validatePass2, trigger: 'blur' }],
        referralCode: [{ validator: checkCode, trigger: 'blur' }],
      },
    }
  },
  methods:{
    register(){
      //post register request
      request.post("/api/user/register", this.form).then(res => {
        if (res.code === '0') {
          this.dialogVisible=true;
        }
      })
    },
  }
}
</script>

<style scoped>

</style>