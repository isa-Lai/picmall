<template>
  <el-container>
    <el-aside width="200px" >
      <Aside/>
    </el-aside>
    <el-main>
        <router-view style="flex: 1"/>
    </el-main>
  </el-container>
</template>

<script>
import Aside from "@/components/Aside";

export default {
  name: "Dashboard",
  components: {
    Aside,
  },
}
</script>

<style scoped>
Header{
  padding-top: 10px;
  position: relative;
}
.el-header{
  height: 50px;
}
</style>