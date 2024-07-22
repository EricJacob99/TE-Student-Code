<template>
  <div class="main">
    <the-header />
    <product-review />
  </div>
</template>

<script>
import ProductReview from './components/ProductReview.vue';
import TheHeader from './components/TheHeader.vue';

export default {
  components: {
    ProductReview,
    TheHeader
  }
}
</script>

<style>
.main {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  max-width: 800px;
  margin: 60px auto 0 auto;
}
</style>
