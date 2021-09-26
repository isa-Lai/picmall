<template>
  <el-config-provider>
    <router-view />
  </el-config-provider>
</template>

<script>
import { ElConfigProvider } from 'element-plus'


export default {
  name: "App",
  components: {
    [ElConfigProvider.name]: ElConfigProvider,
  },
}
</script>
