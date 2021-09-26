<template>
  <div class="home">
    <el-row>
      <el-col :span="24" ><el-carousel height="60vh" >
        <el-carousel-item v-for="item in 4" :key="item">
          <h3 class="small">{{ item }}</h3>
        </el-carousel-item>
      </el-carousel>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="24"><div class="search" style="margin-left: 30%"><el-input
          v-model="input2"
          placeholder="Enter Tag or Keyword"
          prefix-icon="el-icon-search"
          style="width: 40%"
      />
        <el-button type="primary" icon="el-icon-search">Search</el-button></div>
      </el-col>
    </el-row>
    <div class="showcase">
      <el-card :body-style="{ padding: '0px', marginBottom: '1px' }">
        <img
            src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
            class="image"
        />
        <div style="padding: 14px">
          <span>Delicious hamberger</span>
          <div class="bottom card-header">
            <span class="time">{{ currentDate }}</span>
            <el-button type="text" class="button">Buy</el-button>
          </div>
        </div>
      </el-card>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: 'Home',
  components: {
  }
}
</script>
<style>
.el-card{
  width: 30%;
}
.el-row {
  margin-bottom: 40px;
}
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 150px;
  margin: 0;
  text-align: center;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
  background-color: #d3dce6;
}
</style>
