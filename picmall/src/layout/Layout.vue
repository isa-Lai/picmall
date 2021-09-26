<template>
  <div>
    <el-container>
      <el-header><Header/></el-header>
      <el-main><router-view style="flex: 1"/></el-main>
      <el-footer><Footer/></el-footer>
    </el-container>
  </div>
</template>


<script>
import Header from "@/components/Header";
import Footer from "@/components/Footer";

export default {
  name: "Layout",
  components: {
    Header,
    Footer
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